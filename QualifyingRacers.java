 import java.util.Scanner;

public class QualifyingRacers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize an array to store the speeds of the racers
        double[] speeds = new double[5];
        
        // Input speeds of the racers
        System.out.println("Enter the speed of each racer:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Racer " + (i + 1) + ": ");
            speeds[i] = scanner.nextDouble();
        }
        
        // Calculate the average speed of all racers
        double sum = 0;
        for (double speed : speeds) {
            sum += speed;
        }
        double averageSpeed = sum / 5;
        
        System.out.println("Qualifying racers with speed greater than the average speed:");
        
        // Check and print the speeds of qualifying racers
        for (int i = 0; i < 5; i++) {
            if (speeds[i] > averageSpeed) {
                System.out.println("Racer " + (i + 1) + ": " + speeds[i]);
            }
        }
        
        scanner.close();
    }
}
