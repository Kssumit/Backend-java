package Java.Day18class;

//the Class is used to get more info about class  
class People{}

class Student extends People{}


public class Main {
public static void main(String[] args) throws Exception {
    Student s = new Student();
    Class<?> cl =  s.getClass();

   System.out.println("class name of this object " + cl.getName());

   String className = "java.util.Scanner";
   Class<?> cl1 = Class.forName(className);
   System.out.println(cl1.getName());

}
    
}