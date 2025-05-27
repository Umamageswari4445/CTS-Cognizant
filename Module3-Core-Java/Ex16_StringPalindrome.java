import java.util.Scanner;

public class   Ex16_StringPalindrome {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s=sc.nextLine();
        s=s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");;
        String revrs="";
        for(int i =s.length()-1;i>=0;i--){
            revrs+=s.charAt(i);
        }
        System.out.println("Original String : "+s);
        System.out.println("Reversed String : "+revrs);
        System.out.println(s.equals(revrs)?"String \""+s+"\" is a Palindrome.":"String \""+s+"\" is NOT a Palindrome.");
        sc.close();
        
    }
  
}
