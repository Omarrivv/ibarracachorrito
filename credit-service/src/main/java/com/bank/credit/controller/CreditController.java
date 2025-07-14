package com.bank.credit.controller;

import com.bank.credit.model.Credit;
import com.bank.credit.service.CreditService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/credits")
@RequiredArgsConstructor
public class CreditController {
    private final CreditService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Credit> create(@RequestBody Credit credit) {
        return service.create(credit);
    }

    @GetMapping
    public Flux<Credit> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Credit> findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public Mono<Credit> update(@PathVariable String id, @RequestBody Credit credit) {
        return service.update(id, credit);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> delete(@PathVariable String id) {
        return service.delete(id);
    }
} 