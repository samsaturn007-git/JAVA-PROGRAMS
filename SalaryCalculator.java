import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee number: ");
        int empNo = scanner.nextInt();

        System.out.print("Enter employee name: ");
        scanner.nextLine(); // Consume the newline character
        String empName = scanner.nextLine();

        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate various components
        double da = 0.7 * basicSalary;
        double hra = 0.3 * basicSalary;
        double cca = 240;
        double pf = 0.1 * basicSalary;
        double pt = 100;

        // Calculate gross salary
        double grossSalary = basicSalary + da + hra + cca;

        // Calculate net salary
        double netSalary = grossSalary - pf - pt;

        // Display the results
        System.out.println("\nEmployee Details:");
        System.out.println("Employee Number: " + empNo);
        System.out.println("Employee Name: " + empName);
        System.out.println("\nSalary Details:");
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("CCA: " + cca);
        System.out.println("PF: " + pf);
        System.out.println("PT: " + pt);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);

        scanner.close();
    }
}
