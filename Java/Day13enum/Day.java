package Java.Day13enum;

public enum Day {
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THRUSDAY("Thrusday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");   //enum constant


    private Day(String lower){
        this.lower = lower;
    }

    private String lower;
    
    public String getLower(){
        return lower;
    }

    public void display() {
        System.out.println("Today is " + this.name());
    }
}

class Test{
    public static void main(String[] args) {
        Day monDay = Day.MONDAY;
        monDay.display();
        int ordinal = monDay.ordinal();
        System.out.println(ordinal);
        Day ans =  Day.valueOf("MONDAY"); //agr monday mil jayega to monday print hoga nhi to exception 
        System.out.println(ans);
        Day[] day = Day.values();
        for(Day i : day){
            System.out.println(i);
        }

        System.out.println(monDay.getLower());
        System.out.println(monDay.equals("Monday"));
    }
}