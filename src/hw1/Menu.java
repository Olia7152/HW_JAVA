package hw1;
//Реализовать простой калькулятор
//    привести строку к double типу: Double.parseDouble(str); либо использовать Scanner.nextInt или nextDouble

import java.util.Scanner;
public class Menu {
    public static void menu(){
        System.out.println("Введите первое число");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.println("Выберите необходимое действие: + - * /");
        String action = sc.next();
        System.out.println("Введите второе число");
        double y = sc.nextDouble();
        switch (action) {
            case "/" -> {
                double z = x / y;
                System.out.println(z);
            }
            case "+" -> {
                double z = x + y;
                System.out.println(z);
            }
            case "-" -> {
                double z = x - y;
                System.out.println(z);
            }
            case "*" -> {
                double z = x * y;
                System.out.println(z);
            }
        }
    }
}
