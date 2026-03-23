package Java.Day10innerclass.localinnerclass;

public class Hotel {
    private String name;
    private int totalRooms;
    private int reservedRooms;

    public Hotel(String name, int totalRooms, int reservedRooms){
        this.totalRooms = totalRooms;
        this.name = name;
        this.reservedRooms = reservedRooms;
    }

    public void reserveRoom(String guestName, int numOfRoom){

        class  ReservationValidator {
            boolean validate() {
                if(guestName == null || guestName.isBlank()){
                    System.out.println("guest name cannot be empty");
                    return false;
                }

                if(numOfRoom<0){
                    System.out.println("num of room should be positive");
                    return false;
                }

                if(numOfRoom + reservedRooms > totalRooms){
                    System.out.println("no room ");
                    return false;
                }

                return true;
            }
            
        }
        
        ReservationValidator validator = new ReservationValidator();

        if(validator.validate()){
            reservedRooms += numOfRoom;
            System.out.println("Reservation confirmed for " +  guestName + " for " + numOfRoom + " rooms.");
        }

        else{
            System.out.println("reservation got cancelled");
        }
    
    }
}

class Test{
    public static void main(String[] args) {
        Hotel hotel = new Hotel("abc", 10, 5);
        hotel.reserveRoom("jack", 5);
        hotel.reserveRoom("jonas", 1);
    }
}
