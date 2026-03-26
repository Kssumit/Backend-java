package Java.Day14multithreading.locks.unfairlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// public class UnFairLock {
//     private final Lock unfairlock = new ReentrantLock();

//     public void accessResource(){
//         unfairlock.lock();
//         try{
//             System.out.println(Thread.currentThread().getName()+ " acquired the lock");
//             Thread.sleep(1000);

//         }catch(Exception e){
//             Thread.currentThread().interrupt();
//         }finally{
//             System.out.println(Thread.currentThread().getName()+ " released the lock");
//             unfairlock.unlock();
//         }
//     }

//     public static void main(String[] args) {
//         UnFairLock unFairLock = new UnFairLock();
//         Runnable task = new Runnable() {
//             @Override
//             public void run() {
//                 unFairLock.accessResource();
//             }
//         };

//         Thread t1 = new Thread(task, "t1");
//         Thread t2 = new Thread(task, "t2");
//         Thread t3 = new Thread(task, "t3");

//         t1.start();
//         t2.start();
//         t3.start();
//     }
// }

//fair me sabho thread ko chance milegya 
//jis order me request krnge thread os ko ussi order me thread chlenge
public class FairLock {
    private final Lock lock = new ReentrantLock(true);

    public void accessResource(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+ " acquired the lock");
            Thread.sleep(1000);

        }catch(Exception e){
            Thread.currentThread().interrupt();
        }finally{
            System.out.println(Thread.currentThread().getName()+ " released the lock");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        FairLock fairLock = new FairLock();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                fairLock.accessResource();
            }
        };

        Thread t1 = new Thread(task, "t1");
        Thread t2 = new Thread(task, "t2");
        Thread t3 = new Thread(task, "t3");

        t1.start();
        t2.start();
        t3.start();
    }
}
