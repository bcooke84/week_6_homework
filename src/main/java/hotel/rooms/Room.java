package hotel.rooms;

import hotel.Guest;

import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    protected ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void addGuestToRoom(Guest guest) {
        if (this.checkRoomHasSpace() == true) {
        this.guests.add(guest);}
    }

    public Guest removeGuestFromRoom() {
        return this.guests.remove(0);
    }

    public int countGuestsInRoom() {
        return this.guests.size();
    }

    public ArrayList<Guest> getRoomList() {
        return this.getGuests();
    }

    public Boolean checkRoomHasSpace() {
        if (this.capacity > this.countGuestsInRoom()) {
            return true;
        }
        else return false;
    }


}
