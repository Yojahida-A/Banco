package org.example.logica;
import java.util.concurrent.atomic.AtomicLong;

public class BankAccount {
    private static final AtomicLong accountNumberGenerator = new AtomicLong(1000000);
    private String accountNumber;
    private double balance;
    //private AccountType accountType;
    private static final double OVERDRAFT_LIMIT = -500.0;




}
