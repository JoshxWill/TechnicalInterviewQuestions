package Stacks_Queues_Hash_Structures;

import java.util.HashMap;

/*
HashMaps:
    - use key-value pairs and a hashing function to store
    and organize their data
Hashing Function
    - maps a key or object to a specific hash
HashMap provides the most flexibility and best performance
Hash-based structures are the most commonly used data structures
in technical interviews
Java provides: Hashtable, HashSet, HashMap
 */
public class Hash {
    public static void main(String[] args) {
        HashMap<String, Integer> wordToNum = new HashMap<>();

        //Insert key-and-value pairs into the hashmap
        wordToNum.put("ONE", 1);
        wordToNum.put("TWO", 2);
        wordToNum.put("THREE", 3);
        wordToNum.put("FOUR", 4);
        wordToNum.put("FIVE", 5);

        //Retrieve elements
        System.out.println("Retrieve element: " + wordToNum.get("THREE"));

        //List values and keys
        System.out.println(wordToNum.values());
        System.out.println(wordToNum.keySet());

        //Remove elements
        System.out.println(wordToNum.remove("FOUR"));

        //4 is no longer a key or value
        System.out.println(wordToNum.values());
        System.out.println(wordToNum.keySet());
    }
}
