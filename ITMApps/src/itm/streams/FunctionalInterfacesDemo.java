package itm.streams;

import java.util.function.*;

public class FunctionalInterfacesDemo {
    public static void main(String[] args) {
        
        // Function<T,R> - takes input, returns output
        Function<Integer, String> function = num -> "Number is: " + num;
        System.out.println(function.apply(10));   // Output: Number is: 10

        // Predicate<T> - takes input, returns boolean
        Predicate<Integer> predicate = num -> num > 0;
        System.out.println(predicate.test(5));    // true
        System.out.println(predicate.test(-3));   // false

        // Supplier<T> - no input, returns output
        Supplier<Double> supplier = () -> Math.random();
        System.out.println("Random number: " + supplier.get());

        // Consumer<T> - takes input, no output
        Consumer<String> consumer = message -> System.out.println("Hello, " + message);
        consumer.accept("Kaif");   // Output: Hello, Kaif
    }
}
