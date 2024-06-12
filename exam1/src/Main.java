import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select a geometric figure to calculate its area and perimeter:");
            System.out.println("#1 Circle");
            System.out.println("#2 Triangle");
            System.out.println("#3 Rectangle");
            System.out.println("#4 Square");
            System.out.println("#5 Ellipse"); // New option for the ellipse
            System.out.println("#6 Exit ...");
            System.out.print("Select the number of the form: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    scanner.nextLine();
                    Circle circle = new Circle(radius);
                    System.out.println("Area: " + circle.getArea());
                    System.out.println("Perimeter: " + circle.getPerimeter());
                    break;
                case 2:
                    System.out.print("Enter the lengths of the three sides of the triangle separated by spaces: ");
                    double sideA = scanner.nextDouble();
                    double sideB = scanner.nextDouble();
                    double sideC = scanner.nextDouble();
                    scanner.nextLine();
                    Triangle triangle = new Triangle(sideA, sideB, sideC);
                    System.out.println("Area: " + triangle.getArea());
                    System.out.println("Perimeter: " + triangle.getPerimeter());
                    break;
                case 3:
                    System.out.print("Enter the width and height of the rectangle separated by spaces: ");
                    double width = scanner.nextDouble();
                    double height = scanner.nextDouble();
                    scanner.nextLine();
                    Rectangle rectangle = new Rectangle(width, height);
                    System.out.println("Area: " + rectangle.getArea());
                    System.out.println("Perimeter: " + rectangle.getPerimeter());
                    break;
                case 4:
                    System.out.print("Enter the side length of the square: ");
                    double side = scanner.nextDouble();
                    scanner.nextLine();
                    Square square = new Square(side);
                    System.out.println("Area: " + square.getArea());
                    System.out.println("Perimeter: " + square.getPerimeter());
                    break;
                case 5: // Option for ellipse
                    System.out.print("Enter the major and minor axis lengths of the ellipse separated by spaces: ");
                    double majorAxis = scanner.nextDouble();
                    double minorAxis = scanner.nextDouble();
                    scanner.nextLine();
                    Ellipse ellipse = new Ellipse(majorAxis, minorAxis);
                    System.out.println("Area: " + ellipse.getArea());
                    System.out.println("Perimeter: " + ellipse.getPerimeter());
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }
            System.out.println();
        }
    }
}

