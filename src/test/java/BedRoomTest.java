import hotel.Guest;
import hotel.rooms.BedRoom;
import hotel.rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    BedRoom bedRoom1;
    BedRoom bedRoom2;
    Guest guest1;
    Guest guest2;

    @Before
    public void before() {
        bedRoom1 = new BedRoom(RoomType.SINGLE, 1, 40.00);
        bedRoom2 = new BedRoom(RoomType.DOUBLE, 2, 50.00);
        guest1 = new Guest();
        guest2 = new Guest();
    }

    @Test
    public void hasRoomType() {
        assertEquals(RoomType.SINGLE, bedRoom1.getBedRoomType());
    }

    @Test
    public void canSetBedroomType() {
        bedRoom1.setBedRoomType(RoomType.DOUBLE);
        assertEquals(RoomType.DOUBLE, bedRoom1.getBedRoomType());
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(2, bedRoom2.getBedRoomNumber());
    }

    @Test
    public void canSetRoomNumber() {
        bedRoom2.setBedRoomNumber(3);
        assertEquals(3, bedRoom2.getBedRoomNumber());
    }

    @Test
    public void hasNightlyRate() {
        assertEquals(40, bedRoom1.getNightlyRate(), 0.01);
    }

    @Test
    public void canSetNightlyRate() {
        bedRoom2.setNightlyRate(60.00);
        assertEquals(60.00, bedRoom2.getNightlyRate(), 0.01);
    }

    @Test
    public void canGetListOfGuests() {
        bedRoom2.addGuestToRoom(guest1, 1);
        bedRoom2.addGuestToRoom(guest2, 1);
        assertEquals(2, bedRoom2.getGuests().size());
    }

    @Test
    public void canRemoveGuest() {
        bedRoom2.addGuestToRoom(guest1);
        bedRoom2.addGuestToRoom(guest2);
        bedRoom2.removeGuestFromRoom();
        assertEquals(1, bedRoom2.countGuestsInRoom());
    }

    @Test
    public void checkRoomHasSpace() {
        assertEquals(true, bedRoom1.checkRoomHasSpace());
    }

    @Test
    public void checkRoomIsFull() {
        bedRoom2.addGuestToRoom(guest1);
        bedRoom2.addGuestToRoom(guest2);
        assertEquals(false, bedRoom2.checkRoomHasSpace());
    }
}
