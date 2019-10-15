package a.programming.typeСonversions;

//Даны три переменные a, b и c. Изменить значения этих переменных так, чтобы
// в a хранилось значение a+b, в b хранилась разность старых значений c−a, а в c хранилось сумма старых значений a+b+c.
// Например, a=0, b=2, c=5, тогда новые значения a=2, b=5 и c=7.

public class Task4 {
    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        int c = 5;

        a = a + b;
        b = c - a + b;
        c = a + c;

        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

    }
}
