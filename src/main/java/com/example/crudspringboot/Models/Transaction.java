package com.example.crudspringboot.Models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.Instant;

@Table(name = "\"Transaction\"")
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TransactionId", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "OrderId")
    private Order orderId;

    @ManyToOne
    @JoinColumn(name = "WalletId")
    private Wallet walletId;

    @Column(name = "\"Date\"")
    private Instant date;

    @Column(name = "Amount", precision = 19, scale = 4)
    private BigDecimal amount;

    @Column(name = "Description", length = 50)
    private String description;

    @Column(name = "Status", length = 50)
    private String status;

    @Column(name = "TransactionType", length = 50)
    private String transactionType;

    @ManyToOne
    @JoinColumn(name = "UserId")
    private User userId;

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public Wallet getWalletId() {
        return walletId;
    }

    public void setWalletId(Wallet walletId) {
        this.walletId = walletId;
    }

    public Order getOrderId() {
        return orderId;
    }

    public void setOrderId(Order orderId) {
        this.orderId = orderId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}