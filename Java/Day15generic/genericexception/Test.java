package Java.Day15generic.genericexception;

//we can't make generic exception but we can do make generic constructor


class MyException extends Exception{
   public<T> MyException(T value){
    super("Exception related to value: "+ value.toString() + " of type " + value.getClass().getName());
   }
}

public class Test {
public static void main(String[] args) {
        try{
        throw new MyException(123);
    }catch(MyException e){
        System.out.println(e.getMessage());
    }
        try{
        throw new MyException("string");
    }catch(MyException e){
        System.out.println(e.getMessage());
    }
}
}
