package org.java.backend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;




class Item{
    private String name;
    private double item;

    public Item(String name, double item) {
        this.name = name;
        this.item = item;
    }

    public double getItem() {
        return item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItem(double item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", item=" + item +
                '}';
    }
}
public class ConsumerImpl {

    public static void main(String[] args) {
//        Consumer<Integer> consumer = (i) -> System.out.println(i * 2);
////        consumer.accept(20);

//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        Consumer<Integer> doubleAndPrint = i -> System.out.println(i * 2);
//        list.forEach(doubleAndPrint);

        List<Item> list = Arrays.asList(new Item("laptop", 1000), new Item("phone", 50000));
        Consumer<Item> itemConsumer = (item) -> System.out.println(item.toString());
        list.forEach(itemConsumer);

    }

}
