package com.bank.credit.service;

import com.bank.credit.model.Credit;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditService {
    Mono<Credit> create(Credit credit);
    Flux<Credit> findAll();
    Mono<Credit> findById(String id);
    Mono<Credit> update(String id, Credit credit);
    Mono<Void> delete(String id);
} 