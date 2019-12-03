package d.genericsCollectionsStreams.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) throws IOException {
        ArrayListTest arrayListTest = new ArrayListTest();
        arrayListTest.runTask7();
        arrayListTest.runTask8();
        arrayListTest.runTask9();
        arrayListTest.runTask10();
        arrayListTest.runTask11();
    }

    //1. Создай список строк.
    //2. Добавь в него 5 различных строчек.
    //3. Выведи его размер на экран.
    //4. Используя цикл, выведи его содержимое на экран, каждое значение с новой строки
    public void runTask7() {
        System.out.println("Task 7: ");
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("First string");
        arrayList.add("Second string");
        arrayList.add("Third string");
        arrayList.add("Fourth string");
        arrayList.add("Fifth string");

        System.out.println("ArrayList size is: " + arrayList.size());
        for (String str : arrayList) {
            System.out.println(str);
        }
    }

    //1. Создай список строк.
    //2. Считай с клавиатуры 5 строк и добавь в список.
    //3. Используя цикл, найди самую длинную строку в списке.
    //4. Выведи найденную строку на экран.
    //5. Если таких строк несколько, выведи каждую с новой строки.
    public void runTask8() throws IOException {
        System.out.println("Task 8: ");
        ArrayList<String> arrayList = new ArrayList();
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            arrayList.add(s);
        }
        int longestSrt = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() > longestSrt) {
                longestSrt = arrayList.get(i).length();
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (longestSrt == arrayList.get(i).length()) {
                System.out.println(arrayList.get(i));
            }
        }
    }

    //1. Создай список строк.
    //2. Считай с клавиатуры 5 строк и добавь в список.
    //3. Используя цикл, найди самую короткую строку в списке.
    //4. Выведи найденную строку на экран.
    //5. Если таких строк несколько, выведи каждую с новой строки
    public void runTask9() throws IOException {
        System.out.println("Task 9: ");
        ArrayList<String> arrayList = new ArrayList();
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            arrayList.add(s);
        }
        int shortestSrt = arrayList.get(0).length();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() <= shortestSrt) {
                shortestSrt = arrayList.get(i).length();
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (shortestSrt == arrayList.get(i).length()) {
                System.out.println(arrayList.get(i));
            }
        }
    }

    //1. Создай список строк.
    //2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
    //3. Используя цикл, выведи содержимое на экран, каждое значение с новой строки.
    public void runTask10() throws IOException {
        System.out.println("Task 10: ");
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        ArrayList<String> arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            arrayList.add(0, s);
        }

        for (String str : arrayList) {
            System.out.println(str);
        }
    }

    //1. Создай список строк.
    //2. Добавь в него 5 строчек с клавиатуры.
    //3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
    //4. Используя цикл, выведи содержимое на экран, каждое значение с новой строки
    public void runTask11() throws IOException {
        System.out.println("Task 11: ");
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        ArrayList<String> arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            arrayList.add(s);
        }

        for (int i = 0; i < 13; i++) {
            String str = arrayList.get(arrayList.size() - 1);
            arrayList.remove(str);
            arrayList.add(0, str);
        }

        for (String str : arrayList) {
            System.out.println(str);
        }
    }
}