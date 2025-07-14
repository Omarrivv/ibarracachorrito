package com.bank.customer.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "customers")
public class Customer {
    @Id
    private String id;
    private String documentNumber;
    private String name;
    private String type; // "PERSONAL" o "BUSINESS"
    private String email;
    private String phone;
    private String address;
    // Otros campos relevantes
} 