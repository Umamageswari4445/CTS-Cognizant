import java.util.*;

public class Ex14_ArraySumAvg {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    int i, sum = 0;
    System.out.print("Enter the Elements of Array : ");
    for (i = 0; i < arr.length; i++)
      arr[i] = sc.nextInt();
    for (i = 0; i < arr.length; i++)
      sum += arr[i];
    float avg = sum / 5;
    System.out.println("Sum of Array Elements : " + sum);
    System.out.println("Average of Array Elements : " + avg);
    sc.close();

  }

}
