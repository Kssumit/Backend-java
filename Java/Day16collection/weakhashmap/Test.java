package Java.Day16collection.weakhashmap;

import java.util.HashMap;
import java.util.WeakHashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        String key = new String("a");
        mp.put(key, 12);
        System.out.println("before gc: "+ mp);
        key = null;
        System.gc();
        System.out.println("after gc: "+ mp);


        WeakHashMap<String, Integer> wmp = new WeakHashMap<>();
        String k = new String("a");
        wmp.put(k, 12);
        System.out.println("before gc: "+ wmp);
        k = null;
        System.gc();
        System.out.println("after gc: "+ wmp);
    }
}
