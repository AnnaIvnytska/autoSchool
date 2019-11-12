package b.objectsClassesPackages.figur;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Square extends Figure {
    private double[] a;
    private double[] b;
    private double[] c;
    private double[] d;

    public Square(double[] a, double[] b, double[] c, double[] d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getArea() {
        double ab = Math.sqrt(Math.pow(b[0] - a[0], 2) + (Math.pow(b[1] - a[1], 2)));
        double ad = Math.sqrt(Math.pow(d[0] - a[0], 2) + (Math.pow(d[1] - a[1], 2)));
        double squareArea = new BigDecimal(ab * ad).setScale(2, RoundingMode.HALF_UP).doubleValue();
        return squareArea;
    }

    public double[][] getCoordinates() {
        return new double[][] {a, b, c, d};
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

    public double[] getD() {
        return d;
    }

    public void setD(double[] d) {
        this.d = d;
    }
}
