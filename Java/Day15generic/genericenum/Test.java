package Java.Day15generic.genericenum;

enum Operation{
    ADD,SUBSTRACT,MULTIPLY,DIVIDE;

    public <T extends Number> double apply(T a,T b){
        switch (this){
            case ADD: 
                return a.doubleValue() + b.doubleValue();
            case SUBSTRACT:
                return a.doubleValue() - b.doubleValue();
            case MULTIPLY:
                return a.doubleValue()*b.doubleValue();
            case DIVIDE:
                return a.doubleValue()/b.doubleValue();
            default:
                throw new AssertionError("unknown operation: " + this);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        double ans = Operation.ADD.apply(3,4);
        System.out.println(ans);
    }
    
}
