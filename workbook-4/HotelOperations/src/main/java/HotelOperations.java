public class HotelOperations {
    public static void main(String[] args) {
        Room room = new Room(2, 100.0,false, false);
        System.out.println("Is room available?" + room.isAvailable());

        Reservation reservation = new Reservation("king", 3, true);
        System.out.println("Total Price Of rezervation" + reservation.getReservationTotal());


        Employee employee = new Employee("1233", "Ekrem","IT",20.0,40 );
        System.out.println("Total Salary" + employee.getTotalPay());



    }



}
