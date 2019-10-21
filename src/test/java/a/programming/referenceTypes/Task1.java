package a.programming.referenceTypes;

//Дана строка. Вывести первый, последний и средний (если он есть) символы.
//Напишите программу, которая выводит часть строки до первой встреченной точки, включая точку.
//Также предусмотрите вывод количества пробелов.

public class Task1 {
    public static void main(String[] args) {
        String str = "Most importantly, Hemingway’s queerness is tied irrevocably to women. His understanding and representation of queerness was often formulated through women!";
        char first = str.charAt(0);
        char middle = str.charAt(str.length() / 2);
        char last = str.charAt(str.length() - 1);
        System.out.println("First char: " + first + ", middle char: " + middle + ", last char: " + last);

        String[] dotSplitParts = str.split("\\.");
        int dotPosition = str.indexOf(".");
        System.out.println("First part: " + dotSplitParts[0] + str.charAt(dotPosition));

        String[] spaceSplitParts = str.split(" ");
        int spaceCount = spaceSplitParts.length - 1;
        System.out.println("There are: " + spaceCount + " spaces.");
    }
}
