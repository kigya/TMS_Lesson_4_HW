package com.tms.task3;

import java.util.Scanner;

/**
 * This class contains method for valid user input (not-null string)
 */
public class InputChecker {

    static String enterNotEmptyString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string: ");
        StringBuilder stringBuilder;
        boolean key = true;
        do {
            stringBuilder = new StringBuilder(scanner.nextLine());
            if (stringBuilder.length() == 0) {
                System.out.println("String is empty! Try again!");
            } else {
                key = false;
            }
        } while (key);
        return stringBuilder.toString();
    }

}