package Java.Day16collection.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//array list sam eas array but can change its size dynamicaly
//when you create arraylist, the initial capacity is 10


class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
    
}

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer a, Integer b) {
        //if funxtion return negative then a before b
        //if function return 0 then a and b are equal in ordering
        //if function return positive then a will come after b
        return b - a;
    }
    
}

class Student{
    private String name;
    private double gpa;

    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public double getGpa(){
        return gpa;
    }
}

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>(1000);
        System.out.println(list1.size()); //0
        // System.out.println(list1.get(0)); //error

        list.add(1);
        list.add(1);
        list.add(3);

        System.out.println(list.get(0));
        System.out.println(list.size());
        System.out.println(list.contains(3)); //true
        

        // list.remove(1);
        //remove takes object look below
        List<String> str = new ArrayList<>();
        str.add("jack");
        str.add("jonas");
        str.add("jac");
        str.add("jon");
        str.add("jaat");
        str.remove("jac"); //see here it taking object& above index

        //so how to pass object in above: using wrapper class
        list.remove(Integer.valueOf(1)); // ab 1 object hai naki index to 1 remove hoga not 1 index pr rka element


        list.add(2,40);
        list.set(2,50);
        list.set(1,50);
        System.out.println(list);
        list.trimToSize(); //if capacity is more than the element it is storing then it shrink the size  


        List<String> arr =  Arrays.asList("monday, tuesday, wednesday");  //it return list so we have use List here ArrayList will not work
        //arrays.asList return a fixed size array in this we can't add or remove, only we can replace
        arr.set(0,"sunday");
        //we can make it flexible 
        List<String> list3 = new ArrayList<>(arr);

        List<Integer> lis = List.of(1,2,3,4);
        //isme to replace bhi nhi kr skte hai 
        list.addAll(lis);
        System.out.println(list); //1,50,50,1,2,3,4

        Integer[] array =list.toArray(new Integer[0]);//zero size ki array bana do
        for(int a:array){
            System.out.println(a);
        }

        //sorting
        Collections.sort(list);
            //or
        list.sort(null); //sort in ascending order
        System.out.println(list);
        //in place of null something can come: comparator

        //if we want to sort in descending order then comparator is used
        list.sort(new MyComparator());
        System.out.println(list);



        List<String> words =  Arrays.asList("banana","apple","date");
        words.sort(null); // sort on the basis of character

        //but if we want small word should come first then we have to use comparator
        words.sort(new StringLengthComparator());
        System.out.println(words);

        // we can do in very short way using comparator with lambda expression
        list.sort((a,b)->b-a);
        words.sort((s1,s2)-> s1.length() - s2.length());
        System.out.println(words);



        //example of comparator
        List<Student> students = new ArrayList<>();
        students.add(new Student("rahul", 9.8));
        students.add(new Student("amit",7.5));
        students.add(new Student("jatin", 8.9));
        students.add(new Student("jin", 8.2));
        students.add(new Student("jack", 8.2));
        //default sort will not work here we have to use comparator
        students.sort((a,b)->(int)b.getGpa()- (int)a.getGpa()); //more gpa student should come first;
        for(Student s: students){
            System.out.println(s.getName() + " " + s.getGpa());
        }

        //more easy for this in java 8 comparing
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa); //it give a comparator which sort in asc
        Comparator<Student> comparatorReversed = Comparator.comparing(Student::getGpa).reversed(); //it give a comparator which sort in desc
        Comparator<Student> comparatorReversedWithName = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName); 
        //it give a comparator which sort gpa in desc and then sort on the basis of name char in asc
        students.sort(comparator);
        for(Student s: students){
            System.out.println(s.getName() + " " + s.getGpa());
        }

        students.sort(comparatorReversedWithName);
        for(Student s: students){
            System.out.println(s.getName() + " " + s.getGpa());
        }
        //we can do this in 
        students.sort((a,b)->{
            if(b.getGpa() - a.getGpa() > 0) return 1;
            else if(b.getGpa() - a.getGpa()<0) return -1;
            else{
                return a.getName().compareTo(b.getName()); 
                //same if neg -> a come befor b
                //if pos -> a come after b
                //if 0 -> a & b are equal in ordering
            } 
        });

        int[] num = {1,2,3,4};
        ArrayList<String> name = new ArrayList<>();
        name.add("peter");
        name.add("peter1");
        var names = new ArrayList<String>();
        Arrays.fill(num,0);
        for (int n : num) {
            System.out.println(n);
        }

        System.out.println(Arrays.toString(num));
        System.out.println(name.toString());
        String temp = name.toString();
        System.out.println(temp);

        System.out.println(max(1, 1,2,3,4,5));
        double[] numsss = {1,2,3,4,5,6,7,8};
        System.out.println(max(0,numsss));
    }

    public static double max(double res, double... rest){
        for(double v:rest) res = Math.max(res,v);
        return res;
    }
}
