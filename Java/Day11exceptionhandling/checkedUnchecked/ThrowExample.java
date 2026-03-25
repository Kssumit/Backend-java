package Java.Day11exceptionhandling.checkedUnchecked;

import java.io.FileNotFoundException;

public class ThrowExample {
    public static void main(String[] args){
        try{
            method1();
        }catch(FileNotFoundException e){
            System.out.println("dekho dekho");
            System.out.println(e);
        }finally{
            System.out.println("always run");
        }
    }

    public static void method1() throws FileNotFoundException{
        throw new FileNotFoundException("error agya");
    }
}
