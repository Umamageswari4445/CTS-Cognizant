import java.util.HashMap;
import java.util.Scanner;

public class Ex25_HashmapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student IDs and names (type -1 to stop):");

        while (true) {
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 

            if (id == -1) break;

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            studentMap.put(id, name);
        }

        System.out.print("\nEnter an ID to search: ");
        int searchId = scanner.nextInt();

        if (studentMap.containsKey(searchId)) {
            System.out.println("Name: " + studentMap.get(searchId));
        } else {
            System.out.println("Student ID not found.");
        }

        scanner.close();
    }
}


    
