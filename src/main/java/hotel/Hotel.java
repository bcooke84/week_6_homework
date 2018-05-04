package hotel;

import hotel.rooms.BedRoom;
import hotel.rooms.ConferenceRoom;
import hotel.rooms.DiningRoom;
import hotel.rooms.Room;

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

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void addConferenceRooms(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public int countConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public ArrayList<DiningRoom> getDiningRooms() {
        return diningRooms;
    }

    public void addDiningRooms(DiningRoom diningRoom) {
        this.diningRooms.add(diningRoom);
    }

    public int countDiningRooms() {
        return this.diningRooms.size();
    }

    public ArrayList<BedRoom> getBedRooms() {
        return bedRooms;
    }

    public void addBedRooms(BedRoom bedRoom) {
        this.bedRooms.add(bedRoom);
    }

    public int countBedRooms() {
        return this.bedRooms.size();
    }

    public void checkGuestIn(Room room, Guest guest) {
        room.addGuestToRoom(guest);
    }

    public void checkGuestOut(Room room) {
        room.removeGuestFromRoom();
    }

    public ArrayList<Room> getVacantBedRooms() {
        ArrayList emptyRooms = new ArrayList<Room>();
        for (BedRoom bedroom : bedRooms) {
            if (bedroom.countGuestsInRoom() == 0) {
                emptyRooms.add(bedroom);
            }
        }
        return emptyRooms;
    }
}
