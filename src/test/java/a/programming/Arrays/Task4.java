package a.programming.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Task4 {
    public static void main(String[] atgs) throws IOException {
        int[] intArr = new int[10];

        System.out.println("Please enter " + intArr.length + " random numbers:");
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        for (int i = 0; i < intArr.length; i++) {
            String s = reader.readLine();
            intArr[i] = (Integer.parseInt(s));
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < intArr.length; i++) {
            stringBuilder.append(intArr[intArr.length - i - 1] + "\n");
        }
        System.out.println(stringBuilder.toString());
    }
}
