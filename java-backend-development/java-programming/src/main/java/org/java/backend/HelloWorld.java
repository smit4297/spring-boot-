package org.java.backend;

public class HelloWorld {

    public static void main(String[] args) {

        int[][] arr = new int[][]{{1,2,3}, {1,2,3}, {1,2,4}};

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
