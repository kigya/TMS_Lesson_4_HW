package com.tms.task2;

/**
 * This class contains method from the task
 */
public class Task {

    static String findWordWithMinLetters(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] stringArray = string.split(" ");
        int counter = string.length();
        StringBuilder target = new StringBuilder();
        for (String s : stringArray) {
            for (int j = 0; j < s.length(); j++) {
                if (stringBuilder.indexOf(String.valueOf(s.charAt(j))) == -1) {
                    stringBuilder.append(s.charAt(j));
                }
            }
            if (stringBuilder.length() < counter) {
                counter = stringBuilder.length();
                target = new StringBuilder(s);
            }
            stringBuilder.setLength(0);
        }
        return target.toString();
    }
}
