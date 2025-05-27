import java.util.Scanner;

public class Ex2_SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter value 2 : ");
        int n2 = sc.nextInt();
        System.out.println("Choose the Operation :");
        System.out.println("1.Addition - ' + ' \n2.Subtraction - ' - ' \n3.Multiplication - ' * ' \n4.Division - ' / ' ");
        System.out.print("Enter Operation : ");
        char opr = sc.next().charAt(0);
        switch (opr) {
            case '+':
                System.out.println("Result : " + (n1 + n2));
                break;
            case '-':
                System.out.println("Result : " + (n1-n2));break;
            case '*':
                System.out.println("Result : "+(n1*n2));break;
            case '/':
                System.out.println("Result : "+ (n1/n2));break;

            default:
                break;
        }
        sc.close();
    }
    
}
