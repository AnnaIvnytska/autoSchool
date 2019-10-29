package a.programming.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class LoopsFor {
    public static void main(String[] args) throws IOException, InterruptedException {
        LoopsFor loopsFor = new LoopsFor();
        loopsFor.runTask13();
        loopsFor.runTask14();
        loopsFor.runTask15();
        loopsFor.runTask16();
        loopsFor.runTask17();
        loopsFor.runTask18();
    }

    public static String readFromConsole() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        return reader.readLine();
    }

    //Task 13
    //Используя цикл for вывести на экран чётные числа от 1 до 100 включительно. Через пробел либо с новой строки.
    public static void runTask13() {
        System.out.println("Task 13: ");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
    }

    //Task 14
    //Ввести с клавиатуры два числа m и n. Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
    public static void runTask14() throws IOException {
        System.out.println("\nTask 14: Please enter rectangle length: ");
        int m = Integer.parseInt(readFromConsole());
        System.out.println("Please enter rectangle width: ");
        int n = Integer.parseInt(readFromConsole());
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i < m; i++) {
                System.out.print(8);
            }
            System.out.println(8);
        }
    }

    //Task 15
    //Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10
    public static void runTask15() {
        System.out.println("Task 15: ");
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }

    //Task 16
    //Используя цикл for вывести на экран: - горизонтальную линию из 10 восьмёрок; - вертикальную линию из 10 восьмёрок.
    public static void runTask16() {
        System.out.println("Task 16: ");
        System.out.println("Horizontal: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("8");
        }
        System.out.println("\nVertical: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("8");
        }
    }

    //Task 17
    //Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]
    public static void runTask17() throws IOException {
        System.out.println("Task 17: Please enter the name: ");
        String name = readFromConsole();
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " любит меня.");
        }
    }

    //Task 18
    //Написать программу, которая ведёт обратный отсчёт с 30 до 0, и в конце выводит на экран текст «Бум!». Программа должна уменьшать число 10 раз в секунду.
    // Для того чтобы вставить в программу задержку, воспользуйся функцией: Thread.sleep(100) - задержка на одну десятую секунды.
    public static void runTask18() throws InterruptedException {
        System.out.println("Task 18: ");
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(100);
        }
        System.out.println("Бум!");
    }
}