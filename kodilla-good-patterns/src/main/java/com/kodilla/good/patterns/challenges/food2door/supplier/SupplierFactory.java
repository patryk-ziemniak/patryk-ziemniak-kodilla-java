package com.kodilla.good.patterns.challenges.food2door.supplier;

public class SupplierFactory {

    public static DeliveryOrderProcess transform(Supplier supplier) {
        switch (supplier) {
            case EXTRA_FOOD_SHOP:
                return new ExtraFoodShopOrderProcess();
            case HEALTHY_SHOP:
                return new HealthyShopOrderProcess();
            case GLUTEN_FREE_SHOP:
                return new GlutenFreeShopOrderProcess();
            default:
                return null;
        }
    }
}
