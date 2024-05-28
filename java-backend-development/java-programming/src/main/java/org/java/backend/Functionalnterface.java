package org.java.backend;

import java.util.function.Function;

public class Functionalnterface {

    public static void example(){
        Function<String, Integer> fun = (String s) -> {
           return s.length();
        };
        System.out.println(fun.apply("374375347534769"));
    }

    public static void main(String[] args) {
        example();
    }
}
