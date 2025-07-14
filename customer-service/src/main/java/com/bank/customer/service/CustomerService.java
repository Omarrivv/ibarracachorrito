package com.bank.customer.service;

import com.bank.customer.model.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerService {
    Mono<Customer> create(Customer customer);
    Flux<Customer> findAll();
    Mono<Customer> findById(String id);
    Mono<Customer> update(String id, Customer customer);
    Mono<Void> delete(String id);
} 