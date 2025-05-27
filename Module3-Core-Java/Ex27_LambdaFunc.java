import java.util.*;
public class Ex27_LambdaFunc {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob", "David");

        // Sorting using lambda
        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println("Sorted names:");
        names.forEach(System.out::println);
    }
}

    
