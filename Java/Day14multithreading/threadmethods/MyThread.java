package Java.Day14multithreading.threadmethods;

/*
    start()
    run()
    Thread.currentThread()
    Thread.sleep()
    Thread.currentThread().getName() /getPriority() /setName() /setPriority()
    thread_name.join()
    interrupt() -> thread jo bhi state me hai usse interrupt krdo bs
    yield() -> dusre thread ko bhi chance do
    setdaemon() -> ye wo thread hote hia jo background me chlte hia and jvm inkeliye wait nhi krta to get them complete
*/

// public class MyThread extends Thread{
//     MyThread(String name){
//         super(name);
//     }
//     @Override
//     public void run() {
//         for(int i=0; i<5; i++){
//             String a = "";
//             for(int j = 0; j< 10000; j++){
//                 a+= "a";
//             }
//             System.out.println("Thread name " + Thread.currentThread().getName() + "  " + Thread.currentThread().getPriority() + " i " + i);
//             try{
//                 Thread.sleep(1000);
//             }catch(InterruptedException e){
//                 System.out.println(e);
//             }

//         }
//     }
// }

// class Test{
//     public static void main(String[] args) {
//         MyThread l = new MyThread("low priority");
//         MyThread m = new MyThread("medium priority");
//         MyThread h = new MyThread("high priority");

//         l.setPriority(Thread.MIN_PRIORITY);
//         m.setPriority(Thread.NORM_PRIORITY);
//         h.setPriority(Thread.MAX_PRIORITY);

//         l.start();
//         m.start();
//         h.start();
//     }
// }

// public class MyThread extends Thread{
//     @Override
//     public void run() {
//         try{
//             Thread.sleep(1000);
//         }catch(InterruptedException e){
//             System.out.println(e);
//         }

//         System.out.println("Thread is running");

//     }
// }

// class Test{
//     public static void main(String[] args) {
//         MyThread t1 = new MyThread();
//         t1.start();
//         t1.interrupt();
//     }
// }

// public class MyThread extends Thread {
//     @Override
//     public void run() {
//         for(int i = 0; i<5; i++){
//             System.out.println(Thread.currentThread().getName() + " is running");
//             Thread.yield();
//         }
//     }

//     public static void main(String[] args) {
//         MyThread t1 = new MyThread();
//         MyThread t2 = new MyThread();

//         t1.start();
//         t2.start();
//     }
// }

// public class MyThread extends Thread{
//     @Override
//     public void run() {
//         while(true){
//             System.out.println("hello");
//         }
//     }

//     public static void main(String[] args) {
//         MyThread mythread = new MyThread();
//         mythread.setDaemon(true);
//         mythread.start();
//         System.out.println("main done");
//     }
//     //main thread humara user thread hai is keliye jvm wait krega & mythread ko humne daemon thread bana diya isliye infinite loop nhi chl rha
// }
public class MyThread extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        mythread.setDaemon(true);
        MyThread t2 = new MyThread();
        t2.start(); 
        mythread.start();
        System.out.println("main done");
    }
    //ab t2 is not daemon thread so jvm will wait & infinte loop run
}