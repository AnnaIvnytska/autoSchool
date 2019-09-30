package a.programming.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

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
