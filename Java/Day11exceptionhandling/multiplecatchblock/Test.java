package Java.Day11exceptionhandling.multiplecatchblock;
class Student{
    private int id = 7;
    public void getId(){
        System.out.println(id);
    }

}

public class Test {
        public static void main(String[] args) {
        
        int num[] = {25,45,6,8};
        int deno[] = {12,8,0,7};

        for(int i =0 ; i<deno.length; i++){
            System.out.println(divide(num[i],deno[i]));
        }
    }

    public static double divide(int a , int b){
        try{
            Student s = null; 
            s.getId();//nullpointerexception divide wala pr kbhi jayega hi nhi 
            return a/b;
        }catch(ArithmeticException  | IndexOutOfBoundsException e){ // ek ye bhi way hai
            System.out.println(e); //its works same as previous
            return -1;
        }catch(NullPointerException e){
            System.out.println(e);
            return -1;
        }catch(Exception e){
            System.out.println(e);
            return -1;
        }
    }
}
