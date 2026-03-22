package Java.Day08final;

/*
    1. final variable can never be modified
    2. final method can never be override
    3. final class can never be inherit
*/

public final class Test {
    public final int a = 6;
    // a = 7;

    public final int add(int a, int b){
        return a+b;
    }

}

// class Example extends Test{} 
