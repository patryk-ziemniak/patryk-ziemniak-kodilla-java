package com.kodilla.good.patterns.challenges.food2door;

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
