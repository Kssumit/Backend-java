package Java.Day14multithreading.executorsframeworks.scheduledexceutorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

//use when agr kaam kch delay ke baad krwana ho 

//schedule(task, delay, timeunit)
// public class Main {
//     public static void main(String[] args) {
//         ScheduledExecutorService schedular = Executors.newScheduledThreadPool(1);
//         schedular.schedule(
//             ()-> System.out.println(" task executed after 5 second delay"),
//             5,
//             TimeUnit.SECONDS
//         );
//         //print statement got run after 5s
//         schedular.shutdown();

//     }    
// }


//scheduleAtFixedRate(task,initial delay,period,timeunit)
// public class Main {
//     public static void main(String[] args) {
//         ScheduledExecutorService schedular = Executors.newScheduledThreadPool(1);
//         schedular.scheduleAtFixedRate(
//             ()-> System.out.println(" task executed after every 5 second"),
//             5,
//             5,
//             TimeUnit.SECONDS
//         );
       
//         // schedular.shutdown();// there is a problem it will not print anything
//         schedular.schedule(()->{
//             System.out.println("initiating shutdown....");
//             schedular.shutdown();
//         }, 20, TimeUnit.SECONDS);

//     }    
// }


//scheduleWithFixedDelay(task,initial delay, delay)
public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService schedular = Executors.newScheduledThreadPool(1);
        schedular.scheduleWithFixedDelay(
            ()-> System.out.println(" task executed after every 5 second"),
            5,
            5,
            TimeUnit.SECONDS
        );
       

        schedular.schedule(()->{
            System.out.println("initiating shutdown....");
            schedular.shutdown();
        }, 20, TimeUnit.SECONDS);

    }    
}
//ye sab method scheduledfuture rteurn krte hai 
        //  ScheduledFuture<?> scheduledFuture = schedular.schedule(()->{
        //     System.out.println("initiating shutdown....");
        //     schedular.shutdown();
        // }, 20, TimeUnit.SECONDS);