package a.programming.primitiveDataType;

//Создать простой Java-проект (консольное приложение), которое при запуске выводит в консоль “Hello, world!”.
//Добавить метод printHelloName(), который будет запрашивать у пользователя ввести имя,
//считывать введенное имя с консоли и выводить на экран приветствие “Hello, %name%”.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, world!");
        printHelloName();
    }

    public static void printHelloName() throws IOException {
        System.out.println("Please enter your name");
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        String name = reader.readLine();

        System.out.println("Hello, " + name);
    }
}