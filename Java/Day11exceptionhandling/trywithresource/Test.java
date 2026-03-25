package Java.Day11exceptionhandling.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        //reader ko close krna important isliye humne finally me likha hai 
        //taki always reader close hojaye
        //we can do this without finally using try with resource 
        // BufferedReader reader = null;
        // try{
        //     reader = new BufferedReader(new FileReader("abc.txt"));
        //     String line;
        //     while((line = reader.readLine()) != null){
        //         System.out.println(line);
        //     }
        // }catch(IOException e){
        //     System.out.println("IOException caught: " + e.getMessage());
        // }
        // finally{
        //     try{
        //         if(reader != null){
        //             reader.close();
        //         }
        //     }catch(IOException e){
        //         System.out.println("error closing reader: " + e.getMessage());
        //     }
        // }

        try(BufferedReader reader = new BufferedReader(new FileReader("abc.txt"))){
            String line;
            while((line = reader.readLine()) != null){
                 System.out.println(line);
           }
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}
