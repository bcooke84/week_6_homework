import hotel.Hotel;
import hotel.rooms.BedRoom;
import hotel.rooms.ConferenceRoom;
import hotel.rooms.DiningRoom;
import hotel.rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    BedRoom bedRoom1;
    BedRoom bedRoom2;
    ConferenceRoom conferenceRoom;
    DiningRoom diningRoom;

    @Before
    public void before() {
        hotel = new Hotel();
        bedRoom1 = new BedRoom(RoomType.SINGLE, 1, 40.00);
        bedRoom2 = new BedRoom(RoomType.DOUBLE, 2, 50.00);
        conferenceRoom = new ConferenceRoom(50, "North Conference Room", 250.00 );
        diningRoom = new DiningRoom(100, "Fine Dining");

    }

    @Test
    public void canAddBedRoom() {
        hotel.addBedRooms(bedRoom1);
        assertEquals(1,hotel.countBedRooms());
    }
    @Test
    public void canAddConferenceRoom() {
        hotel.addConferenceRooms(conferenceRoom);
        assertEquals(1, hotel.countConferenceRooms());
    }
    @Test
    public void canAddDiningRoom() {
        hotel.addDiningRooms(diningRoom);
        assertEquals(1, hotel.countDiningRooms());
    }
}
