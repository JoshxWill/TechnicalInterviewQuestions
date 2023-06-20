package Encapsulation;

/*
Encapsulation:
    - Binding an object's state and behaviors together
    - Can hide a class's data from other classes
    - Declaring all the fields in a class as private and writing public methods
    in the class to set and get their values
    - useful so the user has no idea of the inner implementation of a given class
    and the data it contains
    - It allows you to hide how values are stored and maintained
    within a given class
Why Encapsulation?
    - Improves reusability of our program
    - Makes our code more maintainable
    - Makes unit testing much easier
 */
public class HogwartsStudent {
    private String name;
    private HogwartsHouse house;

    public HogwartsStudent (String name, int age){
        this.name = name;
        this.house = HogwartsHouse.values() [Math.abs(name.hashCode()) % 4];
    }

    public String getName(){
        return this.name;
    }

    public HogwartsHouse getHouse(){
        return this.house;
    }
}
