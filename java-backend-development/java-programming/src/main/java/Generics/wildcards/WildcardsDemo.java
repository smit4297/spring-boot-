package Generics.wildcards;

import java.util.Arrays;
import java.util.List;

public class WildcardsDemo {

    public static void printUnbounded(List<?> list){
        System.out.println(list);
    }

    public static void printUpperBounded(List<? extends Number> list){
        //here you can pass list of Integer and Double as these two classes are subclass of
        //Number
        System.out.println(list);
    }

    public static void printLowerBounded(List<? super Integer> list) {
//        Here arguments can be Integer or superclass of Integer(which is Number).
//        The method printOnlyIntegerClassorSuperClass will only take Integer or its
//        superclass objects.
        System.out.println(list);
    }
    public static void sumOf(List<? extends Number> list) {
        Number sum = 0;
        for(Number i: list) {
            if(i instanceof Integer) {
                sum = sum.intValue() + i.intValue();
            }
            else if(i instanceof Double || i instanceof Float) {
                sum = sum.doubleValue() + i.doubleValue();
            }
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {

        List<String> names = Arrays.asList("smit", "sujit");
        List<Integer> age = Arrays.asList(24, 29);
        printUnbounded(names);
        printUnbounded(age);
    }
}
