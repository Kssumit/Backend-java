package Java.Day05oops;
//points about abstract class
//1. object cant be created
//2. have constructor (protected enough) : to initialize variable of abstract class
//3. may have abstract and concrete method

abstract class Animal{
    private String name;
    private int age;

    protected Animal(){ 
        name = "abc";
        age = 0;
    }

    public abstract void sound();
    
    public void say(){
        System.out.println("i am abstract class");
    }
}

 class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("woof");
    }
 }
public class Abstraction {
    public static void main(String[] args) {
        
        Animal dog = new Dog();
        
    }
}
