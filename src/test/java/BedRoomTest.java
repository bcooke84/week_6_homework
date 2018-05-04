import hotel.rooms.BedRoom;
import hotel.rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    BedRoom bedRoom1;
    BedRoom bedRoom2;

    @Before
    public void before() {
        bedRoom1 = new BedRoom(RoomType.SINGLE, 1, 40.00);
        bedRoom2 = new BedRoom(RoomType.DOUBLE, 2, 50.00);
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
}
