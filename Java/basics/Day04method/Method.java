package Java.basics.Day04method;

public class Method {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sumOfArray(arr);  //inside static method we can call only static method thats why sumOfArray is static

        Cat a = new Cat();
        a.name = "bob";
        upperFxn(a);
        System.out.println(a.name);
        
        //in varargs we can as many argument we want but its not a array
        int ans = sum(1,2,3,4);
        System.out.println(ans);

    }

    public static void sumOfArray(int[] arr){
        int res = 0;
        for(int i: arr){
            res+=i;
        }
        System.out.println(res);
    }
    //method overloading 
    //in this function signature changes (signature only include fxn name & parameter)
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    //passing values in method
    //primitive datatypes -> call by value
    //reference datatypes (object) -> call by reference bcz inka reference hi pass hota hai
    public static void upperFxn(Cat cat){
        cat.name = cat.name.toUpperCase();
    }

    //varargs
    public static int sum(int... a){
        int res = 0;
        //we only access them as array but ita not a array
        for(int i : a){
            res+=i;
        }
        return res;
    }
}
