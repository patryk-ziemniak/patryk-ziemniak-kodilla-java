package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.order.DeliveryOrder;
import com.kodilla.good.patterns.challenges.food2door.order.DeliveryOrderRetriever;
import com.kodilla.good.patterns.challenges.food2door.supplier.DeliveryOrderProcess;
import com.kodilla.good.patterns.challenges.food2door.supplier.SupplierFactory;

import java.util.List;

public class DeliveryOrderProcessor {

    public void process(DeliveryOrder deliveryOrder) {
        DeliveryOrderProcess deliveryOrderProcess = SupplierFactory.transform(deliveryOrder.getSupplier());
        if (deliveryOrderProcess != null) {
            boolean isOrdered = deliveryOrderProcess.process(deliveryOrder);
            checkIfOrdered(isOrdered);
        } else {
            System.out.println("Supplier entered in delivery order is not recognized!");
        }
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
