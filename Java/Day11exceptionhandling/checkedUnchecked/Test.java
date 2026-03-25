package Java.Day11exceptionhandling.checkedUnchecked;
/*
    unchecked exception -> exceptions which are not get checked by compiler like divide by zero
    checked exception -> exceptions jo compiler padka leta hai like when we do file handling


*/

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        //FileReader fileReader = new FileReader("a.txt"); //it shows a error FileNotFoundException
        // we have 2 methods solve this:
            //1. try catch
            //2. throws  
        method2();
            
    }
    public static void method2() throws FileNotFoundException{
        //method1(); //method2 call kr rha hai and i not handled it show its showing error

        //handling using try catch
        // try{
        //     method1();
        // }catch(FileNotFoundException e){
        //     System.out.println(e);
        // }
        //upr main me pass kr dete hai
        //main me throws likh dete hai ab jvm handle krega means error ayega
        method1();

    }
    public static void method1() throws FileNotFoundException{
        FileReader fileReader = new FileReader("a.txt");
        //throws FileNotFoundException  method definitation me likhte hai 
        //jo bhi is method call krega uski responsibility hogi to handle the error
    }
}
