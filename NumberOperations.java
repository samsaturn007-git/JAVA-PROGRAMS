import java.util.Scanner;

public class NumberOperations {
    // Method to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Method to test if a number is Armstrong
    public static boolean testArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digitCount = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digitCount);
            number /= 10;
        }

        return sum == originalNumber;
    }

    // Method to test if a number is a palindrome
    public static boolean testPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    // Method to test if a number is prime
    public static boolean testPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Method to generate Fibonacci series
    public static void fibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series (first " + n + " terms): ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Calculate Factorial");
            System.out.println("2. Test Armstrong Number");
            System.out.println("3. Test Palindrome Number");
            System.out.println("4. Test Prime Number");
            System.out.println("5. Generate Fibonacci Series");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Calculate Factorial
                    System.out.print("Enter a number: ");
                    int numFactorial = scanner.nextInt();
                    long resultFactorial = factorial(numFactorial);
                    System.out.println("Factorial of " + numFactorial + " is " + resultFactorial);
                    break;
                case 2:
                    // Test Armstrong Number
                    System.out.print("Enter a number: ");
                    int numArmstrong = scanner.nextInt();
                    boolean isArmstrong = testArmstrong(numArmstrong);
                    System.out.println(numArmstrong + " is Armstrong: " + isArmstrong);
                    break;
                case 3:
                    // Test Palindrome Number
                    System.out.print("Enter a number: ");
                    int numPalindrome = scanner.nextInt();
                    boolean isPalindrome = testPalindrome(numPalindrome);
                    System.out.println(numPalindrome + " is Palindrome: " + isPalindrome);
                    break;
                case 4:
                    // Test Prime Number
                    System.out.print("Enter a number: ");
                    int numPrime = scanner.nextInt();
                    boolean isPrime = testPrime(numPrime);
                    System.out.println(numPrime + " is Prime: " + isPrime);
                    break;
                case 5:
                    // Generate Fibonacci Series
                    System.out.print("Enter the number of terms: ");
                    int numTerms = scanner.nextInt();
                    fibonacciSeries(numTerms);
                    break;
                case 6:
                    // Exit
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
