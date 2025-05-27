
class Car {
   String make,model;
   int year;
   public Car(String make,String model,int year){
       this.make=make;
       this.model=model;
       this.year=year;}
   public void displayDetails(){
       System.out.println("Make : "+make);
       System.out.println("Model : "+model);
       System.out.println("Year : "+year);
   }

}
public class Ex17_ClassObject {
    public static void main(String args[]){
        Car car=new Car("Toyato","Camry",2022);
        car.displayDetails();
    
    }
    
}
