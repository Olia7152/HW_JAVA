package hw4;
//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {
    static LinkedList<String> inverted(LinkedList<String> list){
        LinkedList<String> new_list = new LinkedList<String>();
        for (int i = list.size()-1; i >=0 ; i--){
            new_list.add(list.get(i));
        }
        return new_list;
    }

    public static void main(String[] args) {
        Scanner inputText = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<String>();
        System.out.println("Ведите текст: ");

        for (int i = 0; i<2 ; i++){
            String text = inputText.next();
            list.add(text);
        }
        System.out.println("Массив первоначальный:  " + list);
        inputText.close();

        System.out.print("Новый перевернутый массив: " + inverted(list));
    }
}
