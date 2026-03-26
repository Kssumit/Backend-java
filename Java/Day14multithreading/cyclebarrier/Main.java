package Java.Day14multithreading.cyclebarrier;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int numberofService = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numberofService);
        CyclicBarrier barrier = new CyclicBarrier(numberofService);
        executorService.submit(new Dependent(barrier));
        executorService.submit(new Dependent(barrier));
        executorService.submit(new Dependent(barrier));
        System.out.println("All dependent services completed. starting main services.....");
        executorService.shutdown();

    }
}

//countdownlatch is not reusable
//cyclebarrier dont block the main thread

class Dependent implements Callable<String> {

    private CyclicBarrier barrier;

    public Dependent(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public String call() throws Exception {
            System.out.println(Thread.currentThread().getName() + " service started");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " is waiting at the barrier");
            barrier.await();
        return "ok";
    }
}
