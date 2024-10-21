public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public  double getTotalPay() {
        double regulaHours = getRegularHours();
        double overTimeHours = getOverTimeHours();
        return (regulaHours * payRate) + (overTimeHours * payRate * 1.5);

    }
    public  double getRegularHours() {
        return Math.min(hoursWorked,40);
    }
     public double getOverTimeHours() {
        return  Math.max(0,hoursWorked - 40);
     }
}
