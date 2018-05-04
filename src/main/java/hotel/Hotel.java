package hotel;

import hotel.rooms.BedRoom;
import hotel.rooms.ConferenceRoom;
import hotel.rooms.DiningRoom;
import hotel.rooms.Room;

import java.util.ArrayList;

public class Hotel {

    ArrayList<BedRoom> bedRooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    ArrayList<DiningRoom> diningRooms;

    public Hotel() {
        this.bedRooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.diningRooms = new ArrayList<>();
    }

    public ArrayList<BedRoom> getBedRooms() {
        return bedRooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public ArrayList<DiningRoom> getDiningRooms() {
        return diningRooms;
    }

    public void addBedRooms(BedRoom bedRoom) {
        this.bedRooms.add(bedRoom);
    }

    public void addConferenceRooms(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void addDiningRooms(DiningRoom diningRoom) {
        this.diningRooms.add(diningRoom);
    }

    public int countBedRooms() {
        return this.getBedRooms().size();
    }

    public int countConferenceRooms() {
        return this.getConferenceRooms().size();
    }

    public int countDiningRooms() {
        return getDiningRooms().size();
    }

    public void checkGuestInToBedRoom(BedRoom bedRoom, Guest guest, int numberOfNights) {
        bedRoom.addGuestToRoom(guest, numberOfNights);
    }

    public void admitGuestToRoom(Room room, Guest guest) {
        room.addGuestToRoom(guest);
    }

    public void checkGuestOut(Room room) {
        room.removeGuestFromRoom();
    }

    public ArrayList<Room> getVacantBedRooms() {
        ArrayList emptyBedRooms = new ArrayList<Room>();
        for (BedRoom bedroom : bedRooms) {
            if (bedroom.countGuestsInRoom() == 0) {
                emptyBedRooms.add(bedroom);
            }
        }
        return emptyBedRooms;
    }

    public ArrayList<Room> getVacantConferenceRooms() {
        ArrayList emptyConferenceRooms = new ArrayList<Room>();
        for (ConferenceRoom conferenceRoom : conferenceRooms) {
            if (conferenceRoom.countGuestsInRoom() == 0) {
                emptyConferenceRooms.add(conferenceRoom);
            }
        }
        return emptyConferenceRooms;
    }

    public ArrayList<Room> getVacantDiningRooms() {
        ArrayList emptyDiningRooms = new ArrayList<Room>();
        for (DiningRoom diningRoom : diningRooms) {
            if (diningRoom.countGuestsInRoom() == 0) {
                emptyDiningRooms.add(diningRoom);
            }
        }
        return emptyDiningRooms;
    }

}
