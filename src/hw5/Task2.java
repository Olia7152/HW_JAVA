package hw5;

import java.util.*;

/**
 * 2) Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова,
 * Иван Юрин, Петр Лыков, Павел Чернов, Иван Иванов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина,
 * Иван Иванов, Мария Рыкова, Анна Крутова, Марина Лугова, Анна Владимирова, Петр Лыков, Иван Мечников,
 * Петр Петин, Петр Лыков, Иван Ежов.
 * Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
 * Отсортировать по убыванию популярности.
 */


public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> listName = new LinkedList<>(Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова, \n" +
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Иван Иванов", "Петр Чернышов, \n" +
                "Мария Федорова", "Марина Светлова", "Мария Савина", "Иван Иванов", "Мария Рыкова", "Анна Крутова, \n" +
                "Марина Лугова", "Анна Владимирова", "Петр Лыков", "Иван Мечников,\n" +
                "Петр Петин", "Петр Лыков", "Иван Ежов"));

        System.out.println(getMapName(getFirstName(listName)));
        HashMap<String, Integer> map = getMapName(getFirstName(listName));
        TreeMap<String, Integer> sortedMap = new TreeMap<>(new ValueComparator(map)) {
        };
        sortedMap.putAll(map);
        System.out.println("\nСортированнае повторяющиеся:");
        for (HashMap.Entry<String, Integer> entry : sortedMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }


    static LinkedList<String> getFirstName(LinkedList<String> list) {
        LinkedList<String> newList = new LinkedList<>();
        for (String name : list) {
            String[] nameArray = name.split(" ");
            newList.add(nameArray[0]);
        }

        return newList;
    }

    static HashMap<String, Integer> getMapName(LinkedList<String> firstNameList) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String name : firstNameList) {
            if (!map.containsKey(name)) {
                map.put(name, 1);
            } else map.put(name, map.get(name) + 1);
        }
        return map;
    }

    static class ValueComparator implements Comparator<String> {
        HashMap<String, Integer> map;

        public ValueComparator(HashMap<String, Integer> map) {
            this.map = map;
        }

        // Функции сравнения...
        public int compare(String el1, String el2) {
            if (map.get(el1) >= map.get(el2)) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}
