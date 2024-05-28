package org.java.backend;

import java.util.function.Predicate;



public class Predicate1 {

    public static void main(String[] args) {

        Predicate<String> pri = (String s) -> {
            return !s.isEmpty();
        };
        Predicate<String> pri2 = (String s) -> {
            return s.length() > 5;
        };
        Predicate<String> pri3 = pri.and(pri2);
        pri3.test("hello");
    }
}
