public class Reservation {
    private String roomType;
    private double pricePerNight;
    private  int numberOfNight;
    private  boolean isWeekend;

    public Reservation(String roomType, int numberOfNight, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNight = numberOfNight;
        this.isWeekend = isWeekend;
        if(roomType.equals("king")) {
            pricePerNight = 139;
        }
        else{
            pricePerNight = 124;
        }
        if(isWeekend) {
            pricePerNight += pricePerNight * 0.10;
        }
    }



    public double getReservationTotal() {
        return pricePerNight * numberOfNight;
    }
}
