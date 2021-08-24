package com.tms.task1;

/**
 * This class contains methods from the task
 */
public class Task {

    static String findTheShortestWord(String string) {
        String[] stringArray = string.split(" ");
        int counter = string.length();
        int iterationShortest = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length() <= counter && stringArray[i].matches("[a-zA-Z]+")) {
                counter = stringArray[i].length();
                iterationShortest = i;
            }
        }
        return stringArray[iterationShortest];
    }

    static String findTheLongestWord(String string) {
        String[] stringArray = string.split(" ");
        int counter = 0;
        int iterationShortest = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length() >= counter && stringArray[i].matches("[a-zA-Z]+")) {
                counter = stringArray[i].length();
                iterationShortest = i;
            }
        }
        return stringArray[iterationShortest];
    }
}
