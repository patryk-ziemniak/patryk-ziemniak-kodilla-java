package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShopOrderProcess implements DeliveryOrderProcess {

    private static final String CONTACT = "glutenfree@shop.com";

    @Override
    public boolean process(DeliveryOrder deliveryOrder) {
        System.out.println("Ordering delivery of '" + deliveryOrder.getProduct() +
                "' amount: " + deliveryOrder.getAmount() + ", from GlutenFreeShop.");
        new EmailSender().send(CONTACT);
        return true;
    }
}
