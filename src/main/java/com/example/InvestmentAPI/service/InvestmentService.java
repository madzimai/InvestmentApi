package com.example.InvestmentAPI.service;

import com.example.InvestmentAPI.model.Investment;
import com.example.InvestmentAPI.repository.InvestmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvestmentService {
    private final InvestmentRepository repo;

    public InvestmentService(InvestmentRepository repo) {
        this.repo = repo;
    }

    public List<Investment> findAll() {
        return repo.findAll();
    }

    public Optional<Investment> findById(Long id) {
        return repo.findById(id);
    }

    public Investment save(Investment investment) {
        return repo.save(investment);
    }

    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
