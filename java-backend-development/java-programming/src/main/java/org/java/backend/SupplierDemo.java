package org.java.backend;

import java.util.function.Supplier;

public class SupplierDemo {


    public static void main(String[] args) {
        Supplier<Double> supp = () -> Math.random();
        System.out.println(supp.get());
    }




}
