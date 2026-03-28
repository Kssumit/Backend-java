package Java.Day15generic.boundedtypeparameter;

//Number parent class hai Integer, Double, Float ki
//T sirf inmse ho skta hai 


// public class Box<T extends Number> {
//     private T val;

//     public void setVal(T v){
//         val = v;
//     }

//     public T getVal(){
//         return val;
//     }

//     public static void main(String[] args) {
//         Box<Integer> box = new Box<>();  //Integer ki jagah me Float, Double de skte hai //String not possible 
//         //to ye ek bound lag gya
//     }
// }

//multiple bounds

interface Printable{
    void print();
}

class MyNumber extends Number implements Printable{
    private final int val;

    public MyNumber(int value){
        val = value;
    }

    public void print(){
        System.out.println("MyNumber: " + val);
    }

    public int intValue(){
        return val;
    }

    @Override
    public long longValue() {
        return val;
    }

    @Override
    public float floatValue() {
        return val;
    }

    @Override
    public double doubleValue() {
        return val;
    }    
}

//phele class then interface likhnge
//so T ki jagah wo class ha skti hai jo Number ko extend kre and Printable ko implement
class Boxx<T extends Number & Printable>{
    private T item;

    public Boxx(T item){
        this.item = item;
    }

    public void display(){
        item.print();
    }

    public T getItem(){
        return item;
    }
}

public class Test{
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(12);
        Boxx<MyNumber> box = new Boxx<>(myNumber);
        box.display();
    }
}