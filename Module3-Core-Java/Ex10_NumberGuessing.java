import java.util.Scanner;

public class Ex10_NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randnum = (int) (Math.random() * 100) + 1;
        System.out.println("(Random Number : " + randnum + ")");// random number generated
        System.out.print("Guess the Random Number : ");
        int n = sc.nextInt();
        while (true) {

            if (n > randnum)
                System.out.println("Too High!! Try Again.");
            else if (n < randnum) {
                System.out.println("Too Low!! Try Again. ");
            } else {
                System.out.println("Your Guess is Correct! Random Number : " + randnum);
                break;
            }
            System.out.print("Guess the Random Number Again : ");
            n = sc.nextInt();
        }

        sc.close();

    }
}
