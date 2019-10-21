package a.programming.referenceTypes;

//Найти в строке указанную подстроку и заменить ее на новую. Строку, ее подстроку для замены и новую подстроку вводит пользователь.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Task2 {

    public static String readFromConsole() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        return reader.readLine();
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a string:");
        String string = readFromConsole();

        System.out.println("Please enter a substring you want to replace:");
        String oldSubstring = readFromConsole();

        System.out.println("Please enter a new substring to replace:");
        String newSubstring = readFromConsole();

        String replacedStr = string.replaceAll(oldSubstring, newSubstring);

        System.out.println(replacedStr);
    }
}