package com.example.InvestmentAPI.repository;

import com.example.InvestmentAPI.model.Investment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestmentRepository extends JpaRepository<Investment, Long> {
}