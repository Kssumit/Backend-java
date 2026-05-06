package Java.Day19logging;

public class Test {
    public static void main(String[] args) {
        System.Logger logger = System.getLogger("sumit");
        String fileName = "data.txt";

        logger.log(System.Logger.Level.INFO,"openning file "+fileName);
    }
     
}
