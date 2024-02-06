public class HotelRoom {
    int roomNumber;
    int nGuests;
    Person guestOne;
    Person guestTwo;

    HotelRoom(int rn){
        roomNumber = rn;
        nGuests = 0;
    }

    void checkIn(Person guest){
        if(guestOne == guest || guestTwo == guest){
            System.out.println(guest.name + " is already checked into this room.");
        }
        else{
            if(guestOne == null){
                guestOne = guest;
                nGuests++;
            }
            else if(guestTwo == null){
                guestTwo = guest;
                nGuests++;
            }
            else{
                System.out.println("We're sorry, Room " + roomNumber + " is currently full.");
            }
        }
    }

    void checkOut(Person guest){
        if(guestOne == guest){
            guestOne = null;
            nGuests --;
        }
        else if(guestTwo == guest){
            guestTwo = null;
            nGuests --;
        }
    }

    void printGuestInfo(){
        if(guestOne == null && guestTwo == null){
            System.out.println("There are currently no guests in room " + roomNumber);
        }
        else{
            if(guestOne != null){
                guestOne = null;
                guestOne.printInfo();
            }
            if(guestTwo != null){
                guestTwo.printInfo();
            }
        }
        
    }

    int checkCapacity(){
        return nGuests;
    }


}
