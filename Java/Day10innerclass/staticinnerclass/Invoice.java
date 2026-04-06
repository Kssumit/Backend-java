package Java.Day10innerclass.staticinnerclass;

import java.util.ArrayList;

// public class Computer {
//     private String brand;
//     private String model;

//     private OperatingSystem os;

//     public OperatingSystem getInfo(){
//         return os;
//     }

//     static class USB{
//         private String type;

//         public USB(String type){
//             this.type = type;
//         }

//         public void display(){
//             System.out.println("type "+ type);
//         }
//     }

//     public Computer(String brand, String model , String osName){
//         this.brand = brand;
//         this.model = model;
//         this.os = new OperatingSystem(osName);
//     }

//     class OperatingSystem{

//         private String osName;

//         public OperatingSystem(String osName){
//             this.osName = osName;
//         }

//         public void displayInfo() {
//             System.out.println("Computer Model: " + model + "os: " + osName);
//         }
//     }
// }

// class Test{
//     public static void main(String[] args) {
//         Computer computer = new Computer("Hp", "abc", "window");
//         computer.getInfo().displayInfo(); //using nestclass method without creating its object

//         //static class
//         //no need of outer class object
//         Computer.USB usb = new Computer.USB("TYPE-C");
//         Computer.USB usb1 = new Computer.USB("TYPE-C");
//     }
// }

public class Invoice{
    private static class Item{
        String d;
        int q;
        double unitP;

        double price(){return q*unitP;}
    }

    private ArrayList<Item> items = new ArrayList<>();
    
    public void add(String d, int q, double p){
          var newItem = new Item();
          newItem.d = d;
          newItem.q = q;
          newItem.unitP = p;

          items.add(newItem);
    }
}

class Test{
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.add("s", 1, 10);
        
    }
}