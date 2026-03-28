package Java.Day15generic.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//wildcard (?): special kind of type arguments or class definitions to represent an unknown type
//we use ? for read only tasks
public class Test {
    public void print(ArrayList<?> array){
        for(Object el:array){
            System.out.println(el);
        }
    }

    //upperbound
    //Number class ko jo extend krti hai class wohi askti hai
    public static double sum(List<? extends Number> numbers){
        double sum = 0;
        for(Number o: numbers){
            System.out.println(o);
        }
        return sum;
    }

    //lowerbound
    //jo class Integer se upr hai wohi ayegi
    public static void printNumber(List<? super Integer> list){
        for(Object o: list){
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        List<? extends Number> numbers = Arrays.asList(1,2,3);
    }
}
