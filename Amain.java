import java.util.Scanner;

class Area {
    private double length;
    private double breadth;

    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }
}

public class Amain{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        Area rectangle = new Area();
        rectangle.setDim(length, breadth);

        double area = rectangle.getArea();
        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
}
