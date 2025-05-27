class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class Ex18_Inheritance{
    public static void main(String[] args) {
    
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound(); 

        Dog myDog = new Dog();
        myDog.makeSound(); 
    }
}

