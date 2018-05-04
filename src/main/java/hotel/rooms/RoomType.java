package hotel.rooms;

public enum RoomType {

    SINGLE(1),
    DOUBLE (2),
    TWIN(2),
    SUITE(2),
    FAMILY(3);

    private int capacity;


   RoomType(int capacity) {
       this.capacity = capacity;
   }

    public int getCapacity() {
        return capacity;
    }
}