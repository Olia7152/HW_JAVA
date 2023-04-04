package hw1;
//Вычислить n-ое треугольного число (сумма чисел от 1 до n)

import java.util.Scanner;

public class TriangleNum {
    public static void triangleNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        int num = scanner.nextInt();
        double tNum = 0.5 * num * (num + 1);
        System.out.println(tNum);
    }
}
