package Java.Day14multithreading.methodofcreatingthread.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        for(int i = 0; i<5; i++){
            System.out.println("Thread name =  " +Thread.currentThread().getName() + " " +i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class Test{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        for(int i = 0; i<5; i++){
            System.out.println("Thread name:  " + Thread.currentThread().getName() + " "+ i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
