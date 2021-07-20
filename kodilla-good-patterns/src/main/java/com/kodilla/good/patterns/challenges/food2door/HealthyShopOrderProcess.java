package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShopOrderProcess implements DeliveryOrderProcess {

    private static final String CONTACT = "healthy@shop.com";

    @Override
    public boolean process(DeliveryOrder deliveryOrder) {
        System.out.println("Ordering delivery of '" + deliveryOrder.getProduct() +
                "' amount: " + deliveryOrder.getAmount() + ", from HealthyShop.");
        new EmailSender().send(CONTACT);
        System.out.println("Message from supplier: \"Thank You for your order!\"");
        return true;
    }
}
