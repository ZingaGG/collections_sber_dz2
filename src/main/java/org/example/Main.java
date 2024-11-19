package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        countUniqueWords();
    }

    // Use this method to count the amount of unique words (Task 1)
    public static void countUniqueWords(){
        String[] array = {"a", "b", "c", "d", "a", "b", "c", "d", "a", "c", "y", "c", "d"};

        HashMap<String, Integer> resultMap = new HashMap<>();
        for (String word : array) {

            if (resultMap.containsKey(word)) {
                int newValue = resultMap.get(word) + 1;
                resultMap.replace(word, newValue);
            } else {
                resultMap.put(word, 1);
            }
        }

        System.out.println(resultMap);
    }
}