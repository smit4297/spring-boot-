package Generics;

class Printer<T> {
    private T data;

    public Printer(T data) {
        this.data = data;
    }

    public void print() {
        System.out.println("Printing: " + data);
    }
}

public class Generics {

    public static void main(String[] args) {
        Printer<Integer> numberPrinter = new Printer<>(10);
        numberPrinter.print();

        Printer<String> textPrinter = new Printer<>("Hello");
        textPrinter.print();

        Printer<Double> doublePrinter = new Printer<>(23.5);
        doublePrinter.print();
    }

}
