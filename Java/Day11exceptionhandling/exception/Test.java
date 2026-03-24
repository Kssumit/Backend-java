package Java.Day11exceptionhandling.exception;

//this program exception
/*
    what is exception?
        => exception is a error which distrubs the normal 
            flow program.
            jese hi exception ata hai program stop exceuting and we don't 
            want this
            we solve this using exception handling
        
*/


public class Test {
    public static void main(String[] args) {
        int[] num = {12,3,5,6};
        int[] deno = {34,56,0,1};

        for(int i = 0; i< num.length; i++){
            System.out.println(divide(num[i],deno[i]));
        }
    }

    public static double divide(int a, int b){

        try{
            return a/b;
        }catch(ArithmeticException e){
            System.out.println(e);//see here we are printing object what how?
            /*
                sari class ek Object class ko extends krti hai which has a method called tostring()
                System.out.println tostring() ko hi call krta hai
                us method ko ArithmeticException class override kr deti hai to print class name and message
            */

            return -1;
        }
    }
}
