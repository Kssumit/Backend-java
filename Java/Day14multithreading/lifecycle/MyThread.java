package Java.Day14multithreading.lifecycle;

public class MyThread extends Thread{
    
    @Override
    public void run() {
        System.out.println("Running");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();//New
        System.out.println(t1.getState());

        t1.start();//Runnable
        System.out.println(t1.getState());

        Thread.sleep(1000);//blocked/waiting
        System.out.println(t1.getState()); 

        t1.join();//terminated
        System.out.println(t1.getState());

    }
}
