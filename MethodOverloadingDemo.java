public class MethodOverloadingDemo {
    // Method with two integer parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with three integer parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }

    // Method with a string parameter
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    // Method with an int and a string parameter
    public String concatenate(int num, String str) {
        return num + str;
    }

    // Main method to demonstrate method overloading
    public static void main(String[] args) {
        MethodOverloadingDemo demo = new MethodOverloadingDemo();

        // Method overloading with integer parameters
        System.out.println("Sum of two integers: " + demo.add(5, 10));
        System.out.println("Sum of three integers: " + demo.add(5, 10, 15));

        // Method overloading with double parameters
        System.out.println("Sum of two doubles: " + demo.add(2.5, 3.5));

        // Method overloading with string parameters
        System.out.println("Concatenation of two strings: " + demo.concatenate("Hello, ", "World!"));
        System.out.println("Concatenation of an int and a string: " + demo.concatenate(42, " is the answer."));
    }
}
