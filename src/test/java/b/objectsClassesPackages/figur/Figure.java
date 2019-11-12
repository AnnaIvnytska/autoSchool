package b.objectsClassesPackages.figur;

public abstract class Figure {

    public Figure() {
    }

    private String Name;

    public abstract double[][] getCoordinates();

    public abstract double getArea();

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}