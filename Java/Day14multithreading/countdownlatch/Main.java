package Java.Day14multithreading.countdownlatch;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//there is a problem 
//main thread ko wait krna hai jab tak saari dependent service complete nhi ho jati
//uske liye humhe sab keliye .get() likhn apad rha hai
//so here come COUNTDOWNLATCH to solve this
// public class Main {
//     public static void main(String[] args) throws Exception {

//         ExecutorService executorService = Executors.newFixedThreadPool(3);
//         Future<String> future1 = executorService.submit(new Dependent());
//         Future<String> future2 = executorService.submit(new Dependent());
//         Future<String> future3 = executorService.submit(new Dependent());

//         future1.get();
//         future2.get();
//         future3.get();

//         System.out.println("All dependent services completed. starting main services.....");
//         executorService.shutdown();

//     }
// }

//jab humhe bhut sare thread ko unki completion ka wait krna hai then we use it
public class Main {
    public static void main(String[] args) throws Exception {
        int numberofService = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numberofService);
        CountDownLatch latch = new CountDownLatch(numberofService);
        executorService.submit(new Dependent(latch));
        executorService.submit(new Dependent(latch));
        executorService.submit(new Dependent(latch));
        latch.await();
        System.out.println("All dependent services completed. starting main services.....");
        executorService.shutdown();

    }
}

//latch.await(timeout,timeunit) //ex if timeout = 5s then sirf 5s tak wait krega then main thread start executing
//countdownlatch is not reusable

class Dependent implements Callable<String> {

    private CountDownLatch latch;

    public Dependent(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public String call() throws Exception {
        try {
            System.out.println(Thread.currentThread().getName() + " service started");
            Thread.sleep(2000);
        } finally {
            latch.countDown();

        }
        return "ok";
    }
}
