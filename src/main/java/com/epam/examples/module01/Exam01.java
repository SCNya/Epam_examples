package com.epam.examples.module01;

/**
 * Created by Vsevolod on 28/02/16.
 */
public final class Exam01 implements Exam {

    private final double E;

    public Exam01() {
        this(1.0E-2);
    }

    public Exam01(double e) {
        E = e;
    }

    @Override
    public void run() {
        System.out.println("\n\t____________EXAMPLE-01____________\n");

        int n = 0;
        double a;

        do
        {
            n++;
            a = calc(n);
            System.out.printf("a = %Ef \n", a);
        }
        while (a > E);

        System.out.println("Number = " + n + '\n');
    }

    private final static double calc(int n)
    {
        return 1.0 / ((n + 1) * (n + 1));
    }
}
