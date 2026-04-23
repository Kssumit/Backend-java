

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

enum Modifier{
    PRIVATE, PUBLIC, STATIC, PROTECTED;
    private int mask;

    static{
        int bit = 1;
        for(Modifier m: Modifier.values()){
            m.mask = bit;
            bit*=2;
        }
    }

    public int getMask(){return mask;}
}

public class Test {
    public static void main(String[] args) {
        Size small = Size.SMALL;
        System.out.println(small.toString());
        Size notSize = Size.valueOf("SMALL");
        System.out.println(notSize);

        System.out.println(Size.SMALL.getAb());

        System.out.println(Operation.ADD.eval(3,2));
        System.out.println(eval(Op.ADD, 3, 1));


        System.out.println(Modifier.PROTECTED.getMask());
        System.out.println(Modifier.PUBLIC.getMask());
    }

    public static int eval(Op op, int a, int b){
            return switch(op){
                case ADD -> a + b;
                case SUBSTRACT -> a - b;
            };
    }
}
