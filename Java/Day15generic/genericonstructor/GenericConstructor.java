package Java.Day15generic.genericonstructor;

//constructor can be generic no matter if class is generic or not
public class GenericConstructor {
    public <T> GenericConstructor(T val){}
    public <T extends Number> GenericConstructor(T val){}
}
