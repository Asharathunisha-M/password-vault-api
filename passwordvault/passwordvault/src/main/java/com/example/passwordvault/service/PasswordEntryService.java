package com.example.passwordvault.service;
import com.example.passwordvault.model.PasswordEntry;
import com.example.passwordvault.repository.PasswordEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PasswordEntryService {

    @Autowired
    private PasswordEntryRepository repository;

    public List<PasswordEntry> getAllEntries() {
        return repository.findAll();
    }

    public PasswordEntry getEntryById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public PasswordEntry saveEntry(PasswordEntry entry) {
        return repository.save(entry);
    }

    public void deleteEntry(Long id) {
        repository.deleteById(id);
    }
}
