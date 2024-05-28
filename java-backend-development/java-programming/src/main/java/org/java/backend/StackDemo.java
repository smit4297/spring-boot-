package org.java.backend;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stackOfCards = new Stack();

//		// Push new items to the stack
        stackOfCards.push("Jack");
        stackOfCards.push("Queen");
        stackOfCards.push("King");
        stackOfCards.push("Ace");

        System.out.println(stackOfCards);
        int position = stackOfCards.search("Queenn");
        if (position!=-1) {
            System.out.println("Found element at a position: "+position);
        }else {
            System.out.println("Element not found");
        }
        Iterator<String> stackOfCardsIterator = stackOfCards.iterator();
        while(stackOfCardsIterator.hasNext()) {
            System.out.println(stackOfCardsIterator.next());
        }

    }
}
