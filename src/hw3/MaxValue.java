package hw3;
//3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MaxValue {
    public static void maxMinValue() {
        Random rnd = new Random();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int value = rnd.nextInt(1, 100);
            arr.add(value);
        }
        int mn = Collections.min(arr);
        int mx = Collections.max(arr);
        double md = (double) (mx - mn) / 2;
        int ind = 0;
        double minMd = mx;
        for (int i = 0; i < arr.size(); i++) {
            if ((Math.abs(arr.get(i) - md)) < minMd){
                minMd = (Math.abs(arr.get(i) - md));
                ind = i;
            }
        }
        System.out.printf("Список: %s\n", arr);
        System.out.printf("Максимальное число: %s\n", Collections.max(arr));
        System.out.printf("Минимальное число: %s\n", Collections.min(arr));
        System.out.printf("Среднее из списка: %s\n", arr.get(ind));
    }
}
