package Java.Day14multithreading.threadcommunication;
/*
    wait-> thread will release the lock and wait until another thread run notify or notifyAll
    notify-> wake up the single thread that is waiting
    notifyAll -> wake ups the all thread that are waiting

*/
class SharedResource{
    private int data;
    private boolean hasData;

    public synchronized void produce(int value){
        while (hasData) {
            try{
                wait();
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }

        data = value;
        hasData = true;
        System.out.println("Produced i" + value);
        notify();
    }

    public synchronized int consume() {
        while (!hasData) {
            try{
                wait();
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        System.err.println("Consumed: "+ data);
        notify();
        return data;

    }
}

class Producer implements Runnable{
    private SharedResource resource;
    public Producer(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        for(int i = 0; i<10; i++){
            resource.produce(i);
        }
    }
}
class Consumer implements Runnable{
    private SharedResource resource;


    public Consumer(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        for(int i = 0; i<10; i++){
            int val = resource.consume();
        }
    }
}
public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();
    }
}
