package Stacks_Queues_Hash_Structures;

import java.util.Stack;

/*
Stack:
    - is an ordered list of objects that are inserted and removed
    following a last in, first out (LIFO) policy
    - is useful when you need to reverse something or keep track of state.
    - Insert items with a push() method
    - Remove items with a pop() method
 */
public class Stacks {
    public static void main(String[] args) {
        Stack<String> deckOfCards = new Stack();

        String card1 = "Jack : Diamonds";
        String card2 = "8 : Hearts";
        String card3 = "3 : Clubs";

        deckOfCards.push(card1);
        deckOfCards.push(card2);
        deckOfCards.push(card3);

        System.out.println(deckOfCards);

        //See what's on top w/o removal
        String top = deckOfCards.peek();
        System.out.println("Top: " + top);

        //See size
        System.out.println("Size of Stack: " + deckOfCards.size());
        System.out.println();

        //Remove
        while (!deckOfCards.isEmpty()){
            String removedItem = deckOfCards.pop();
            System.out.println("Removed " + removedItem);
        }
    }
}
