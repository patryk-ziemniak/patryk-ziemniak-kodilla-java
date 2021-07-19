package com.kodilla.good.patterns.challenges;

public class GameOrderService implements OrderService {

    @Override
    public boolean order(OrderRequest orderRequest) {
        System.out.println("Creating game order for user " + orderRequest.getUser() + " for " + orderRequest.getProduct() +
                " of amount: " + orderRequest.getAmount());
        return true;
    }
}
