/**
 * 3. Дана строка произвольной длины с произвольными словами.
 * Написать программу для проверки является ли любое выбранное слово в строке палиндромом.
 * Например, есть строка, вводится число 3, значит необходимо проверить является ли 3ей слово в этой строке палиндромом.
 * Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например, в строке 5 слов, а на вход программе передали число 500 и т.п. ситуации.
 */

package com.tms.task3;

/**
 * This class contains test for the method from the task above
 */
public class Main {

    public static void main(String[] args) {
        String string = InputChecker.enterNotEmptyString();
        System.out.println(Task.isPalindrome(string, 5));
    }

}
