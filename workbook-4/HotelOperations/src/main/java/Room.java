public class Room {
    private int numberOfBeds ;
    private double price;
    private  boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }
    public  boolean isAvailable() {
        return !isOccupied && !isDirty;
    }
    public  void checkIn() {
        if (!isOccupied && !isDirty) {
            isOccupied = true;
            isDirty = true;
            System.out.println("checked in. Room is occupied and dirty");

        } else {
            System.out.println("The room is can not use");
        }
    }
    public void checkOut() {
        if(isOccupied) {
            isOccupied = false;
            System.out.println("checked out.Room is can not used while cleaned");
        }
        else {
            System.out.println("Room is already empty");
        }

    }
    public void cleanRoom() {
        if(isDirty) {
            isDirty = false;
            System.out.println("Room is cleaned");
        }
        else {
            System.out.println("Room is already cleaned");
        }
    }
}
