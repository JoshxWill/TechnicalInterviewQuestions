package Stacks_Queues_Hash_Structures;

import java.util.LinkedList;
import java.util.Queue;

/*
Queue:
    - an ordered list of objects where elements are inserted
    at the end and removed from the beginning
    - FIFO: first in, first out
    - useful for storing the order if something happen or
    need to happen
 */
public class Queues {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList();

        queue.add("Sam");
        queue.add("Anne");
        queue.add("Heidi");
        queue.add("Sally");
        queue.add("Charlotte");

        System.out.println(queue);

        System.out.println("Next up! " + queue.peek());

        while(!queue.isEmpty()){
            String removed = queue.remove();
            System.out.println(removed);
        }
    }
}
