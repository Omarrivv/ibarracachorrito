package com.bank.account.service;

import com.bank.account.model.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountService {
    Mono<Account> create(Account account);
    Flux<Account> findAll();
    Mono<Account> findById(String id);
    Mono<Account> update(String id, Account account);
    Mono<Void> delete(String id);
} 