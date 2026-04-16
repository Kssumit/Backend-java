package Java.Day05oops;

import Java.Day05oops.protectedexample.Emplyee;

public class Manager extends Emplyee{
    public int getSalary(){
        return salary + 1000;
    }


    // public void compare(Emplyee e){
    //     System.out.println(e.salary);
    // }

    public static void main(String[] args) {
        Manager manager = new Manager();
        System.out.println(manager.getSalary());
    }
}
