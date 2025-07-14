package com.bank.account.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "accounts")
public class Account {
    @Id
    private String id;
    private String accountNumber;
    private String type; // "SAVINGS", "CURRENT", "FIXED_TERM"
    private String customerId; // Titular principal (puede ser personal o empresarial)
    private List<String> holders; // Titulares adicionales (solo empresarial)
    private List<String> signers; // Firmantes autorizados (solo empresarial)
    private Double balance;
    private Double maintenanceFee;
    private Integer movementLimit; // Solo para ahorro
    private String allowedMovementDay; // Solo para plazo fijo
    private Boolean active;
    // Otros campos relevantes
} 