package b.objectsClassesPackages.figur;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = figuresFill();
        Arrays.sort(figures, Comparator.comparing(Figure::getArea));
        for (Figure figure : figures) {
            System.out.println(figure.getName() + ", " + figure.getArea());
        }
    }

    public static Figure[] figuresFill() {
        Figure[] figuresArray = new Figure[10];
        Figure figure = null;
        Random objRandomizer = new Random();
        for (int i = 0; i < 10; i++) {
            int randomCaseNumber = objRandomizer.nextInt(3);
            int randomStep = objRandomizer.nextInt((50 - 1) + 1) + 1;
            int x = 1;
            int y = 5;
            switch (randomCaseNumber) {
                case 0:
                    figure = new Square(new double[]{x, y}, new double[]{x, y + randomStep}, new double[]{x + randomStep, y + randomStep}, new double[]{x + randomStep, y});
                    figure.setName("Square");
                    break;
                case 1:
                    figure = new Triangle(new double[]{x, y}, new double[]{x + randomStep, y}, new double[]{x, y - randomStep});
                    figure.setName("Triangle");
                    break;
                case 2:
                    figure = new Circle(new double[]{x, y}, new double[]{x + randomStep, y + randomStep});
                    figure.setName("Circle");
                    break;
            }
            figuresArray[i] = figure;
        }
        return figuresArray;
    }
}