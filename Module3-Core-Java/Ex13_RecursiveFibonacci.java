import java.util.Scanner;
public class Ex13_RecursiveFibonacci {

    public static int RecurFib(int n){
        if(n<=1) return n;
        else{
            return RecurFib(n-1)+RecurFib(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        System.out.println("Result : "+RecurFib(num));
        sc.close();
    }
}