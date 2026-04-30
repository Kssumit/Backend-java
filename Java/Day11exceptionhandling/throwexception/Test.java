package Java.Day11exceptionhandling.throwexception;

//creating our own exceptions

class FileFormatException extends Exception{
    public FileFormatException(){};
    public FileFormatException(String msg){
        super(msg);
    }
}

public class Test{
    public static void main(String[] args) {
        int res = randInt(1, 0);
    }

    public static int randInt(int low, int high){

        if(low > high){
            throw new IllegalArgumentException(
                "low should be <= high"
            );
        }

        return low + (int) Math.random() * (high - low+1 );
    }
}
