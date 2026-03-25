package Java.Day11exceptionhandling.checkedUnchecked;

import java.io.FileNotFoundException;

public class ThrowExample {
    public static void main(String[] args) throws FileNotFoundException{
        method1();
    }

    public static void method1() throws FileNotFoundException{
        throw new FileNotFoundException("error agya");
    }
}
