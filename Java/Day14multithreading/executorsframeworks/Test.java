package Java.Day14multithreading.executorsframeworks;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

//ye sab to hum manually kr rhe hai thread bho create kr rhe hai and logic bhi
//here comes executor framework which handle the thread part


// public class Test {
//     public static void main(String[] args) {
//         long startTime = System.currentTimeMillis();

//         Thread[] threads = new Thread[9];

//         for (int i = 1; i < 10; i++) {
//             int finalI = i;
//             threads[i - 1] = new Thread(() -> {
//                 long res = factorial(finalI);
//                 System.out.println(res);
//             });
//             threads[i-1].start();
//         }

//         for(Thread thread: threads){
//             try{
//                 thread.join();
//             }catch(InterruptedException e){
//                 Thread.currentThread().interrupt();
//             }
//         }
//         System.out.println("Total time: " + (System.currentTimeMillis() - startTime));
//     }

//     public static int factorial(int val) {
//         int ans = 1;
//         for (int i = 1; i <= val; i++) {
//             ans *= i;
//         }
//         return ans;
//     }
// }


// public class Test {
//     public static void main(String[] args) {
//         long startTime = System.currentTimeMillis();

//         ExecutorService executor = Executors.newFixedThreadPool(2);

//         for (int i = 1; i < 10; i++) {
            
//             int finalI = i;
//             executor.submit(() -> {  //this submit method also return we can get that if want example below
//                 long res = factorial(finalI);
//                 System.out.println(res);
//             });
//         }

//         executor.shutdown();
//         //main thread dont wait for executor to shutdown all thread so we use different thing
//         try{
//             // executor.awaitTermination(100, TimeUnit.SECONDS); //100 sec tak wait krega to for executor to execute all thread
//             //if 100s me nhi hoga to aage bad jayega
//             //if unlimited wait krna ho?
//             //executor.awaitTermination() it return true if execution complete else false
//             while(!executor.awaitTermination(1,TimeUnit.NANOSECONDS)){
//                 System.out.println("waiting...");
//             }
//             //1ms me work done then true which become false and waiting loop 
//             //else it will wait until work complete
//         }catch(InterruptedException e){

//         }
//         System.out.println("Total time: " + (System.currentTimeMillis() - startTime));
//     }

//     public static int factorial(int val) {
//         int ans = 1;
//         for (int i = 1; i <= val; i++) {
//             ans *= i;
//         }
//         return ans;
//     }
// }


public class Test{
    public static void main(String[] args) throws Exception{
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future  = executor.submit(()->42);
        System.out.println(future.get());
        executor.shutdown();
    }
}
//important point about get()
//get() wait bhi krta hai for executor to complete the task but isDone() don't wait



//runnable and callable
/*
    Future<Integer> future  = executor.submit(()->42);
    isme submit me humne callable diya jo kiya return krta hai 
    
    Future<?> future  = executor.submit(()->System.out.println("hello"));
    ye runnable hai jo ki kch bhi return nhi krta hai but jo submit method hai wo return krta hai
    kya return krta hai ? status return krta hai
    isme hum future.get() use kr skte hai but it don't give anything but we can use it for waiting

    future.isDone() aur is type ke method use kr skte hai
*/