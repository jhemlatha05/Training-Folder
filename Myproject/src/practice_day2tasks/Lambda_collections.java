package practice_day2tasks;

import java.util.*;
import java.util.stream.*;

public class Lambda_collections {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aarav", "Meena", "Anil", "Raj", "Akshay");

        System.out.println("All Names:");
        names.forEach(name -> System.out.println(name));

        System.out.println("\nNames starting with A:");
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);

        System.out.println("\nSorted Names:");
        names.stream()
             .sorted()
             .forEach(System.out::println);
    }
}


