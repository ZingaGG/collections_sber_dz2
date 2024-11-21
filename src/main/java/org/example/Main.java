package org.example;

import org.example.Model.PhoneBook;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1: ");
        countUniqueWords();

        // Task 2
        System.out.println("\nTask 2: ");

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ivanov", "123-456");
        phoneBook.add("Kirillov", "789-012");
        phoneBook.add("Dolmatov", "234-567");
        phoneBook.add("Dolmatov", "234-568");

        System.out.println("Ivanov phone numbers: " + phoneBook.get("Ivanov"));
        System.out.println("Kirillov phone numbers: " + phoneBook.get("Kirillov"));
        System.out.println("Dolmatov phone numbers: " + phoneBook.get("Dolmatov"));
        System.out.println("Bunin phone numbers:" + phoneBook.get("Bunin"));
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
