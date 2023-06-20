package Arrays_LinkedLists;

import java.sql.SQLOutput;
import java.util.LinkedList;

/*
Linked List -
- a linear data structure where elements containing data of the same type are linked using pointers
- Each item in the linked list is called a node
- A node contains data and reference to the next element in the list
Singly-linked lists:
- contain a pointer pointing to the next nod
Doubly-linked lists
- contain a pointer pointing to the next node, and the previous node

Advantages:
    -Faster at inserting and deleting dynamically sized data
Disadvantages:
    -More memory is required for storing elements in a linked list
    -Search or node traversal is still time-consuming
 */
public class Review_LinkedList {
    public static void main(String[] args) {
        //Create a Linked List
        LinkedList<String> students = new LinkedList();

        //Add students to the Linked List
        students.add("Charlie");
        students.add("Sally");
        students.add("Morgan");
        students.add("Taylor");
        students.add("Jamie");

        students.addFirst("Sarah");
        students.addLast("Hailey");
        students.add(2, "Tara");

        //Retrieve items from a Linked List by placement
        String firstStudent = students.getFirst();
        System.out.println("First Student: " + firstStudent);

        String lastStudent = students.getLast();
        System.out.println("Last Student: " + lastStudent);

        //Retrieve items from a Linked List by index
        String secondStudent = students.get(1);
        System.out.println("Second Student: " + secondStudent);

        //Retrieve index of specific item
        int i = students.indexOf("Morgan");
        System.out.println("Index of Morgan: " + i);

        //Access size of a Linked List
        System.out.println("Size: " + students.size());

        //Remove items by placement, object, and index
        students.removeFirst();
        students.removeLast();
        students.remove("Jamie");
        students.remove(1);
        System.out.println(students);

        //Search for items in a Linked List
        boolean hasTaylor = students.contains("Taylor");
        System.out.println("Have taylor? " + hasTaylor);

        //Empty the list
        students.clear();
        System.out.println(students);
    }
}
