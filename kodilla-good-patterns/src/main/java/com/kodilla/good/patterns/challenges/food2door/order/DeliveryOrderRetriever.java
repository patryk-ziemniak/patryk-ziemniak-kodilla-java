package com.kodilla.good.patterns.challenges.food2door.order;

import com.kodilla.good.patterns.challenges.food2door.supplier.Supplier;

import java.util.ArrayList;
import java.util.List;

public class DeliveryOrderRetriever {

    public List<DeliveryOrder> retrieve() {
        List<DeliveryOrder> orderList = new ArrayList<>();
        orderList.add(new DeliveryOrder("Big Tomatoes", 40.0, Supplier.EXTRA_FOOD_SHOP));
        orderList.add(new DeliveryOrder("Bio Potatoes", 150.0, Supplier.HEALTHY_SHOP));
        orderList.add(new DeliveryOrder("Pizza Gluten Free", 30.0, Supplier.GLUTEN_FREE_SHOP));
        return orderList;
    }
}
