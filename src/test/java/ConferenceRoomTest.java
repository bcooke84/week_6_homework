import hotel.Guest;
import hotel.rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom1;
    Guest guest1;
    Guest guest2;


    @Before
    public void before() {
        conferenceRoom1 = new ConferenceRoom(2, "North Conference Room", 250.00 );
        guest1 = new Guest();
        guest2 = new Guest();
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, conferenceRoom1.getCapacity());
    }

    @Test
    public void canChangeCapacity() {
        conferenceRoom1.setCapacity(100);
        assertEquals(100, conferenceRoom1.getCapacity());
    }

    @Test
    public void hasName() {
        assertEquals("North Conference Room", conferenceRoom1.getName());
    }

    @Test
    public void canChangeName() {
        conferenceRoom1.setName("South Conference Room");
        assertEquals("South Conference Room", conferenceRoom1.getName());
    }

    @Test
    public void hasDailyRate() {
        assertEquals(250.00, conferenceRoom1.getDailyRate(), 0.01);
    }

    @Test
    public void canChangeDailyRate() {
        conferenceRoom1.setDailyRate(300.00);
        assertEquals(300.00, conferenceRoom1.getDailyRate(), 0.01);
    }

    @Test
    public void canGetListOfGuests() {
        conferenceRoom1.addGuestToRoom(guest1);
        conferenceRoom1.addGuestToRoom(guest2);
        assertEquals(2, conferenceRoom1.getGuests().size());
    }

    @Test
    public void canRemoveGuest() {
        conferenceRoom1.addGuestToRoom(guest1);
        conferenceRoom1.addGuestToRoom(guest2);
        conferenceRoom1.removeGuestFromRoom();
        assertEquals(1, conferenceRoom1.countGuestsInRoom());
    }

    @Test
    public void checkRoomHasSpace() {
        assertEquals(true, conferenceRoom1.checkRoomHasSpace());
    }

    @Test
    public void checkRoomIsFull() {
        conferenceRoom1.addGuestToRoom(guest1);
        conferenceRoom1.addGuestToRoom(guest2);
        assertEquals(false, conferenceRoom1.checkRoomHasSpace());
    }

}
