package Java.Day20streams.optional;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        Optional<String> optionalString = null;
        String res = optionalString.orElseGet(()-> System.getProperty("true"));


        
    }
}
