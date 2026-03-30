package Java.Day16collection.list.arraylist;

import java.util.ArrayList;

//array list sam eas array but can change its size dynamicaly


public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(3);

        System.out.println(list.get(0));
        System.out.println(list.size());
        System.out.println(list.contains(3)); //true
        

        list.remove(2);
        list.add(2,40);
        list.set(2,50);
        list.set(1,50);
        System.out.println(list);
    }
}
