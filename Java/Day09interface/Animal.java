package Java.Day09interface;

/*
    in interface 
        1. all methods are public by default
        2. by default methods are abstract
        3. variable are public static constant (by default final)
        4. interface can have static method
        5. interface can also have default method (concrete method: method with implementation and it is call by object) & it has this keyword also
            // bcz it is called by object
    
    A class implements a interface

*/

public interface Animal {
    //cannot do this
    //  int max = 9;
    //  max = 8;
    //  void sleep(){

    //  }
    //if i remove static from here it start giving error bcz then it become abstract method

    int max = 7;

    void show();

    static void info(){
        System.out.println("This is an animal interface");
    }

    default void run(){
        this.show();
        System.out.println("Animal is running");
    }
}

class Dog implements Animal{

    void eat(){
        System.out.println("dog eat meat");
    }

    public void show(){
        System.out.println("this is dog class");
    }
}

class Cat implements Animal{
    public void show(){
        System.out.println("this is cat class");
    }
}

class Test{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat =  new Cat();

        Animal.info();
        dog.run();
        cat.run();

        System.out.println(Animal.max);
        System.out.println(Dog.max);
        System.out.println(Cat.max);
    }
}
