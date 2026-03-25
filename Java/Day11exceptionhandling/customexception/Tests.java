package Java.Day11exceptionhandling.customexception;

class InSufficientBalance extends Exception{
    @Override
    public String toString() {
        return "no money";
    }
}

public class Tests {
     public static void main(String[] args) {
        Bank account = new Bank(10);
        try{
            account.withdraw(11);
        }catch(InSufficientBalance e){
            System.out.println(e);
        }
    }
}


class Bank{
    private int balance;

    public Bank(int amount){
        this.balance = amount;
    }

    public void withdraw(int amount) throws InSufficientBalance{
       if(amount > balance){
        throw new InSufficientBalance();
       } 
       balance-=amount;
    }
}
