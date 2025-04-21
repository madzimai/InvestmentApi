package com.example.InvestmentAPI.controller;

import com.example.InvestmentAPI.model.InvestmentType;
import com.example.InvestmentAPI.service.InvestmentTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/investment-types")
public class InvestmentTypeController {

    private final InvestmentTypeService service;

    public InvestmentTypeController(InvestmentTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<InvestmentType> getAll() {
        return service.findAll();
    }

    @PostMapping
    public InvestmentType create(@RequestBody InvestmentType type) {
        return service.save(type);
    }
}