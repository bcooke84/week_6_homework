package hotel;

import hotel.rooms.BedRoom;
import hotel.rooms.ConferenceRoom;
import hotel.rooms.DiningRoom;

import java.util.ArrayList;

public class Hotel {

    ArrayList<ConferenceRoom> conferenceRooms;
    ArrayList<DiningRoom> diningRooms;
    ArrayList<BedRoom> bedRooms;

    public Hotel() {
        this.conferenceRooms = new ArrayList<>();
        this.diningRooms = new ArrayList<>();
        this.bedRooms = new ArrayList<>();
    }


}
