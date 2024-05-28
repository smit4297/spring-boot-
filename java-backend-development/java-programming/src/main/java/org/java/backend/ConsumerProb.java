package org.java.backend;


import java.util.Arrays;
import java.util.List;

class Order {
    String itemName;
    int quantity;

    Order(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }
}

@FunctionalInterface
interface OrderProcessor {
    void process(Order order);
}


class PrepareOrder implements OrderProcessor {
    @Override
    public void process(Order order) {
        System.out.println("Preparing order for " + order.itemName + ", quantity: " + order.quantity);
    }
}

class DeliverOrder implements OrderProcessor {
    @Override
    public void process(Order order) {
        System.out.println("Delivering order for " + order.itemName + ", quantity: " + order.quantity);
    }
}


public class ConsumerProb {
    public static void main(String[] args) {

        Order order1 = new Order("Shirt", 2);
        Order order2 = new Order("Pants", 1);
        Order order3 = new Order("Hat", 3);
        List<Order> orders = Arrays.asList(order1, order2, order3);


        OrderProcessor prepareOrder = new PrepareOrder();
        OrderProcessor deliverOrder = new DeliverOrder();

        System.out.println("Preparing orders:");
        orders.forEach(prepareOrder::process);

        System.out.println("\nDelivering orders:");
        orders.forEach(deliverOrder::process);
    }
}
