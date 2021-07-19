package com.kodilla.good.patterns.challenges;

public class OrderRequest {

    private User user;
    private String product;
    private double amount;

    public OrderRequest(final User user, final String product, final double amount) {
        this.user = user;
        this.product = product;
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public String getProduct() {
        return product;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "user=" + user +
                ", product='" + product + '\'' +
                ", amount=" + amount +
                '}';
    }
}
