package Java.Day14multithreading.lambdaexpression;

//functional interface -> isme sirf single abstract method hota hai
//runnable ek functional interface hai jisme sirf run method hota hai

public class LambdaExpression {
    public static void main(String[] args) {

        // Runnable runnable = new Runnable() {
        //     @Override
        //     public void run() {
        //         System.out.println("hello");
        //     }
        // };

        // Runnable runnable = ()->{
        //     System.out.println("hello");
        // };

        // Thread t1 = new Thread(runnable);

        // Runnable runnable = () -> System.out.println("hello");
        // Thread t1 = new Thread(runnable);

        Thread t1 = new Thread(()-> System.out.println("hello"));
    }
}


interface Student{
    public String getBio(String name);
}

class EngineeringStudent{
    public static void main(String[] args) {
        Student lawStudent = (String name)->{return name +" is a law student";};
        System.out.println(lawStudent.getBio("sumit"));
    }
}
