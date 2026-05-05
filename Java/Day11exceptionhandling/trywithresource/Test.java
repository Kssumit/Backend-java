package Java.Day11exceptionhandling.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws Exception{
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

        // try(BufferedReader reader = new BufferedReader(new FileReader("abc.txt"))){
        //     String line;
        //     while((line = reader.readLine()) != null){
        //          System.out.println(line);
        //    }
        // }catch(IOException e){
        //     System.err.println(e.getMessage());
        // }

        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("my");
        list.add("is");

        try{
            var out = new PrintWriter("output.txt");
            for(String line:list){
                out.println(line);
            }
            out.close();
        }catch(Exception e){
            System.out.print(e);
        }

        try(var out = new PrintWriter("output.txt")){

        }
    }
}
