/**
 * 2. Дана строка произвольной длины с произвольными словами.
 * Найти слово, в котором число различных символов минимально. Слово может содержать буквы и цифры. Если таких слов несколько, найти первое из них.
 * Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
 */

package com.tms.task2;

/**
 * This class contains test for the method from the task above
 */
public class Main {

    public static void main(String[] args) {
        String string = InputChecker.enterNotEmptyString();
        System.out.println(Task.findWordWithMinLetters(string));
    }

}
