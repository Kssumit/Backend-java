package Java.Day17patternmatching;

record Point(double x, double y){}
record Circle(Point center, double radius){}
public class Test {
public static void main(String[] args) {
    Point p = new Point(5, 4);
    Circle c = new Circle(new Point(3,4), 5);

    double slope = switch(p){
        case Point(var x, var y) -> y/x;
    };

    System.out.println(slope);

}    
}
