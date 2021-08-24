/**
 * 0.Написать программу со следующим функционалом:
 *   На вход передать строку(будем считать, что это номер документа).
 *   Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x - это число, а y - это буква.
 *     Вывести на экран в одну строку два первых блока по 4 цифры
 *     Вывести на экран номер документа, но блоки из трех букв заменить на (каждая буква заменятся )
 *     Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
 *     Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder)
 *     Проверить содержит ли номер документа последовательность abc и вывеcти сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
 *     Проверить начинается ли номер документа с последовательности 555.
 *     Проверить заканчивается ли номер документа на последовательность 1a2b.
 *     Все эти методы реализовать в отдельном классе в статических методах, которые на вход(входным параметром) будут принимать вводимую на вход программы строку.
 */

package com.tms.task0;

/**
 * This class contains some tests for methods from the task above
 */
public class Main {

    public static void main(String[] args) {
        String documentNumber = InputChecker.enterValidDocumentNumber();
        System.out.println(Task.returnTwoFirstNumberBlocksInString(documentNumber));
        System.out.println(Task.returnReplacedThreeWordBlocks(documentNumber));
        System.out.println(Task.returnWordsFromDocumentNumber(documentNumber));
        System.out.println(Task.returnWordsFromDocumentNumberInFormat(documentNumber));
        System.out.println(Task.isContainsSubstring(documentNumber));
        System.out.println(Task.isStartsWithSubstring(documentNumber));
        System.out.println(Task.isEndsWithSubstring(documentNumber));
    }

}
