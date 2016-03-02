package com.epam.examples.module01;

/**
 * Created by Vsevolod on 29/02/16.
 */
public final class Exam04 implements Exam {

    private final short lines = 5;
    private final short columns = 6;

    private byte [][] array;

    public Exam04() {
        array = new byte[lines][columns];
    }

    @Override
    public void run() {
        System.out.println("\n____________EXAMPLE-04____________\n");

        fillArray();
        view();
    }

    private void view() {

        for (short i = 0; i < lines; i++) {

            if (i == 3)
                printLine();

            for (short j = 0; j < columns; j++) {
                if (j == 3)
                    System.out.print(" ");

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    private final void printLine() {
        for (short i = 0; i < columns; i++)
            System.out.print(" ");

        System.out.println();
    }

    private void fillArray() {
        for (short i = 0; i < lines; i++)
            for (short j = 0; j < columns; j++) {
                if (i == j) {
                    if (i < 3)
                        array[i][j] = 1;
                    else
                        array[i][j + 1] = 1;
                }

                if(j == ((columns - 1) - i)) {
                    if (i < 3)
                        array[i][j] = 1;
                    else
                        array[i][j - 1] = 1;
                }
            }
    }
}
