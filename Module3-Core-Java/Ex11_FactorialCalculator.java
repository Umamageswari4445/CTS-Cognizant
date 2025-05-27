import java.util.Scanner;
public class Ex11_FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int fact=1,num=sc.nextInt();
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+num +" : "+fact);
        sc.close();
    }
}
