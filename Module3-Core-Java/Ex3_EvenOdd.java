import java.util.Scanner;
public class Ex3_EvenOdd {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n=sc.nextInt();
        System.out.println(n%2==0 ? n + " is an Even Numbar. " : n + " is an Odd Numbar. ");
        sc.close();
        };

    }
