package Java.Day05oops;

//1st grandParent constructor is called then parent then child 

class GrandParent{
    private String name;
    private int age;

    private boolean superPower;

    public GrandParent() {
        superPower = false;
        System.out.println("Grand parent constructor is called");
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println("details about person");
    }

}

class Parent extends GrandParent{
    public Parent(){
        System.out.println("Parent constructor is called");
    }

    public void show(){//method overriding
        System.out.println("parent");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Child constructor is called");
    }

        public void show(){//method overriding
        System.out.println("child");
    }
}




public class Inheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.setName("sumit");
        child.setAge(18);
        System.out.println(child.getAge() + " " + child.getName());
        child.show();
    }
}
