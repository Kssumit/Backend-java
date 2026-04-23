

enum Size{
    SMALL("S"),
    MEDIUM("M"),
    LARGE("L");

    private String ab;
    Size(String ab){
        this.ab = ab;
    }

    public String getAb(){
        return ab;
    }
}

enum Operation{
    ADD{
        public int eval(int a, int b){return a+b;}
    },
    SUBSTRACT{
      public int eval(int a, int b){return a-b;}  
    };
    public abstract int eval(int a, int b);
}

enum Op{
    ADD, SUBSTRACT;
}

public class Test {
    public static void main(String[] args) {
        Size notSize = Size.valueOf("SMALL");
        System.out.println(notSize);

        System.out.println(Size.SMALL.getAb());

        System.out.println(Operation.ADD.eval(3,2));
        System.out.println(eval(Op.ADD, 3, 1));
    }

    public static int eval(Op op, int a, int b){
            return switch(op){
                case ADD -> a + b;
                case SUBSTRACT -> a - b;
            };
    }
}
