# 💳 Payment and Transactions Processing System

A Java-based mini banking system that simulates basic account operations such as money transfers and withdrawals between accounts.  
This project demonstrates **object-oriented programming (OOP)** concepts including encapsulation, enums, and transaction management without using advanced collections.

---

## 📘 Project Description

This project focuses on implementing a simple **payment and transaction processing system** using pure Java.  
It allows you to:
- Create accounts with unique IDs.
- Send money between two accounts.
- Withdraw money from an account.
- Maintain a transaction history for each account.

Each transaction is recorded as a `Transaction` object containing details like sender, receiver, amount, and operation type (send, receive, or withdraw).

---

## 🧠 Features

- 🏦 **Account Creation:** Each account is uniquely identified by an ID.  
- 💸 **Money Transfer:** Transfer funds between accounts with dual transaction logging (send and receive).  
- 🏧 **Withdraw Money:** Log withdrawal transactions for any account.  
- 📜 **Transaction Records:** All transactions are stored in a dynamically updated array.  
- ⚙️ **Enum-based Operations:** Cleanly defines transaction types via `StandardAccountOperations`.  
- 💡 **OOP Principles:** Demonstrates encapsulation, classes, static inner classes, and method reuse.

---

## 🧩 Class Overview

### `Account.java`
Handles account-related logic:
- `sendMoneyToAccount(Account accountTo, double moneyAmount)`
- `withdrawMoney(double moneyAmount)`
- `getTransactions()`

### `Transaction` (Inner Class)
Represents a single transaction between accounts.

### `StandardAccountOperations.java`
Enum defining standard operations:
```java
MONEY_TRANSFER_SEND,
MONEY_TRANSFER_RECEIVE,
WITHDRAW
git clone https://github.com/KatyayaniSrivastav/PaymentAndTransacationsProcessing.git
