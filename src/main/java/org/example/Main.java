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

        phoneBook.add("Максим", "123-456");
        phoneBook.add("Антон", "789-012");
        phoneBook.add("Анна", "234-567");
        phoneBook.add("Анна", "234-568");

        System.out.println("Номера Максима: " + phoneBook.get("Максим"));
        System.out.println("Номера Антона: " + phoneBook.get("Антон"));
        System.out.println("Номера Анны: " + phoneBook.get("Анна"));
        System.out.println("Номера Кирилла" + phoneBook.get("Кирилл"));
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