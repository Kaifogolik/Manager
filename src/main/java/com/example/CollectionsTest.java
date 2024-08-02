package com.example;

import java.util.*;


public class CollectionsTest {
    public static Set<Integer> dooblicateKiller(List<Integer> list) {
        return new HashSet<>(list);
    }

    public static List<String> sortSet(Set<String> set) {
        ArrayList<String> strings = new ArrayList<>(set);
        Collections.sort(strings);
        return strings;
    }

    private static void measureTime(String description, Runnable task) {
        long startTime = System.nanoTime();
        task.run();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000; // Перевод в миллисекунды
        System.out.println(description + ": " + duration + " ms");
    }


    public static void main(String[] args) {
        int size = 1000000;
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> integers = dooblicateKiller(numbers);
        System.out.println(integers);
        Set<String> words = new HashSet<>(Arrays.asList("apple", "banana", "apple", "orange"));
        List<String> sortedWords = sortSet(words);
        System.out.println("Sorted Words: " + sortedWords);
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
            linkedList.add(i);

        }
        measureTime("ArrayList insert at beginning", () -> arrayList.add(0, -1));
        measureTime("LinkedList insert at beginning", () -> linkedList.add(0, -1));
        // Вставка в середину списка
        measureTime("ArrayList insert in middle", () -> arrayList.add(size / 2, -1));
        measureTime("LinkedList insert in middle", () -> linkedList.add(size / 2, -1));
        // Вставка в конец списка
        measureTime("ArrayList insert at end", () -> arrayList.add(-1));
        measureTime("LinkedList insert at end", () -> linkedList.add(-1));
// Доступ к элементу по индексу
        measureTime("ArrayList get by index", () -> arrayList.get(size / 2));
        measureTime("LinkedList get by index", () -> linkedList.get(size / 2));
    }


}
