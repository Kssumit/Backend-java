package Java.Day09interface.lambdaexpression;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntConsumer;

// class Demo implements IntConsumer{
//     public void accept(int i){
//         System.out.println(9-i);
//     }
// }

public class Main {
    public static void main(String[] args) {
        repeat(10, (i)->System.out.println("countdown "+ (i)));

        String[] names = {"sumit","zero","hearo"};
        // Arrays.sort(names,compareInDir(-1));

        Arrays.sort(names,reverse(String::compareToIgnoreCase));

        for(String n:names){
            System.out.println(n);
        }
    }

    // public static void repeat(int n,Runnable action){
    //     for(int i = 0; i<10; i++) action.run();
    // }

    public static void repeat(int n, IntConsumer action){
        for(int i = 0; i<n; i++) action.accept(i);
    }

    public static Comparator<String> compareInDir(int direction){
        return (x,y)-> direction * x.compareTo(y);
    }

    public static Comparator<String> reverse(Comparator<String> comp){
        return (x,y)-> comp.compare(y,x);
        
    }

}
