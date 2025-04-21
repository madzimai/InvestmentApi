package com.example.InvestmentAPI.repository;

import com.example.InvestmentAPI.model.InvestmentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestmentTypeRepository extends JpaRepository<InvestmentType, Long> {
}