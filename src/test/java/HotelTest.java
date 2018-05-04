import hotel.Guest;
import hotel.Hotel;
import hotel.rooms.BedRoom;
import hotel.rooms.ConferenceRoom;
import hotel.rooms.DiningRoom;
import hotel.rooms.RoomType;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    BedRoom bedRoom1;
    BedRoom bedRoom2;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    DiningRoom diningRoom1;
    DiningRoom diningRoom2;
    Guest guest1;
    Guest guest2;

    @Before
    public void before() {
        hotel = new Hotel();
        bedRoom1 = new BedRoom(RoomType.SINGLE, 1, 40.00);
        bedRoom2 = new BedRoom(RoomType.DOUBLE, 2, 50.00);
        conferenceRoom1 = new ConferenceRoom(1, "North Conference Room", 250.00 );
        conferenceRoom2 = new ConferenceRoom(1, "South Conference Room", 250.00 );
        diningRoom1 = new DiningRoom(1, "Fine Dining");
        diningRoom2 = new DiningRoom(1, "Carvery");
        hotel.addDiningRooms(diningRoom1);
        hotel.addDiningRooms(diningRoom2);
        hotel.addConferenceRooms(conferenceRoom1);
        hotel.addConferenceRooms(conferenceRoom2);
        hotel.addBedRooms(bedRoom1);
        hotel.addBedRooms(bedRoom2);
        guest1 = new Guest();
        guest2 = new Guest();
    }

    @Test
    public void canAddBedRoom() {
        assertEquals(2,hotel.countBedRooms());
    }

    @Test
    public void canAddConferenceRoom() {
        assertEquals(2, hotel.countConferenceRooms());
    }

    @Test
    public void canAddDiningRoom() {
        assertEquals(2, hotel.countDiningRooms());
    }

    @Test
    public void canAddGuestToBedRoom() {
        hotel.checkGuestInToBedRoom(bedRoom1, guest1, 1);
        assertEquals(1, bedRoom1.countGuestsInRoom());
    }

    @Test
    public void willNotAddToBedRoomWhenFull() {
        hotel.checkGuestInToBedRoom(bedRoom1, guest1, 1);
        hotel.checkGuestInToBedRoom(bedRoom1, guest2, 1);
        assertEquals(1, bedRoom1.countGuestsInRoom());
    }

    @Test
    public void canAddGuestToConferenceRoom() {
        hotel.admitGuestToRoom(conferenceRoom1, guest1);
        assertEquals(1, conferenceRoom1.countGuestsInRoom());
    }

    @Test
    public void willNotAddToConferenceRoomWhenFull() {
        hotel.admitGuestToRoom(conferenceRoom1, guest1);
        hotel.admitGuestToRoom(conferenceRoom1, guest2);
        assertEquals(1, conferenceRoom1.countGuestsInRoom());
    }

    @Test
    public void canAddGuestToDiningRoom() {
        hotel.admitGuestToRoom(diningRoom1, guest1);
        assertEquals(1, diningRoom1.countGuestsInRoom());
    }

    @Test
    public void willNotAddToDiningRoomWhenFull() {
        hotel.admitGuestToRoom(diningRoom1, guest1);
        hotel.admitGuestToRoom(diningRoom1, guest2);
        assertEquals(1, diningRoom1.countGuestsInRoom());
    }

    @Test
    public void canRemoveGuestFromRoom() {
        hotel.checkGuestInToBedRoom(bedRoom1, guest1, 1);
        hotel.checkGuestOut(bedRoom1);
        assertEquals(0, bedRoom1.countGuestsInRoom());
    }

    @Test
    public void canGetVacantBedRooms() {
        hotel.checkGuestInToBedRoom(bedRoom1, guest1, 1);
        assertEquals(1, hotel.getVacantBedRooms().size());
    }

    @Test
    public void canGetVacantConferenceRooms() {
        hotel.admitGuestToRoom(conferenceRoom1, guest1);
        assertEquals(1, hotel.getVacantConferenceRooms().size());
    }

    @Test
    public void canGetVacantDiningRooms() {
        hotel.admitGuestToRoom(diningRoom1, guest1);
        assertEquals(1, hotel.getVacantDiningRooms().size());
    }

}
