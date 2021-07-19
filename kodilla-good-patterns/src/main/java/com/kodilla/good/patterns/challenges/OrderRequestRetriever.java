package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Jan", "Kowalski", "jan.kowalski@gmail.com");
        return new OrderRequest(user, "Battlefield 2042", 1.0);
    }
}
