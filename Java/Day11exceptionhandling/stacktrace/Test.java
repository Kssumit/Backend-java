package Java.Day11exceptionhandling.stacktrace;
//stackTrace provide details about method calls that let do exceptions

public class Test {
    public static void main(String[] args) {
        try{
            level1();
        }catch(Exception o){
        //    StackTraceElement[] stackTree =  o.getStackTrace();
        //    for(int i = 0; i<stackTree.length ; i++){
        //     System.out.println(stackTree[i]);
        //    }
        o.printStackTrace();
        }
    }    

    public static void level3(){
        int[] arr = new int[5];
        arr[5] = 5;
    }

    public static void level2(){
        level3();
    }
    public static void level1(){
        level2();
    }
}
