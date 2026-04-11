package Java.Day09interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class Student implements Comparable<Student> {
    int rollNo;
    String name;
    Student(int roll, String name){
        this.rollNo = roll;
        this.name = name;
    }

    public int compareTo(Student s){
        return this.rollNo - s.rollNo; 
    }

    public String toString(){
        return rollNo + " " + name;
    }
}

public class ComparableExample{
    public static void main(String[] args) {
        Student s1 = new Student(1, "sumit");
        Student s2 = new Student(2, "sumit");
        Student s3 = new Student(3, "sumit");
        Student s4 = new Student(4, "sumit");

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        Student[] arr = {s1,s2,s3,s4};
        Arrays.sort(arr);

        for(Student s:arr){
            System.out.println(s.rollNo+" "+s.name);
        }

        Collections.sort(list);
        System.out.print(list);
        System.out.print(s1.compareTo(s2));
    }
}
