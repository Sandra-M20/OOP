//CO3 QUESTION10

import java.util.Scanner;

// Interface named Shape with area() and perimeter() methods
interface Shape {
    double area();
    double perimeter();
}

// Class for Circle that implements Shape
class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }

    public double perimeter() {
        return 2 * 3.14 * radius;
    }
}

// Class for Rectangle that implements Shape
class Rectangle implements Shape {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }
}

// Main Class
public class ShapeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = null; // Reference for Shape objects

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius of the circle: ");
                    double radius = sc.nextDouble();
                    shape = new Circle(radius);
                    break;

                case 2:
                    System.out.print("Enter length of the rectangle: ");
                    int length = sc.nextInt();
                    System.out.print("Enter breadth of the rectangle: ");
                    int breadth = sc.nextInt();
                    shape = new Rectangle(length, breadth);
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
                    continue;
            }

            // Display area and perimeter
            System.out.println("Area: " + shape.area());
            System.out.println("Perimeter: " + shape.perimeter());
        }
    }
}
