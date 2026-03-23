package Java.Day10innerclass.staticinnerclass;

public class Computer {
    private String brand;
    private String model;

    private OperatingSystem os;

    public OperatingSystem getInfo(){
        return os;
    }

    static class USB{
        private String type;

        public USB(String type){
            this.type = type;
        }

        public void display(){
            System.out.println("type "+ type);
        }
    }

    public Computer(String brand, String model , String osName){
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);
    }

    class OperatingSystem{

        private String osName;

        public OperatingSystem(String osName){
            this.osName = osName;
        }

        public void displayInfo() {
            System.out.println("Computer Model: " + model + "os: " + osName);
        }
    }
}

class Test{
    public static void main(String[] args) {
        Computer computer = new Computer("Hp", "abc", "window");
        computer.getInfo().displayInfo(); //using nestclass method without creating its object

        //static class
        //no need of outer class object
        Computer.USB usb = new Computer.USB("TYPE-C");
        Computer.USB usb1 = new Computer.USB("TYPE-C");
    }
}