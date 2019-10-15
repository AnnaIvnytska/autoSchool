package a.programming.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

//Массив из строчек в обратном порядке
//1. Создать массив на 10 строчек.
//2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
//3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.

public class Task2 {
    public static void main(String[] args) throws IOException {
        String[] list = new String[10];
        System.out.println("Please enter 8 random words/phrases:");
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        for (int i = 0; i < 8; i++) {
            String s = reader.readLine();
            list[i] = s;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list.length; i++) {
            stringBuilder.append(list[list.length - i - 1] + "\n");
        }
        System.out.println(stringBuilder.toString());
    }
}
