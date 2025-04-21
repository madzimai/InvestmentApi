package com.example.InvestmentAPI.service;

import com.example.InvestmentAPI.model.InvestmentType;
import com.example.InvestmentAPI.repository.InvestmentTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestmentTypeService {
    private final InvestmentTypeRepository repo;

    public InvestmentTypeService(InvestmentTypeRepository repo) {
        this.repo = repo;
    }

    public List<InvestmentType> findAll() {
        return repo.findAll();
    }

    public InvestmentType save(InvestmentType type) {
        return repo.save(type);
    }
}