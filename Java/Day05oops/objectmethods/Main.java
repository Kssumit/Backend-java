package Java.Day05oops.objectmethods;

import java.util.Arrays;

//toString method
class Employee{
    private String name = "hero";

    public String toString(){
        return getClass().getName() + " [name = " + name + "]";
    }
}

class Manager extends Employee{
    private int bonus = 1000;
    public String toString(){
        return super.toString() + " [bonus = " + bonus + "]";
    }
}


public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee);

        String msg = "hello how are you "+employee;
        System.out.println(msg); 

        int[] primes = {1,2,4,5};
        System.out.println(primes.toString());

        System.out.println(Arrays.toString(primes));

        Manager manager = new Manager();
        System.out.println(manager);
    }


}
