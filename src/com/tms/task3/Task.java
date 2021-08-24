package com.tms.task3;

/**
 * This class contains method from the task
 */
public class Task {

    static String isPalindrome(String string, int number) {
        String[] stringArray = string.trim()
                .replaceAll(" +", " ")
                .split(" ");
        if (number > stringArray.length) {
            return "You want to check non-existent word! There are only "
                    .concat(String.valueOf(stringArray.length)) + " words in string";
        } else {
            if (stringArray[number - 1].length() > 1 &&
                    stringArray[number - 1].equals(new StringBuilder(stringArray[number - 1])
                            .reverse()
                            .toString())) {
                return "Palindrome!";
            } else {
                return "Not a palindrome!";
            }
        }
    }
}
