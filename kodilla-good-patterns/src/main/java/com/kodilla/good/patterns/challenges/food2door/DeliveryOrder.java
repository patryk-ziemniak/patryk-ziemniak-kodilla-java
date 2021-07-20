package com.kodilla.good.patterns.challenges.food2door;

public class DeliveryOrder {

    private String product;
    private double amount;
    private DeliveryOrderProcess supplier;

    public DeliveryOrder(String product, double amount, DeliveryOrderProcess supplier) {
        this.product = product;
        this.amount = amount;
        this.supplier = supplier;
    }

    public String getProduct() {
        return product;
    }

    public double getAmount() {
        return amount;
    }

    public DeliveryOrderProcess getSupplier() {
        return supplier;
    }
}
