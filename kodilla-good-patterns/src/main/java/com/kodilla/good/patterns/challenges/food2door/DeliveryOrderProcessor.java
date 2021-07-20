package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class DeliveryOrderProcessor {

    public void process(DeliveryOrder deliveryOrder) {
        DeliveryOrderProcess deliveryOrderProcess = deliveryOrder.getSupplier();
        boolean isOrdered = deliveryOrderProcess.process(deliveryOrder);
        checkIfOrdered(isOrdered);
    }

    private void checkIfOrdered(boolean isOrdered) {
        if (isOrdered) {
            System.out.println("Order completed successfully\n");
        } else {
            System.out.println("Delivery order couldn't be completed!\n");
        }
    }

    public static void main(String[] args) {
        DeliveryOrderRetriever retriever = new DeliveryOrderRetriever();
        List<DeliveryOrder> orderList = retriever.retrieve();
        DeliveryOrderProcessor orderProcessor = new DeliveryOrderProcessor();

        orderList.forEach(orderProcessor::process);
    }
}
