package com.kodilla.good.patterns.challenges;

public class TextOrderRepository implements OrderRepository {

    @Override
    public void add(OrderRequest orderRequest) {
        System.out.println("Adding order " + orderRequest + " to Text Order Repository");
    }
}
