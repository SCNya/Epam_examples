package com.epam.examples.module01;

import static java.lang.Math.tan;

/**
 * Created by Vsevolod on 28/02/16.
 */
public final class Exem02 extends Exem {

    private final double a;           //start
    private final double b;          //finish
    private final double h;         // step

    public Exem02()
    {
        this(0.0, 2.0, 0.14159265);
    }

    public Exem02(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public void run()
    {
        System.out.println("\n____________EXAMPLE-02____________\n");
         for (double i = a; i < b; i += h)
         {

             System.out.printf("x = %f \t F(x) = %f \n", i, calc(i));
         }
    }

    private final static double calc(double x)
    {
        return tan(2 * x) - 3;
    }

}
