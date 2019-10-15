package a.programming.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

//Один большой массив и два маленьких
//1. Создать массив на 20 чисел.
//2. Ввести в него значения с клавиатуры.
//3. Создать два массива на 10 чисел каждый.
//4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
//5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

public class Task5 {
    public static void main(String[] atgs) throws IOException {
        int[] intArr = new int[20];
        System.out.println("Please enter " + intArr.length + " random numbers:");
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        for (int i = 0; i < intArr.length; i++) {
            String s = reader.readLine();
            intArr[i] = (Integer.parseInt(s));
        }

        int[] firstSmallArr = new int[10];
        int[] secondSmallArr = new int[10];

        for (int i = 0; i < firstSmallArr.length; i++) {
            firstSmallArr[i] = intArr[i];
            secondSmallArr[i] = intArr[i + firstSmallArr.length];
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < firstSmallArr.length; i++) {
            stringBuilder.append("Second array:" + secondSmallArr[i] + "\n");
        }
        System.out.println(stringBuilder.toString());
    }
}
