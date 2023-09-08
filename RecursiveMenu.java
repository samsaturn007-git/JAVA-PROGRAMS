import java.util.Scanner;

public class RecursiveMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Recursive Function Menu:");
            System.out.println("1. Find GCD and LCM");
            System.out.println("2. Print n Fibonacci numbers");
            System.out.println("3. Find reverse of a number");
            System.out.println("4. Solve 1 + 2 + 3 + ... + n");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the first number: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    int num2 = scanner.nextInt();
                    int gcd = findGCD(num1, num2);
                    int lcm = findLCM(num1, num2);
                    System.out.println("GCD: " + gcd);
                    System.out.println("LCM: " + lcm);
                    break;
                case 2:
                    System.out.print("Enter the value of n: ");
                    int n = scanner.nextInt();
                    System.out.println("Fibonacci numbers:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(fibonacci(i) + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter a number to reverse: ");
                    int numToReverse = scanner.nextInt();
                    int reversed = reverseNumber(numToReverse);
                    System.out.println("Reversed number: " + reversed);
                    break;
                case 4:
                    System.out.print("Enter the value of n: ");
                    int nSum = scanner.nextInt();
                    int sum = calculateSum(nSum);
                    System.out.println("Sum: " + sum);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }

    // Recursive function to find GCD (Greatest Common Divisor)
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }

    // Recursive function to find LCM (Least Common Multiple)
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    // Recursive function to calculate nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Recursive function to reverse a number
    public static int reverseNumber(int num) {
        if (num < 10) {
            return num;
        } else {
            int lastDigit = num % 10;
            int remaining = num / 10;
            int reversed = reverseNumber(remaining);
            return (lastDigit * (int) Math.pow(10, String.valueOf(remaining).length())) + reversed;
        }
    }

    // Recursive function to calculate the sum of 1 + 2 + 3 + ... + n
    public static int calculateSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + calculateSum(n - 1);
        }
    }
}
