package Java.Day09interface;

import java.util.Arrays;
import java.util.Comparator;

class LengthCompare implements Comparator<String>{
    public int compare(String a, String b){
        return a.length() - b.length();
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        Comparator<String> LengthObj = new LengthCompare();
        String[] names = {"Harry","amit","sumit","cheetah"};
        Arrays.sort(names,LengthObj);
        for(String n:names){System.out.println(n);}
    }    
}
