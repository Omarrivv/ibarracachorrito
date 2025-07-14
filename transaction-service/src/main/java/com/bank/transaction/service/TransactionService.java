package com.bank.transaction.service;

import com.bank.transaction.model.Transaction;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TransactionService {
    Mono<Transaction> create(Transaction transaction);
    Flux<Transaction> findAll();
    Mono<Transaction> findById(String id);
    Mono<Transaction> update(String id, Transaction transaction);
    Mono<Void> delete(String id);
} 