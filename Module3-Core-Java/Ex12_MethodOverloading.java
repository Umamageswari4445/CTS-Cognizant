public class Ex12_MethodOverloading {
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b,int c){
        return a+b+c;
    }
    public double add(double a, double b){
        return a+b;
    }
    public static void main(String[] args) {
        Ex12_MethodOverloading obj=new Ex12_MethodOverloading();
        System.out.println("Addition of Two integers (11,12) : "+obj.add(11,12));
        System.out.println("Addition of Two double (11.2,12.2) : "+obj.add(11.2,12.2));
        System.out.println("Addition of Three integers (11,12,10) : "+obj.add(11,12,10));
    }
}

