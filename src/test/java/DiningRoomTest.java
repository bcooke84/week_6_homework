import hotel.Guest;
import hotel.rooms.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest1;
    Guest guest2;

    @Before
    public void before() {
        diningRoom = new DiningRoom(2, "Fine Dining");
        guest1 = new Guest();
        guest2 = new Guest();
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, diningRoom.getCapacity());
    }

    @Test
    public void setCapacity() {
        diningRoom.setCapacity(150);
        assertEquals(150, diningRoom.getCapacity());
    }

    @Test
    public void hasName() {
        assertEquals("Fine Dining", diningRoom.getName());
    }

    @Test
    public void canSetName() {
        diningRoom.setName("Carvery");
        assertEquals("Carvery", diningRoom.getName());
    }

    @Test
    public void canGetListOfGuests() {
        diningRoom.addGuestToRoom(guest1);
        diningRoom.addGuestToRoom(guest2);
        assertEquals(2, diningRoom.getGuests().size());
    }

    @Test
    public void canRemoveGuest() {
        diningRoom.addGuestToRoom(guest1);
        diningRoom.addGuestToRoom(guest2);
        diningRoom.removeGuestFromRoom();
        assertEquals(1, diningRoom.countGuestsInRoom());
    }

    @Test
    public void checkRoomHasSpace() {
        assertEquals(true, diningRoom.checkRoomHasSpace());
    }

    @Test
    public void checkRoomIsFull() {
        diningRoom.addGuestToRoom(guest1);
        diningRoom.addGuestToRoom(guest2);
        assertEquals(false, diningRoom.checkRoomHasSpace());
    }

}
