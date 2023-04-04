package hw1;
//Вывести все простые числа от 1 до 1000 простое число - то число которое делится без остатка только на
//        1 и на само себя (1 - это не простое число);

import java.util.Scanner;

public class GetSimple {
    public static void getSimple() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        int num = scanner.nextInt();
        boolean simple = true;
        for (int i = 2; i <= num; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) {
                System.out.println(i);
            } else {
                simple = true;
            }
        }
    }
}
