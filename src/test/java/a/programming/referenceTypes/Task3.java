package a.programming.referenceTypes;

//Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
// Случай, когда самых длинных слов может быть несколько, не обрабатывать.

public class Task3 {
    public static void main(String[] args) {
        String sentence = "This sentence is for finding the longest word - Pulchritudinous.";
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        System.out.println("The longest word in sentence is " + longestWord);
    }
}