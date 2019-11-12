package b.objectsClassesPackages.figur;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle extends Figure {
    private double[] a;
    private double[] b;
    private double[] c;

    public Triangle(double[] a, double[] b, double[] c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double ab = Math.sqrt(Math.pow(b[0] - a[0], 2) + (Math.pow(b[1] - a[1], 2)));
        double bc = Math.sqrt(Math.pow(c[0] - b[0], 2) + (Math.pow(c[1] - b[1], 2)));
        double ac = Math.sqrt(Math.pow(c[0] - a[0], 2) + (Math.pow(c[1] - a[1], 2)));

        double p = (ab + bc + ac) / 2;
        double triangleArea = new BigDecimal(Math.sqrt(p * (p - ab) * (p - bc) * (p - ac))).setScale(2, RoundingMode.HALF_UP).doubleValue();
        return triangleArea;
    }

    public double[][] getCoordinates() {
        return new double[][]{a, b, c};
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

    public double[] getC() {
        return c;
    }

    public void setC(double[] c) {
        this.c = c;
    }

}
