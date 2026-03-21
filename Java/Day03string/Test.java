package Java.Day03string;

public class Test {
    public static void main(String[] args) {
        String a = new String("jonas");  //a refer to a different loc in heap
        String b = new String("jonas"); // b refer to different loc 

        System.out.println(a == b);  // we comparing reference here
            //false
        String c = "jonas"; //jonas ek string pool me jake store hogya
        String d = "jonas";// c & d refer to a same reference

        System.out.println(c == d); // true
    }
}
