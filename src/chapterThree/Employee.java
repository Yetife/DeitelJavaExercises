package chapterThree;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public void firstName(String fName) {
        firstName = fName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void lastName(String lName) {
        lastName = lName;
    }

    public String getLastName() {
        return lastName;
    }

    public void monthlySalary(double salary) {


        if (salary > 0.0) {
            monthlySalary = salary;
        }
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void increaseSalary() {
        monthlySalary = monthlySalary * 0.1 + monthlySalary;
    }
}
