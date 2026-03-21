package Java.Day01datatypes;
class Datatypes{
    public static void main(String[] arr){
        //byte short int long
        //float double
        //for capacity use MIN_VALUE & MAX_VALUE
        System.out.println(Integer.MIN_VALUE);
        //imp point in long (272822829292929292) this num is out of int range so use l after it, otherwise no need
        long b = 272822829292929292l;
        //double use when more precision needed
        //in float use f after num (bcz java think every decimal num as double)
        float c = 100.282982982f;

        //typecasting : smaller to big (automatic)
        char ch = 'a';
        int x = ch;
        //maunally
        byte y = (byte) x;
    }
}