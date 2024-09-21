package com.wellsfargo.counselor.entity;

import java.util.List;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;



@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @OneToMany(mappedBy = "portfolio", cascade = {CascadeType.ALL})  // Updated here
    private List<Security> securities;

    // Constructor
    public Portfolio() {
        // No-arg constructor for Hibernate
    }

    // Getters and Setters
    public Long getPortfolioId() {
        return portfolioId;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}

