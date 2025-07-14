package com.bank.transaction.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "transactions")
public class Transaction {
    @Id
    private String id;
    private String productId; // ID de cuenta, crédito o tarjeta
    private String productType; // "ACCOUNT", "CREDIT", "CARD"
    private String type; // "DEPOSIT", "WITHDRAWAL", "PAYMENT", "PURCHASE"
    private Double amount;
    private LocalDateTime date;
    private String description;
    private Double balanceAfter;
    // Otros campos relevantes
} 