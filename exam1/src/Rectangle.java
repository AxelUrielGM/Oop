public class Rectangle extends Quadrilateral {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        // Call the constructor of Quadrilateral with appropriate values
        super(width, height, width, height);
        // Set the width and height of the rectangle
        this.width = width;
        this.height = height;
    }

    // Method to calculate the area
    @Override
    public double getArea() {
        // Formula for calculating the area of a rectangle: width * height
        return width * height;
    }

    // Method to calculate the perimeter
    @Override
    public double getPerimeter() {
        // Formula for calculating the perimeter of a rectangle: 2 * (width + height)
        return 2 * (width + height);
    }
}


