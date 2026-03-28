package Java.Day15generic.genericclass;

/*
    T: placeholder hai 
        we can single or multiple placeholder here
*/

//single placeholder example
// class Box<T>{
//     private T value;

//     public void setValue(T value){
//         this.value = value;
//     }

//     public T getValue(){
//         return value;
//     }
// }

// public class GenericClass {
//     public static void main(String[] args) {
//         Box<Integer> box = new Box<>();
//         box.setValue(5);
//         int i = box.getValue();
//         System.out.println(i);
//     }
// }

//multiple placeholder
class Pair<K,V>{
    private K key;
    private V value;

    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        Pair<Integer,String> pair = new Pair<>(1, "sumit");
        System.out.println(pair.getKey() + " is the roll number of " + pair.getValue());
    }
}

