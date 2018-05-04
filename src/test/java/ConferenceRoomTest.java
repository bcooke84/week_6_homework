import hotel.rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom1;

    @Before
    public void before() {
        conferenceRoom1 = new ConferenceRoom(50, "North Conference Room", 250.00 );
    }

    @Test
    public void hasCapacity() {
        assertEquals(50, conferenceRoom1.getCapacity());
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
}
