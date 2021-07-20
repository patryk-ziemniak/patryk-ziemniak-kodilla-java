package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShopOrderProcess implements DeliveryOrderProcess {

    @Override
    public boolean process(DeliveryOrder deliveryOrder) {
        System.out.println("Ordering delivery of '" + deliveryOrder.getProduct() +
                "' amount: " + deliveryOrder.getAmount() + ", from ExtraFoodShop.");
        return true;
    }
}
