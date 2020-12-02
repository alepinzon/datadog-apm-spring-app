package com.example.service;

import com.example.model.Transaction;
import com.example.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction create() {
        final Transaction transaction = new Transaction();
        transaction.setDescription(UUID.randomUUID().toString());

        sleep();

        return transactionRepository.save(transaction);
    }

    private void sleep() {
        long transactionTime = new Random().nextInt(6) * 1000;
        try {
            Thread.sleep(transactionTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
