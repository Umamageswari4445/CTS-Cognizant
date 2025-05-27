import java.util.Scanner;

public class Ex4_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year :");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    System.out.println(year + " is a LeapYear.");
                else
                    System.out.println(year + " is NOT a LeapYear.");
            } else
                System.out.println(year + " is a LeapYear.");
        }
        else System.out.println(year +" is NOT a LeapYear.");
        sc.close();
    }
}
