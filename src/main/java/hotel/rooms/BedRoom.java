package hotel.rooms;

import hotel.Guest;

import java.util.ArrayList;

public class BedRoom extends Room {
    private RoomType bedRoomType;
    private int bedRoomNumber;
    private double nightlyRate;
    private int numberOfNightsOccupied;

    public BedRoom(RoomType bedRoomType, int bedRoomNumber, double nightlyRate) {
        super(bedRoomType.getCapacity());

        this.bedRoomType = bedRoomType;
        this.bedRoomNumber = bedRoomNumber;
        this.nightlyRate = nightlyRate;
        this.numberOfNightsOccupied = 0;
    }

    public RoomType getBedRoomType() {
        return bedRoomType;
    }

    public void setBedRoomType(RoomType bedRoomType) {
        this.bedRoomType = bedRoomType;
    }

    public int getBedRoomNumber() {
        return bedRoomNumber;
    }

    public void setBedRoomNumber(int bedRoomNumber) {
        this.bedRoomNumber = bedRoomNumber;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    public void setNightlyRate(double nightlyRate) {
        this.nightlyRate = nightlyRate;
    }




}
