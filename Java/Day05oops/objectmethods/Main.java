package Java.Day05oops.objectmethods;

import java.util.ArrayList;
import java.util.Arrays;

//toString method
// class Employee{
//     private String name = "hero";

//     public String toString(){
//         return getClass().getName() + " [name = " + name + "]";
//     }
// }

// class Manager extends Employee{
//     private int bonus = 1000;
//     public String toString(){
//         return super.toString() + " [bonus = " + bonus + "]";
//     }
// }


// class Fred implements Cloneable{
//     private String name = "hero";
//     public void setName(String name){
//         this.name = name;
//     }

//     public void getName(){
//         System.out.println(name);
//     }
//     public Fred clone() throws CloneNotSupportedException{
//         return (Fred) super.clone();
//     }
// }


class Message implements Cloneable{
    private String sender;
    private ArrayList<String> recipients;
    private String text;
    
    public Message(String sender, String text) {
        this.sender = sender;
        this.text = text;
        recipients = new ArrayList<>();
    }
    
    public String getSender() {
		return sender;
	}
    
    public String getRecipientList() {
		return recipients.toString();
	}
    
    public String getText() {
		return text;
	}

    public void addRecipient(String recipient) { 
        recipients.add(recipient);
    };
    // public Message clone() throws CloneNotSupportedException{ //shallow copy
    //     return (Message) super.clone();
    // }
    //deep copy
    // public Message clone(){
    //     var cloned = new Message(sender, text);
    //     cloned.recipients = new ArrayList<>(recipients);

    //     return cloned;
    // }

    public Message clone(){
        try{
            var cloned = (Message) super.clone();
            @SuppressWarnings("unchecked") var clonedRecipients = (ArrayList<String>) recipients.clone();
            cloned.recipients = clonedRecipients;
            return cloned;
        }catch(CloneNotSupportedException e){
            return null;
        }
        
    }
}



public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Message real = new Message("zoo", "tiger is lion");
        Message reel = real.clone();
        real.addRecipient("whale");
        real.addRecipient("tiger");
        
        System.err.println(real.getRecipientList());
        System.err.println(reel.getRecipientList());
        // Fred fred = new Fred();
        // Fred copy = fred.clone();
        // copy.setName("zero");
        // fred.getName();
        // copy.getName();





        // Employee employee = new Employee();
        // System.out.println(employee);

        // String msg = "hello how are you "+employee;
        // System.out.println(msg); 

        // int[] primes = {1,2,4,5};
        // System.out.println(primes.toString());

        // System.out.println(Arrays.toString(primes));

        // Manager manager = new Manager();
        // System.out.println(manager);
    }


}
