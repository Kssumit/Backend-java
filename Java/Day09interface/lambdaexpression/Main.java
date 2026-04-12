package Java.Day09interface.lambdaexpression;

import java.util.function.IntConsumer;

// class Demo implements IntConsumer{
//     public void accept(int i){
//         System.out.println(9-i);
//     }
// }

public class Main {
    public static void main(String[] args) {
        repeat(10, (i)->System.out.println("countdown "+ (i)));
    }

    // public static void repeat(int n,Runnable action){
    //     for(int i = 0; i<10; i++) action.run();
    // }

    public static void repeat(int n, IntConsumer action){
        for(int i = 0; i<n; i++) action.accept(i);
    }

}
