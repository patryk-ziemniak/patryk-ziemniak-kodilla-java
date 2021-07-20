package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShopOrderProcess implements DeliveryOrderProcess {

    private static final String SUPPLIER_NAME = "ExtraFoodShop";

    @Override
    public boolean process(DeliveryOrder deliveryOrder) {
        order(deliveryOrder, SUPPLIER_NAME);
        return true;
    }
}
