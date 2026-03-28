package Java.Day15generic.genericInterface;

public interface GenericInterface<T> {
    void add(T value);
    
    T get();
}

//now we have to implement this interface
// two ways

//1st way 
class GenericContainer1 implements GenericInterface<String> {
    private String value;

    public void add(String value){
        this.value = value;
    }

    public String get(){
        return value;
    }
}

//2nd way
class GenericContainer2<T> implements GenericInterface<T>{
    private T value;

    public void add(T value){
        this.value = value;
    }

    public T get(){
        return value;
    }
}

