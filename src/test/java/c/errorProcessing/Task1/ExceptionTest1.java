package c.errorProcessing.Task1;

public class ExceptionTest1 {
    public static void main(String[] args) {
        String sentence = "This sentence is for finding the longest word - Pulchritudinous.";
        String[] words = sentence.split(" ");
        String longestWord = "";
        try {
            int zero = 5/0;
        } catch (ArithmeticException e){
            System.out.println("You shall not fall!");
        }

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("The longest word in sentence is " + longestWord);
    }
}

