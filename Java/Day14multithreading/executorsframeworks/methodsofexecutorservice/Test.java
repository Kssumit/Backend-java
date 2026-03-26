package Java.Day14multithreading.executorsframeworks.methodsofexecutorservice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/*
    1. submit(runnable)
    2. submit(callable)
    3. submit(runnable,result) // future.get() will return the result after full completion
    4. shutdown()
    5. shutdownnow()  // intni jldi bnd krta ki thread bhi run nhi ho pata
    6. awaitTermination()
    7. isShutdown() //give true is thread shutdown
    8. isTerminated()
    9. invokeAll(list) //takse collection of task and return a collection of future holding their status and results
    10. invokeAll(list,timeout) //humne time limit laga di ki jitne task given time complete hogye wo return krdo baki ko chd do(cancel hojnye)
    11. invokeAny() // list lega tasks ki jo task phele hojyega usse return kr dega baki cancel hojnye
*/

//submit(runnable,res)
// public class Test {
//     public static void main(String[] args) throws Exception {
//         ExecutorService executor = Executors.newSingleThreadExecutor();
//         Future<?> future = executor.submit(()->System.out.println("hello"),"done");
//         System.out.println(future.get());
//     }
// }


//isShutDown()
// public class Test {
//     public static void main(String[] args) throws Exception {
//         ExecutorService executor = Executors.newSingleThreadExecutor();
//         Future<Integer> future = executor.submit(()->1+2);
//         Integer i = future.get();
//         System.out.println(i);
//         executor.shutdown();
//         System.out.println(executor.isShutdown());

//     }
// }


//isTerminated() : dekho shutdown hone ke baad bhi kch ms tak work chl ta rha hai isliye ye false deta 
//if we sleep to block thread for sometime then it will give true because those small will be completely shutdown in that blocked time
// public class Test {
//     public static void main(String[] args) throws Exception {
//         ExecutorService executor = Executors.newSingleThreadExecutor();
//         Future<Integer> future = executor.submit(()->1+2);
//         Integer i = future.get();
//         System.out.println(i);
//         executor.shutdown();
//         Thread.sleep(1);
//         System.out.println(executor.isTerminated());

//     }
// }

//invokeAll(): ek sath execute kara tha hai
//main thread wait krega for all task to get complete
// public class Test {
//     public static void main(String[] args) throws Exception {
//         ExecutorService executor = Executors.newSingleThreadExecutor();
//         Callable<Integer> callable1 = () -> {
//             System.out.println("task 1");
//             return 1;
//         };
//         Callable<Integer> callable2 = () -> {
//             System.out.println("task 2");
//             return 2;
//         };
//         Callable<Integer> callable3 = () -> {
//             System.out.println("task 3");
//             return 3;
//         };

//         List<Callable<Integer>> list = Arrays.asList(callable1,callable2,callable3);
//         List<Future<Integer>> futures = executor.invokeAll(list);
//         for (Future<Integer> future : futures) {
//             System.out.println(future.get());
//         }
//         executor.shutdown();
//     }
// }

//invokeAll(list,timeout)
// public class Test {
//     public static void main(String[] args) throws Exception {
//         ExecutorService executor = Executors.newFixedThreadPool(2);
//         Callable<Integer> callable1 = () -> {
//             Thread.sleep(1000);
//             System.out.println("task 1");
//             return 1;
//         };
//         Callable<Integer> callable2 = () -> {
//             Thread.sleep(1000);
//             System.out.println("task 2");
//             return 2;
//         };
//         Callable<Integer> callable3 = () -> {
//             Thread.sleep(1000);
//             System.out.println("task 3");
//             return 3;
//         };

//         List<Callable<Integer>> list = Arrays.asList(callable1,callable2,callable3);
//         List<Future<Integer>> futures = executor.invokeAll(list,1000,TimeUnit.MILLISECONDS);
//         //sirf 2 task complete honge and exception ajyega
//         for (Future<Integer> future : futures) {
//             System.out.println(future.get());
//         }
//         executor.shutdown();
//     }
// }

//invokeAny()
public class Test {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Callable<Integer> callable1 = () -> {
            Thread.sleep(1000);
            System.out.println("task 1");
            return 1;
        };
        Callable<Integer> callable2 = () -> {
            Thread.sleep(1000);
            System.out.println("task 2");
            return 2;
        };
        Callable<Integer> callable3 = () -> {
            Thread.sleep(1000);
            System.out.println("task 3");
            return 3;
        };

        List<Callable<Integer>> list = Arrays.asList(callable1,callable2,callable3);
        Integer i = executor.invokeAny(list);
        System.out.println(i);

        executor.shutdown();
    }
}
