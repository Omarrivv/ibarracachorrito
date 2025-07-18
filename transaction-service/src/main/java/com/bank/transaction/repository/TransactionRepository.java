package com.bank.transaction.repository;

import com.bank.transaction.model.Transaction;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface TransactionRepository extends ReactiveMongoRepository<Transaction, String> {
} 