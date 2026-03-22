package Java.Day07static;

//static
/*
 1. static variable, block, method belongs to class not to object
 2. jvm first run static 
 3. objects of a class share common static variable that belongs to class 
 4. static method can use static variable & call only static method
*/

public class School {
    static {
        System.out.println("hello");
    }

    public static int add(int a, int b){
        return a+b;
    }
}

class Test{
    public static void main(String[] args) {
       System.out.println(School.add(4,5)); 
    }
}
