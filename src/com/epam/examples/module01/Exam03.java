package com.epam.examples.module01;

/**
 * Created by Vsevolod on 28/02/16.
 */
public final class Exam03 implements Exam {

    private double[] array;

    private double max;

    public Exam03() {
        this(0.0, 23.0, 3.14, 18, 54, 0.11);
    }

    public Exam03(double... array) {
        this.array = array;
    }

    @Override
    public void run() {
        System.out.println("\n____________EXAMPLE-03____________\n");

        view();

        findMax();
        System.out.println("\nMax = " + max);
    }

    private final void view() {
        System.out.print("\nArray of decimal: ");
        for(double it:array)
            System.out.print(it + " ");
        System.out.println();
    }


    private void findMax() {
        max = array[0] + array[1];

        for (int n = 1; n < array.length - 1; n++)
            if (max < array[n] + array[n + 1])
                max = array[n] + array[n + 1];
    }

}