import hotel.rooms.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void before() {
        diningRoom = new DiningRoom(100, "Fine Dining");
    }

    @Test
    public void hasCapacity() {
        assertEquals(100, diningRoom.getCapacity());
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
}
