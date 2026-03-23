package Java.Day10innerclass.anonymousinnerclass;

public interface Payment {
    void pay(double amount);
}

class ShoppingCart{

    private double totalAmount;

    public ShoppingCart(double amount){
        totalAmount = amount;
    }

    public void processPayment(Payment paymentMethod){
        paymentMethod.pay(totalAmount);
    }
}

class Test{
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart(150.15);
        shoppingCart.processPayment(new Payment() {
            public void pay(double amount){
                System.out.println("Paid " + amount + " using credit card.");
            }
        });
    }
}
