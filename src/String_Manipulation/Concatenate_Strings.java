package String_Manipulation;

public class Concatenate_Strings {
    public static void main(String[] args) {
        String firstName = "Joshua";
        String lastName = "Williams";
        //Method 1
        String name = firstName + " " + lastName;
        System.out.println(name);
        //Method 2
        String concatName = (firstName.concat(" ").concat(lastName));
        System.out.println(concatName);
    }
}
