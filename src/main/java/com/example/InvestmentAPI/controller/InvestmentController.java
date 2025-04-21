package com.example.InvestmentAPI.controller;

import com.example.InvestmentAPI.model.Investment;
import com.example.InvestmentAPI.service.InvestmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/investments")
public class InvestmentController {

    private final InvestmentService service;

    public InvestmentController(InvestmentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Investment> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Investment getById(@PathVariable Long id) {
        return service.findById(id).orElseThrow();
    }

    @PostMapping
    public Investment create(@RequestBody Investment investment) {
        return service.save(investment);
    }

    @PutMapping("/{id}")
    public Investment update(@PathVariable Long id, @RequestBody Investment investment) {
        investment.setId(id);
        return service.save(investment);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}