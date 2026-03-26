package Java.Day14multithreading.locks;


/*
    lock()
    trylock() -> 1. trylock() 2. trylock(time,timeunit)
    unlock()
    deadlock preventation
    lockInterruptibly()

*/



import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    private final Lock lock = new ReentrantLock();

    public void outerMethod(){
        lock.lock();

        try{
            System.out.println("outer method");
            innerMethod();
        }finally{
            lock.unlock();
        }
    }

    public void innerMethod(){
        lock.lock();
        try{
            System.out.println("inner method");
        }finally{
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLockExample reentrantLockExample = new ReentrantLockExample();
        reentrantLockExample.outerMethod();
    }
}


