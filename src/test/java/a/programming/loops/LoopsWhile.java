package a.programming.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class LoopsWhile {
    public static void main(String[] args) throws IOException {
        LoopsWhile loopsWhile = new LoopsWhile();
        loopsWhile.runTask8();
        loopsWhile.runTask9();
        loopsWhile.runTask10();
        loopsWhile.runTask11();
        loopsWhile.runTask12();
    }

    public static String readFromConsole() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        return reader.readLine();
    }

    //Task 8
    //Вывести на экран числа от 1 до 10, используя цикл while
    public static void runTask8() {
        int i = 1;
        System.out.println("\nTask 8: ");
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
    }

    //Task 9
    //Вывести на экран числа от 10 до 1, используя цикл while
    public static void runTask9() {
        int i = 10;
        System.out.println("\nTask 9: ");
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }
    }

    //Task 10
    // Ввести с клавиатуры строку и число N. Вывести на экран строку N раз, используя цикл while.
    public static void runTask10() throws IOException {
        System.out.println("\nTask 10: Please enter a string: ");
        String str = readFromConsole();
        System.out.println("Please enter a number: ");
        int number = Integer.parseInt(readFromConsole());
        while (number > 0) {
            System.out.println(str);
            number--;
        }
    }

    //Task 11
    // Вывести на экран квадрат из 10х10 букв S используя цикл while. Буквы в каждой строке не разделять.
    public static void runTask11() {
        int i = 1;
        int j = 1;
        System.out.println("Task 11:");
        while (j <= 10) {
            while (i < 10) {
                System.out.print("s");
                i++;
            }
            System.out.println("s");
            j++;
            i = 1;
        }
    }

    //Task 12
    //Вывести на экран таблицу умножения 10х10 используя цикл while. Числа разделить пробелом.

    public static void runTask12() {
        int i = 1;
        int j = 1;
        System.out.println("Task 12:");
        while (j <= 10) {
            while (i < 10) {
                System.out.print(i * j + " ");
                i++;
            }
            System.out.println(i * j);
            j++;
            i = 1;
        }
    }
}