package Java.Day14multithreading.synchronization;

class Counter{
    private int count;

    // public void increment(){  //yehi to method jo ek common object ko use kr rha hai
    //     count++;
    // }

    // public synchronized void increment(){
    //     count++;
    // }

    public void increment(){
        synchronized(this){
            count++;
        }
    }

    public int getCount(){
        return count;
    }
}

class MyThread extends Thread{
    private Counter counter;

    public MyThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i = 0; i<1000; i++){
            counter.increment();
        }
    }
}


public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        //dono threads ek hi counter object ko use kr rha hai to count ki value har bar different ayegi
        //to solve this we use synchronized keyword or block
        //1. make the function synchronized
        //2. use synchronized block to make that particular operation synchronized
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(Exception e){

        }

        System.out.println(counter.getCount());
    }
}
