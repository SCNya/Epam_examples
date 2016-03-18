package com.epam.examples.module02;

/**
 * Created by Vsevolod on 11/03/16.
 */
public class MainM2 {
    final static String MODULE_NAME = "------------MODULE-02------------";

    public static void main(String[] args) {
        getModuleName();
        Exam01_04.run();
        Exam05.run();
        Exam06_07.run();
    }

    private final static void getModuleName() {
        System.out.println();

        for(char ch:MODULE_NAME.toCharArray())
            System.out.print("\t" + ch);

        System.out.println();
    }
}
