package com.example.InvestmentAPI.controller;

import com.example.InvestmentAPI.model.InvestmentType;
import com.example.InvestmentAPI.service.InvestmentTypeService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(InvestmentTypeController.class)
class InvestmentTypeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private InvestmentTypeService service;

    @Test
    void shouldReturnListOfInvestmentTypes() throws Exception {
        when(service.findAll()).thenReturn(List.of(new InvestmentType(1L, "Stocks")));

        mockMvc.perform(get("/api/investment-types"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value("Stocks"));
    }
}