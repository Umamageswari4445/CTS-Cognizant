import java.util.*;

public class Ex15_StringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine();
        String revrs = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            revrs += s.charAt(i);
        }
        System.out.println("Original String : " + s);
        System.out.println("Reversed String : " + revrs);
        sc.close();

    }
}