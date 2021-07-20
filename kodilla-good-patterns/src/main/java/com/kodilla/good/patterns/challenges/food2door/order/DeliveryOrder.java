package com.kodilla.good.patterns.challenges.food2door.order;

import com.kodilla.good.patterns.challenges.food2door.supplier.Supplier;

public class DeliveryOrder {

    private final String product;
    private final double amount;
    private final Supplier supplier;

    public DeliveryOrder(String product, double amount, Supplier supplier) {
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

    public Supplier getSupplier() {
        return supplier;
    }

    @Override
    public String toString() {
        return "DeliveryOrder{" +
                "product='" + product + '\'' +
                ", amount=" + amount +
                ", supplier=" + supplier +
                '}';
    }
}
