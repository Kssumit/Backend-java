package Java.Day05oops;

import java.util.ArrayList;

//1st grandParent constructor is called then parent then child 

// class GrandParent{
//     private String name;
//     private int age;

//     private boolean superPower;
//     //imp ye this keyword kiska hoga 
//     //see below humne sirf child ka object bana hai to ye this child ko point kr rha hoga ok so ye age bhi child ki hogi
//     public GrandParent(int age) {
//         this.age = age;
//         superPower = false;
//         System.out.println("Grand parent constructor is called");
//     }

//     public void setName(String name){
//         this.name = name;
//     }

//     public void setAge(int age){
//         this.age = age;
//     }

//     public String getName(){
//         return name;
//     }

//     public int getAge(){
//         return age;
//     }
//     public void show(){
//         System.out.println("details about person");
//     }

// }

// class Parent extends GrandParent{
//     // public Parent(){
//     //     //super()  //if i write or not, java automatically insert default super() to call constructor of immediate parent class object
//     //     System.out.println("Parent constructor is called");
//     // }
//     public Parent(int age){
//         super(age);
//         System.out.println("Parent constructor is called");
//     }
//     // public Parent(int a){
//     //     System.out.println("Parent constructor is called");
//     // }

//     public void show(){//method overriding
//         System.out.println("parent");
//     }
// }

// class Child extends Parent{
//     public Child(int age){
//         //super()  //if i write or not, java automatically insert default super() to call constructor of immediate parent class object
//         //if in parent constructor you write only paramterized constructor then child class default constructor shows error
//         super(age);
//         System.out.println("Child constructor is called");
//     }

//         public void show(){//method overriding
//         System.out.println("child");
//     }
// }



class Employee{
    private double salary = 10;

    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
}

class Manager extends Employee{
    private double bonus = 10;

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double getSalary(){
        return super.getSalary() + bonus;
    }
}

//in overriding return can be different but parameter type must be same 

public class Inheritance {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Employee empl = manager;
        // empl.setBonus();
        Employee empl1 = new Employee();
        System.out.println(manager.getSalary());
        System.out.println(empl.getSalary());
        System.out.println(empl1.getSalary());
        if(empl instanceof Manager ){
            ((Manager)empl).setBonus(10);
        }

        var names = new ArrayList<String>(100){
            public void add(int index, String element){
                super.add(index, element);
                System.out.printf("Adding %s at index %d",element,index);
            }
        };


        

        names.add(0,"sumit");
        names.add(1,"sumit");
        System.out.println(names);
        // Child child = new Child(10);
        // child.setName("sumit");
        // child.setAge(18);
        // System.out.println(child.getAge() + " " + child.getName());
        // child.show();
    }
}
