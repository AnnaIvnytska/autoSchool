package a.programming.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

//Максимальное среди массива на 20 чисел
// 1. В методе initializeArray():
// 1.1. Создайте массив на 20 чисел
// 1.2. Считайте с консоли 20 чисел и заполните ими массив
// 2. Метод max(int[] array) должен находить максимальное число из элементов массива

public class Task1 {
    public int[] initializeArray() throws IOException {
        int[] list = new int[5];
        System.out.println("Please enter " + list.length + " random numbers:");
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        for (int i = 0; i < list.length; i++) {
            String s = reader.readLine();
            list[i] = (Integer.parseInt(s));
        }
        return list;
    }

    public int max(int[] array) {
        int maxInt = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= maxInt) {
                maxInt = array[i];
            }
        }
        System.out.println("Maximum number is: " + maxInt);
        return maxInt;
    }

    public static void main(String[] args) throws IOException {
        Task1 task1 = new Task1();
        int[] arr = task1.initializeArray();
        task1.max(arr);
    }
}