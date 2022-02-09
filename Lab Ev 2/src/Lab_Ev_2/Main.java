package Lab_Ev_2;

/*
Create a class called Employee that includes three instance variables—a first name (type String), a last
name (type String) and a monthly salary (double). Provide a constructor that initializes the three
instance variables. Provide a set and a get method for each instance variable. If the monthly salary is
not positive, do not set its value. Write a test application named EmployeeTest that demonstrates class
Employee’s capabilities. Create two Employee objects and display each object’s yearly salary. Then
give each Employee a 10% raise and display each Employee’s yearly salary again.
*/

class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary >= 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary >= 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee joe = new Employee("Anika", " Sharmila", 40000);
        Employee tod = new Employee("Hamim Reza", " Shammo", 50000);
        System.out.println(joe.getFirstName() + "'s monthly salary is " + joe.getMonthlySalary());
        System.out.println(tod.getFirstName() + "'s monthly salary is " + tod.getMonthlySalary());
        joe.setMonthlySalary(joe.getMonthlySalary() * 1.1);
        tod.setMonthlySalary(tod.getMonthlySalary() * 1.1);
        System.out.println("Salary after 10% boost");
        System.out.println(joe.getFirstName() + "'s monthly salary is " + joe.getMonthlySalary());
        System.out.println(tod.getFirstName() + "'s monthly salary is " + tod.getMonthlySalary());
    }
}
