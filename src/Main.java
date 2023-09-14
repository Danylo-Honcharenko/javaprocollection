import phonebook.PhoneBook;
import phonebook.Record;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("Дима", "Вася", "Дима", "Один", "Дима", "Дима", "Соня", "Лиса", "Дима", "Лес", "Дима",
                "Дима", "Ура", "Дима", "Дима", "Ура", "Дима", "Дима", "Ура", "Дима", "Дом", "Дача", "Дима", "Думаю", "Дима");

        ArrayCollection.countOccurance(wordList, "Дима");

        System.out.println("\nInput array");
        System.out.println("===================");
        Integer[] numbers = new Integer[]{12, 11, 14, 45, 85, 112, 336, 45};
        for (int inputNumber : numbers) {
            System.out.println(inputNumber);
        }

        System.out.println("\nConverted array");
        System.out.println("===================");

        for (int conversionList : ArrayCollection.toList(numbers)) {
            System.out.println(conversionList);
        }

        System.out.println("\nNot a unique array");
        System.out.println("===================");
        List<Integer> numbersList = Arrays.asList(12, 12, 5, 88, 55, 5, 5);

        for (int numbersUnique : numbersList) {
            System.out.println(numbersUnique);
        }

        System.out.println("\nUnique array");
        System.out.println("===================");
        for (int findResultNumbers : ArrayCollection.findUnique(numbersList)) {
            System.out.println(findResultNumbers);
        }

        System.out.println("\nWords in a list (Map)");
        System.out.println("===================");
        List<String> words = Arrays.asList("Машина", "Машина", "Петя", "Петя", "Царь", "Вася", "Баран", "Корова", "Корова",
                "Бог", "Собака");

        for (String wordResult : words) {
            System.out.println(wordResult);
        }

        System.out.println("\nMap");
        System.out.println("===================");
        System.out.println("[");
        for (WordOccurrence wordOccurrence : ArrayCollection.calcOccurance(words)) {
            System.out.println("\t{" + "name: " + "\"" + wordOccurrence.word + "\"" + ", " + "occurrence: " + wordOccurrence.quantity + "},");
        }
        System.out.println("]");

        System.out.println("\nPhone");
        System.out.println("===================");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(new Record("Вася", 789451247));
        phoneBook.add(new Record("Вася", 894587894));
        phoneBook.add(new Record("Петя", 789451247));
        phoneBook.add(new Record("Ира", 889456154));
        phoneBook.add(new Record("Игнат", 633541245));

        String searchNumber = "Петя";
        Record record = phoneBook.find(searchNumber);
        if(record != null) {
            System.out.println("Найден номер телефона: " + record.getPhoneNumber());
        } else {
            System.out.println("Номер телефона для " + searchNumber + " не найден");
        }

        System.out.println("=========");
        String searchNumbers = "Вася";
        List<Record> allRecords = phoneBook.findAll(searchNumbers);
        if(allRecords != null) {
            System.out.println("Найденены номера телефона для " + searchNumbers + ":");
            for (Record rec: allRecords) {
                System.out.println(rec.getPhoneNumber());
            }
        } else {
            System.out.println("Номера для " + searchNumbers + " не найдены");
        }
    }
}