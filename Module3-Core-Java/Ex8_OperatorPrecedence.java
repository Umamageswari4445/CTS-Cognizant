public class Ex8_OperatorPrecedence {
    public static void main(String[] args) {
        int expr=10+4*5/2+3;
        System.out.println("Result : "+expr);
        /*Here , The Operator Precedence is 
        1.Multiplication (*), Division (/), and Modulus (%) — Same level, evaluated left to right.
        2.Addition (+) and Subtraction (-) — Lower precedence, also left to right.

        1.First, handle the multiplication and division (left to right):
          4 * 5 = 20
          20 / 2 = 10
        2.Now handle the addition (left to right):
          10 + 10 = 20
          20 + 3 = 23
        Result : 23 */
        
    }
   

}
