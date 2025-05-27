import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class Ex21_CustomException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            // Check if age is valid
            if (age < 18) {
                throw new InvalidAgeException("You must be 18 or older.");
            } else {
                System.out.println("Access granted. You are eligible.");
            }
        } catch (InvalidAgeException e) {
            // Handle custom exception
            System.out.println("Invalid Age Exception: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Program ended.");
        }
    }
}
