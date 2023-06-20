package String_Manipulation;

public class Access_Data {
    public static void main(String[] args) {
        String apples = "Apples";

        //Access first character
        char firstCharacter = apples.charAt(0);
        System.out.println(firstCharacter);

        //Finding Index
        System.out.println(apples.indexOf('e'));

        //Accessing a sequence of characters in a string
        String sub = apples.substring(2, 4);
        System.out.println(sub);

        System.out.println(apples.contains("app"));
        System.out.println(apples.contains("App"));

        //Convert string into character array
        char[] applesArray = apples.toCharArray();
        int index = 4;
        System.out.println(applesArray[4]);
    }
}
