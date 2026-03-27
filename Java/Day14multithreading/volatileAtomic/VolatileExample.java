package Java.Day14multithreading.volatileAtomic;

class SharedObj{
    private volatile boolean flag = false;

    public void setFlagTrue(){
        System.out.println("flag ko true krdiya");
        flag = true;
    }

    public void printIfFlagTrue(){
        while (!flag) {
            
        }
        System.out.println("Flag is true");
    }
}

public class VolatileExample {
    public static void main(String[] args) {
        SharedObj sharedObj = new SharedObj();

        Thread writerThread = new Thread(()->{
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                Thread.currentThread().interrupt();;
            }

            sharedObj.setFlagTrue();
        });

        Thread readerThread = new Thread(()->sharedObj.printIfFlagTrue());

        writerThread.start();
        readerThread.start();
    }
}

//reader thread loop me fas jayega bcz writer thread 1s bad flag ko true krega and tab tak reader thread chl jayega jiskeliye flag 
//false hai and all thread local variable ki value cache me store krke rkte hai that's why 1s bad flag true ho rha to ab readerThread keliye 
//nhi hoga

//to solve this jisko cache me store nhi krwana uske age volatile keyword -> ab wo main memory me hoga sab thread ek ko access krnge 
