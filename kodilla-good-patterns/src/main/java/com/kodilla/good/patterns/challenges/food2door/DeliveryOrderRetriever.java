package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class DeliveryOrderRetriever {

    public List<DeliveryOrder> retrieve() {
        List<DeliveryOrder> orderList = new ArrayList<>();
        orderList.add(new DeliveryOrder("Big Tomatoes", 40.0, new ExtraFoodShopOrderProcess()));
        orderList.add(new DeliveryOrder("Bio Potatoes", 150.0, new HealthyShopOrderProcess()));
        orderList.add(new DeliveryOrder("Pizza Gluten Free", 30.0, new GlutenFreeShopOrderProcess()));
        return orderList;
    }
}
