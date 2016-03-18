package com.epam.examples.module01;

/**
 * Created by Vsevolod on 28/02/16.
 */
public class MainM1 {
    final static String MODULE_NAME = "------------MODULE-01------------";

    public static void main(String[] args) {
        getModuleName();

        Exam example = new Exam01();
        example.run();

        example = new Exam02();
        example.run();

        example = new Exam03();
        example.run();

        example = new Exam04();
        example.run();

        example = new Exam05();
        example.run();
    }

    private final static void getModuleName() {
        System.out.println();

        for(char ch:MODULE_NAME.toCharArray())
            System.out.print("\t" + ch);

        System.out.println();
    }
}
