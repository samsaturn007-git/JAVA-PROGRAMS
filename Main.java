class Employee {
    private String name;
    private int yearOfJoining;
    private double salary;
    private String address;

    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name");
        System.out.println(name);
        System.out.println("Year of joining");
        System.out.println(yearOfJoining);
        System.out.println("Salary");
        System.out.println(salary);
        System.out.println("Address");
        System.out.println(address);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert", 1994, 50000, "64C- Walls Street");
        Employee employee2 = new Employee("Sam", 2000, 60000, "1999, 68D- Walls Street");
        Employee employee3 = new Employee("John", 1999, 55000, "26B- Walls Street");

        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();
    }
}
