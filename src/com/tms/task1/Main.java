/**
 * 1. Дана строка произвольной длины с произвольными словами.
 * Найти самое короткое слово в строке и вывести его на экран.
 * Найти самое длинное слово в строке и вывести его на экран.
 * Если таких слов несколько, то вывести последнее из них.
 */

package com.tms.task1;

import java.util.Scanner;

/**
 * This class contains some tests for methods from the task above
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = InputChecker.enterNotEmptyString();
        System.out.println(Task.findTheShortestWord(string));
        System.out.println(Task.findTheLongestWord(string));
    }

}
