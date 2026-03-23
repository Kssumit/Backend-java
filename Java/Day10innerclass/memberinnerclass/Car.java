package Java.Day10innerclass.memberinnerclass;


//inner class behave as a member and its make things easy
public class Car {
    private String model;
    private boolean isEngine;

    Car(String model){
        isEngine = false;
        this.model = model;
    }

    class Engine{
        void start(){
            if(!isEngine){
                isEngine = true;
                System.out.println(model + " engine started");
            }
            else{
                System.out.println(model + " already started");
            }
        }

        void stop(){
            if(isEngine){
                isEngine = false;
                System.out.println(model + " engine stopped");
            }
            else{
                System.out.println(model + " already stopped");
            }
        }
    }
}

class Test{
    public static void main(String[] args) {
        Car car = new Car("alto");
        Car.Engine engine = car.new Engine();

        engine.start();
        engine.start();
        engine.stop();
        engine.stop();
    }
}
