package com.kodilla.good.patterns.challenges.food2door.supplier;

import com.kodilla.good.patterns.challenges.food2door.order.DeliveryOrder;
import com.kodilla.good.patterns.challenges.food2door.sender.EmailSender;

public class GlutenFreeShopOrderProcess implements DeliveryOrderProcess {

    private static final String SUPPLIER_NAME = "GlutenFreeShop";
    private static final String CONTACT = "glutenfree@shop.com";

    @Override
    public boolean process(DeliveryOrder deliveryOrder) {
        order(deliveryOrder, SUPPLIER_NAME);
        new EmailSender().send(CONTACT);
        return true;
    }
}
