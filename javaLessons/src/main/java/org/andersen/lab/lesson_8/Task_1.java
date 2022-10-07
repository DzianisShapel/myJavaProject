package org.andersen.lab.lesson_8;

import java.util.*;

public class Task_1 {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "avocado", "apricot", "apricot", "grapes", "grapes", "grapes", "grapes", "kiwi",
                "lime", "lemon", "mango", "melon", "melon", "melon", "apple");

        findUniqueWords(words);

    }

    public static void findUniqueWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
        for (String key : uniqueWords) {
            System.out.println("Frequency for " + key + ": " + Collections.frequency(words, key));
        }

    }
}
