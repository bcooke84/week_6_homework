package hotel.rooms;

public class DiningRoom extends Room {
    private String name;

    public DiningRoom(int capacity, String name) {
        super(capacity);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
