package Java.Day05oops;

import java.time.DayOfWeek;
import java.time.LocalDate;

class Cat{
    private String name;
    private String gender;

    public void setName(String name){
        this.name = name;
    }

}

record Point(double x, double y) {} 

public class Encapsulation {
    public static void main(String[] aa){

        var p = new Point(2,5);
        double slope = p.x()/p.y();
        System.out.println(slope);

        double slope1 = switch(p){
            case Point(var a, var b) -> b/a;
        };
        System.out.println(slope1);



        //In this properties are private and methods are public
        LocalDate date = LocalDate.of(2026, 4, 1);
        date = date.plusDays(1);
        // System.out.println(date);

        // while (date.getMonthValue()==1) {
        //     System.out.printf("%4d",date.getDayOfMonth());
        //     date = date.plusDays(1);
        // }
        
        DayOfWeek weekDay = date.getDayOfWeek();
        // System.out.println(weekDay);
        int value = date.getDayOfWeek().getValue();

        for(int i = 1; i<=7 ; i++){
            System.out.printf("%s  ",weekDay);
        }


        
        }
    }

