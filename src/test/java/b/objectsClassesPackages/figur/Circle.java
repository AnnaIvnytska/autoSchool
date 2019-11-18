package b.objectsClassesPackages.figur;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Figure {
    private double[] a;
    private double[] b;

    public Circle(double[] a, double[] b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        double radius = Math.sqrt(Math.pow(b[0] - a[0], 2) + (Math.pow(b[1] - a[1], 2)));
        double circleArea = new BigDecimal(Math.PI * (radius * radius)).setScale(2, RoundingMode.HALF_UP).doubleValue();
        return circleArea;
    }

    public double[][] getCoordinates() {
        return new double[][]{a, b};
    }

    public double[] getA() {
        return a;
    }

    public void setA(double[] a) {
        this.a = a;
    }

    public double[] getB() {
        return b;
    }

    public void setB(double[] b) {
        this.b = b;
    }

}
