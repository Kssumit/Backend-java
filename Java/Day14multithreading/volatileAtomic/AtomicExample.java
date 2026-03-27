package Java.Day14multithreading.volatileAtomic;

import java.util.concurrent.atomic.AtomicInteger;

class VolatileCounter{
    // private int count = 0;
    private AtomicInteger count = new AtomicInteger(0);

    public void increment(){
        count.incrementAndGet();
    }

    public int getCount(){
        return count.get();
    }
}

public class AtomicExample {
    public static void main(String[] args)throws Exception {
        VolatileCounter vc = new VolatileCounter();
        Thread t1 = new Thread(()->{
            for(int i =0 ; i<1000; i++){
                vc.increment();
            }
        });

        Thread t2 =new Thread(()->{
            for(int i =0 ;i <1000; i++){
                vc.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(vc.getCount());

    }
}

//do threads ek hi count ko increase kr rha hai ek sath to value 2000 nhi ayegi 
//solution we can use synchronzied
//or java provide some class AtomicInteger .....