import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quadratic Equation Solver");
        System.out.print("Enter the coefficient 'a': ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter the coefficient 'b': ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter the coefficient 'c': ");
        double c = scanner.nextDouble();
        
        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;
        
        if (discriminant > 0) {
            // Two real solutions
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            
            System.out.println("Two real solutions:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            // One real solution
            double root = -b / (2 * a);
            
            System.out.println("One real solution:");
            System.out.println("Root: " + root);
        } else {
            // No real solutions
            System.out.println("No real solutions.");
        }
        
        scanner.close();
    }
}
