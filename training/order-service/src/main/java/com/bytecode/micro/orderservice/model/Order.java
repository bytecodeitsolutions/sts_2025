package com.bytecode.micro.orderservice.model;

public class Order {
    private int id;
    private int customerId;
    private String product;
    private double amount;

    public Order() {}

    public Order(int id, int customerId, String product, double amount) {
        this.id = id;
        this.customerId = customerId;
        this.product = product;
        this.amount = amount;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getCustomerId() { return customerId; }
    public void setCustomerId(int customerId) { this.customerId = customerId; }

    public String getProduct() { return product; }
    public void setProduct(String product) { this.product = product; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
}
