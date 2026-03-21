package Java.Day05oops;

class Animal{
    public void sound() {
        System.out.println("...");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("woof");
    }
    public void bye(){
        System.out.println("woof woof");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        
        Animal dog = new Dog();//run time polymorphism , dynamic method dispatch
        //but we can access only thos properties & behaviour which are in Animal class
        dog.sound();
       // dog.bye(); // error

       Dog dog1 = new Dog();
       dog1.sound();
       dog1.bye();

    }
}
