package a.programming.typeСonversions;

//В переменной n хранится вещественное число с ненулевой дробной частью.
// Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.

public class Task3 {
    public static void main(String[] args) {
        double a = 23.5;
        int round = (int) (a  + 0.5);
        System.out.println(round);
    }
}
