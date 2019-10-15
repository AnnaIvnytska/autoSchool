package a.programming.typeСonversions;

//В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n
public class Task2 {
    public static void main(String[] args) {
        int n = 482;
        int sum = 0;
        while(n != 0){
            sum += (n % 10);
            n/=10;
        }
        System.out.println(sum);
    }
}
