// Quadrilateral.java
class Quadrilateral extends ShapeImpl {
    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;

    Quadrilateral(double sideA, double sideB, double sideC, double sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    @Override
    public int numberOfSides() {
        return 4;
    }

    @Override
    public double getArea() {
        return -1;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC + sideD;
    }
}

