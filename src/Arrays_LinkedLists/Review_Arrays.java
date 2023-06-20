package Arrays_LinkedLists;

import java.util.Arrays;

/*
Array - a collection of objects of the same data type
 */
public class Review_Arrays {
    public static void main(String[] args) {
        //Declare an array
        int[] nums;

        //Declare and allocate, and init an array
        double[] otherNums = new double[5];

        //Declare, allocate, and init an array
        String[] availablePets = {"cat", "dog", "fish"};
        String[] unavailablePets = {"bird", "rabbit", "hamster", "gerbil"};

        System.out.println(Arrays.toString(availablePets));
        System.out.println(Arrays.toString(unavailablePets));

        int indexOfAvailablePets = 2; //index of fish
        int indexOfUnavailablePets = 0; // index of bird

        String availablePet = availablePets[indexOfAvailablePets];
        String unavailablePet = unavailablePets[indexOfUnavailablePets];

        availablePets[indexOfAvailablePets] = unavailablePet;
        unavailablePets[indexOfUnavailablePets] = availablePet;

        System.out.println(Arrays.toString(availablePets));
        System.out.println(Arrays.toString(unavailablePets));
    }
}
