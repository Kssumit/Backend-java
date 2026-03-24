package Java.Day11exceptionhandling.hierarchy;

//see the screenshot
/*
    these classes follow a hierarchy model
    !important
    in polymorphism we have seen that we can create a reference variable of a subclass using it parent class
    ex: Animal dog = new Dog()

    see in screenshot 
    Exception class is a parent class of all types of exception which can occur
*/


public class Test {
    public static void main(String[] args) {
        
        int num[] = {25,45,6,8};
        int deno[] = {12,8,0,7};

        for(int i =0 ; i<deno.length; i++){
            System.out.println(divide(num[i],deno[i]));
        }
    }

    public static double divide(int a , int b){
        try{
            return a/b;
        }catch(Exception e){
            System.out.println(e); //its works same as previous
            return -1;
        }
    }
}
