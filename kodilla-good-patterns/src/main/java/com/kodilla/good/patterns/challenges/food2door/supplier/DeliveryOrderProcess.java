package com.kodilla.good.patterns.challenges.food2door.supplier;

import com.kodilla.good.patterns.challenges.food2door.order.DeliveryOrder;

public interface DeliveryOrderProcess {

    boolean process(DeliveryOrder deliveryOrder);

    default void order(DeliveryOrder deliveryOrder, String supplierName) {
        System.out.println("Ordering delivery of '" + deliveryOrder.getProduct() +
                "' amount: " + deliveryOrder.getAmount() + ", from " + supplierName + ".");
    }
}
