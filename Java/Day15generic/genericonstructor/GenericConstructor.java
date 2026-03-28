package Java.Day15generic.genericonstructor;

//constructor can be generic no matter if class is generic or not
public class GenericConstructor {
    public <T> GenericConstructor(T val){}
    public <T extends Number> GenericConstructor(T val){}

    public static void main(String[] args) {
        GenericConstructor obj = new GenericConstructor(1);
        GenericConstructor obj1 = new GenericConstructor("hero");
    }
}
