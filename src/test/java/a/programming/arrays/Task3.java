package a.programming.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

//2 массива
//1. Создать массив на 10 строк.
//2. Создать массив на 10 чисел.
//3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
//4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
//5. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.

public class Task3 {
    public static void main(String[] atgs) throws IOException {
        String[] stringArr = new String[10];
        int[] intArr = new int[10];

        System.out.println("Please enter " + stringArr.length + "random words/phrases:");
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        for (int i = 0; i < stringArr.length; i++) {
            String s = reader.readLine();
            stringArr[i] = s;
        }

        for (int i = 0; i < stringArr.length; i++) {
            intArr[i] = stringArr[i].length();
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < intArr.length; i++) {
            stringBuilder.append(intArr[i] + "\n");
        }
        System.out.println(stringBuilder.toString());



    }

}
