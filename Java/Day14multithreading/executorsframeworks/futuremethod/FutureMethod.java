package Java.Day14multithreading.executorsframeworks.futuremethod;
/*
    1. get()
    2. get(time) // itne time tak wait krli jiyega if result not come then throw exception timeout
    3. isDone() //give true if task got complete or an execption is occurred
    4. isCancelled()
    5. cancel(true | false) // if we give true then if task is running or not you have to cancel it no matter 
                // but if you give false then if task is not running then it got interrupt but if
                // task is running it didn't get interrupt task will run but isCancelled() will give true
*/

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.StructuredTaskScope.TimeoutException;

import javax.management.RuntimeErrorException;

//get(),isDone()
// public class FutureMethod {
//     public static void main(String[] args) {
//             ExecutorService executor = Executors.newSingleThreadExecutor();
//     Future<Integer> future = executor.submit(()->42);
//     Integer i = null;
//     try{
//         System.out.println(future.isDone()); //it can give true or false
//         i = future.get();
//         System.out.println(i);
//         System.out.println(future.isDone()); //give true why? bcz humne .get() ki wajah se wait krliya hai thread complete ho chuka hai
//     }catch(InterruptedException | ExecutionException e){
//         System.out.println(e);
//     }

//     executor.shutdown();
//     }
// }

//get(time) 
// public class FutureMethod {
//     public static void main(String[] args) {
//         ExecutorService executor = Executors.newSingleThreadExecutor();
//     Future<Integer> future = executor.submit(()->{
//         try{
//             Thread.sleep(2000);
//         }catch(InterruptedException e){
//             System.out.println(e);
//         }

//         return 42;
//     });
//     Integer i = null;
//     try{
//         System.out.println(future.isDone()); //it can give true or false
//         i = future.get(1, TimeUnit.SECONDS);
//         System.out.println(i);
//         System.out.println(future.isDone()); //give true why? bcz humne .get() ki wajah se wait krliya hai thread complete ho chuka hai
//     }catch(java.util.concurrent.TimeoutException | InterruptedException | ExecutionException e){
//         System.out.println(e);
//     }
//     executor.shutdown();
//     //execption ayegi bcz wait sirf 1s tak kr rha hai task complete 2s me hoga
//     }
// }

//cancel() & isCancelled()
public class FutureMethod {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
    Future<Integer> future = executor.submit(()->{
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("hello");
        return 42;
    });
        // future.cancel(true);
        
        Thread.sleep(1000);
        future.cancel(false);
        System.out.println(future.isCancelled());
        System.out.println(future.isDone());
         executor.shutdown();

    }
}
