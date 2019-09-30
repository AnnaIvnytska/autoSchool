package a.programming.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

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
