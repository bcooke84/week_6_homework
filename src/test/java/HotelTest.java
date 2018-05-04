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
    ConferenceRoom conferenceRoom;
    DiningRoom diningRoom;
    Guest guest1;
    Guest guest2;

    @Before
    public void before() {
        hotel = new Hotel();
        bedRoom1 = new BedRoom(RoomType.SINGLE, 1, 40.00);
        bedRoom2 = new BedRoom(RoomType.DOUBLE, 2, 50.00);
        conferenceRoom = new ConferenceRoom(1, "North Conference Room", 250.00 );
        diningRoom = new DiningRoom(1, "Fine Dining");
        hotel.addDiningRooms(diningRoom);
        hotel.addConferenceRooms(conferenceRoom);
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
        assertEquals(1, hotel.countConferenceRooms());
    }

    @Test
    public void canAddDiningRoom() {
        assertEquals(1, hotel.countDiningRooms());
    }

    @Test
    public void canAddGuestToBedRoom() {
        hotel.checkGuestIn(bedRoom1, guest1, 1);
        assertEquals(1, bedRoom1.countGuestsInRoom());
    }

    @Test
    public void willNotAddToBedRoomWhenFull() {
        hotel.checkGuestIn(bedRoom1, guest1, 1);
        hotel.checkGuestIn(bedRoom1, guest2, 1);
        assertEquals(1, bedRoom1.countGuestsInRoom());
    }

    @Test
    public void canAddGuestToConferenceRoom() {
        hotel.admitGuestToRoom(conferenceRoom, guest1);
        assertEquals(1, conferenceRoom.countGuestsInRoom());
    }

    @Test
    public void willNotAddToConferenceRoomWhenFull() {
        hotel.admitGuestToRoom(conferenceRoom, guest1);
        hotel.admitGuestToRoom(conferenceRoom, guest2);
        assertEquals(1, conferenceRoom.countGuestsInRoom());
    }

    @Test
    public void canAddGuestToDiningRoom() {
        hotel.admitGuestToRoom(diningRoom, guest1);
        assertEquals(1, diningRoom.countGuestsInRoom());
    }

    @Test
    public void willNotAddToDiningRoomWhenFull() {
        hotel.admitGuestToRoom(diningRoom, guest1);
        hotel.admitGuestToRoom(diningRoom, guest2);
        assertEquals(1, diningRoom.countGuestsInRoom());
    }

    @Test
    public void canRemoveGuestFromRoom() {
        hotel.checkGuestIn(bedRoom1, guest1, 1);
        hotel.checkGuestOut(bedRoom1);
        assertEquals(0, bedRoom1.countGuestsInRoom());
    }

    @Test
    public void canGetVacantBedRooms() {
        hotel.checkGuestIn(bedRoom1, guest1, 1);
        assertEquals(1, hotel.getVacantBedRooms().size());
    }

}
