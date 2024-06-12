// Ellipse.java
class Ellipse extends ShapeImpl {
    private double majorAxis;
    private double minorAxis;

    Ellipse(double majorAxis, double minorAxis) {
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    public int numberOfSides() {
        return 1;
    }

    @Override
    public double getArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public double getPerimeter() {
        // Aproximación del perímetro de la elipse
        return Math.PI * (3 * (majorAxis + minorAxis) - Math.sqrt((3 * majorAxis + minorAxis) * (majorAxis + 3 * minorAxis)));
    }
}

