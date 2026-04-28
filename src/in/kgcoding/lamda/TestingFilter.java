
package in.kgcoding.lamda;

import java.util.List;

public class TestingFilter {

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "mango", "cherry", "dates");
        System.out.println(fruits.size());

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println(".........................................");

        System.out.println("printing with streams");
        fruits.stream()
                .filter(fruit -> fruit.endsWith("e"))
                .forEach(fruit -> System.out.println(fruit));
    }
}