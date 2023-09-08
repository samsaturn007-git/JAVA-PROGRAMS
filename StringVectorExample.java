import java.util.Vector;
import java.util.Scanner;

public class StringVectorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<String> stringVector = new Vector<>();

        // Number of strings to add
        System.out.print("Enter the number of strings to add: ");
        int n = scanner.nextInt();

        // Add N strings to the vector
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            String input = scanner.next();
            stringVector.add(input);
        }

        // Check and modify the vector
        System.out.print("Enter a new string to check: ");
        String newString = scanner.next();

        if (stringVector.contains(newString)) {
            // If the string is present, delete it
            stringVector.remove(newString);
            System.out.println("String removed from the vector.");
        } else {
            // If the string is not present, add it
            stringVector.add(newString);
            System.out.println("String added to the vector.");
        }

        // Display the updated vector
        System.out.println("Updated vector:");
        for (String str : stringVector) {
            System.out.println(str);
        }

        scanner.close();
    }
}
