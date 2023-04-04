package hw1;
//n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Factorial {
    public static void factorial() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число n для вычисления факториала (n!): ");
        int n = iScanner.nextInt();
        System.out.printf("Результат: %d\n", numInput(n));
        iScanner.close();
    }
    public static int numInput(int n) {
        int result = 1;
        for (int i = 1; i < n+1; i++) {
            result = i * result;
        }
        return result;
    }
}
