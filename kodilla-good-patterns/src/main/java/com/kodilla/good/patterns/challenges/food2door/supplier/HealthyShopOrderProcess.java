package com.kodilla.good.patterns.challenges.food2door.supplier;

import com.kodilla.good.patterns.challenges.food2door.order.DeliveryOrder;
import com.kodilla.good.patterns.challenges.food2door.sender.EmailSender;

public class HealthyShopOrderProcess implements DeliveryOrderProcess {

    private static final String SUPPLIER_NAME = "HealthyShop";
    private static final String CONTACT = "healthy@shop.com";

    @Override
    public boolean process(DeliveryOrder deliveryOrder) {
        order(deliveryOrder, SUPPLIER_NAME);
        new EmailSender().send(CONTACT);
        System.out.println("Message from supplier: \"Thank You for your order!\"");
        return true;
    }
}
