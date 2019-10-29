package a.programming.loops;

//Ввести с клавиатуры два числа, и вывести на экран минимальное из них.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Random;

public class ConditionalStatements {
    public static void main(String[] args) throws IOException {
        ConditionalStatements conditionalStatements = new ConditionalStatements();
        conditionalStatements.runTask1();
        conditionalStatements.runTask2();
        conditionalStatements.runTask3();
        conditionalStatements.runTask4();
        conditionalStatements.runTask5();
        conditionalStatements.runTask6();
        conditionalStatements.runTask7();
    }

    public static String readFromConsole() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        return reader.readLine();
    }

    //Task 1
    //Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
    public static void runTask1() throws IOException {
        System.out.println("Task 1: Please enter first number:");
        int first = Integer.parseInt(readFromConsole());

        System.out.println("Task 1: Please enter second number:");
        int second = Integer.parseInt(readFromConsole());

        if (first < second) {
            System.out.println("Task 1: min number is " + first);
        } else {
            System.out.println("Task 1: min number is " + second);
        }
    }

    //Task 2
    //Ввести с клавиатуры четыре числа, и вывести максимальное из них.
    public static void runTask2() throws IOException {
        int[] list = new int[4];
        System.out.println("Task 2: Please enter 4 numbers:");
        for (int i = 0; i < list.length; i++) {
            String s = readFromConsole();
            list[i] = (Integer.parseInt(s));
        }
        int maxInt = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] >= maxInt) {
                maxInt = list[i];
            }
        }
        System.out.println("Task 2: Maximum number is " + maxInt);
    }

    //Task 3
    //Ввести с клавиатуры три числа, и вывести их в порядке убывания.
    public static void runTask3() throws IOException {
        int[] intArr = new int[3];
        System.out.println("Task 3: Please enter " + intArr.length + " random numbers:");
        for (int i = 0; i < intArr.length; i++) {
            String s = readFromConsole();
            intArr[i] = (Integer.parseInt(s));
        }

        int[] sortedArray = new int[intArr.length];
        int temp;
        for (int i = 0; i <= intArr.length; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[i] < intArr[j]) {
                    temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                    sortedArray = intArr;
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < intArr.length; i++) {
            stringBuilder.append(sortedArray[i] + " ");
        }
        System.out.println("Task 3: " + stringBuilder.toString());
    }

    //Task 4
    //Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны».
    // Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
    public static void runTask4() throws IOException {
        System.out.println("Task 4: Please enter the first name:");
        String firstName = readFromConsole();
        System.out.println("Task 4: Please enter the second name:");
        String secondName = readFromConsole();

        if (firstName.equals(secondName)) {
            System.out.println("Task 4: Имена идентичны");
        }
        if (!firstName.equals(secondName) && firstName.length() == secondName.length()) {
            System.out.println("Task 4: Длины имен равны");
        }
    }

    //Task5
    //Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще»
    public static void runTask5() throws IOException {
        System.out.println("Task 5: Please enter your name:");
        String name = readFromConsole();
        System.out.println("Task 5: Please enter your age:");
        int age = Integer.parseInt(readFromConsole());

        if (age <= 17) {
            System.out.println("Подрасти еще");
        }
    }

    //Task6
    //Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно»
    public static void runTask6() throws IOException {
        System.out.println("Task 6: Please enter your name:");
        String name = readFromConsole();
        System.out.println("Task 6: Please enter your age:");
        int age = Integer.parseInt(readFromConsole());

        if (age >= 20) {
            System.out.println("Task 6: И 18-ти достаточно");
        }
    }

    //Task7
    // За семь попыток угадать число. При каждой попытке вам будет выводиться сообщение - "Мало" или "Много".
    // Если угадаете, уложившись в семь попыток, то выводится сообщение "Угадал :)" и программа завершает работу.
    // Если по истечении 7 попыток число не угадывается, то выводится сообщение "Не угадал :(" и завершается работа.
    public static void runTask7() throws IOException {
        Random random = new Random();
        int secret;
        secret = random.nextInt(20 + 1);

        for (int i = 0; i <= 6; i++) {
            System.out.println("Task 7: Guess the number from 0 to 20:");
            int number = Integer.parseInt(readFromConsole());
            if (number > secret) {
                System.out.println("Task 7: Много");
            }
            if (number < secret) {
                System.out.println("Task 7: Мало");
            }
            if (number == secret) {
                System.out.println("Task 7: Угадал :)");
                break;
            }
            if (i == 6) {
                System.out.println("Task 7: Не угадал :(");
            }
        }
    }
}

