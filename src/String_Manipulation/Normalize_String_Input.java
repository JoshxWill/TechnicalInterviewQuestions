package String_Manipulation;

import java.util.List;
import java.util.stream.Collectors;

public class Normalize_String_Input {
    public static void main(String[] args) {
        String panda = " Panda";
        String fish = " fish ";
        String horse = "Horse   ";
        String cat = " CAT";
        String nothing = "   ";
        //Method 1
        List<String> animals = List.of(panda, fish, horse, cat, nothing);
        animals.stream().forEach(s -> System.out.println(s.trim()));

        //Method 2
        List<String> trimmed = animals.stream()
                .map(s -> s.trim())
                .collect(Collectors.toList());
        List<String> realAnimals = trimmed.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
        List<String> normalizedAnimalsNames = realAnimals.stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());
        System.out.println("Normalized Animal Names " + normalizedAnimalsNames);
    }
}
