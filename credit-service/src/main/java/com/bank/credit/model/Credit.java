package com.bank.credit.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "credits")
public class Credit {
    @Id
    private String id;
    private String customerId; // Referencia al cliente
    private String type; // "PERSONAL_LOAN", "BUSINESS_LOAN", "CREDIT_CARD"
    private Double amount;
    private Double balance;
    private Double interestRate;
    private Double creditLimit; // Solo para tarjetas de crédito
    private Boolean active;
    // Otros campos relevantes
} 