package Protected;


//protected ko hum different package me sirf us class ke andr use kr skte hai jo usse extends krta ho
//if we are in same package then we can use protected anywhere in that particular package

public class Animal {
    protected void sound(String s){
        System.out.println(s);
    }
}
