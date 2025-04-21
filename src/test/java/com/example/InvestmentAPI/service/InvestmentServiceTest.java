package com.example.InvestmentAPI.service;

import com.example.InvestmentAPI.model.Investment;
import com.example.InvestmentAPI.repository.InvestmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class InvestmentServiceTest {

    @Mock
    private InvestmentRepository investmentRepository;

    @InjectMocks
    private InvestmentService investmentService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shouldReturnAllInvestments() {
        Investment i1 = new Investment(1L, BigDecimal.TEN, LocalDate.now(), "Buy stock", null);
        when(investmentRepository.findAll()).thenReturn(List.of(i1));

        List<Investment> investments = investmentService.findAll();

        assertThat(investments).hasSize(1);
        verify(investmentRepository, times(1)).findAll();
    }

    @Test
    void shouldReturnInvestmentById() {
        Investment i1 = new Investment(1L, BigDecimal.TEN, LocalDate.now(), "Goal", null);
        when(investmentRepository.findById(1L)).thenReturn(Optional.of(i1));

        Optional<Investment> result = investmentService.findById(1L);

        assertThat(result).isPresent();
    }
}