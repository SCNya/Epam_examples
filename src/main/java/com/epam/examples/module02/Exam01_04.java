package com.epam.examples.module02;

import com.epam.examples.module02.stationery.Colors;
import com.epam.examples.module02.stationery.Eraser;
import com.epam.examples.module02.stationery.Notepad;
import com.epam.examples.module02.stationery.Stationery;
import com.epam.examples.module02.stationery.writing.instrument.Pen;
import com.epam.examples.module02.stationery.writing.instrument.Pencil;
import org.javamoney.moneta.FastMoney;

import javax.money.MonetaryAmount;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by Vsevolod on 14/03/16.
 */
public class Exam01_04 {

    public static void run() {

        System.out.println("\n\t____________EXAMPLE-01-04____________\n");

        System.out.println("\n____________Create_Junior_Set____________\n");

        ArrayList<Stationery> juniorSet = new ArrayList<>();
        juniorSet.add(new Pen().setCost(2));
        juniorSet.add(new Notepad());
        view(juniorSet);
        System.out.println("\nSort by the cost\n");
        juniorSet.sort(Stationery.Comparators.COST);
        view(juniorSet);
        viewFullCost(juniorSet);

        System.out.println("\n____________Create_Developer_Set____________\n");

        ArrayList<Stationery> developerSet = new ArrayList<>();
        developerSet.add(new Pen().setModelName("Pilot"));
        developerSet.add(new Notepad().setModelName("Kittens"));
        developerSet.add(new Pencil().setModelName("BestPencils"));
        developerSet.add(new Eraser().setModelName("JustClean"));
        view(developerSet);
        System.out.println("\nSort by the name\n");
        developerSet.sort(Stationery.Comparators.NAME);
        view(developerSet);
        viewFullCost(developerSet);

        System.out.println("\n____________Create_Manager_Set____________\n");

        ArrayList<Stationery> managerSet = new ArrayList<>();
        managerSet.add(new Pen().setModelName("Parker"));
        managerSet.add(new Pen().setColor(Colors.RED).setModelName("Parker").setCost(0.59));
        managerSet.add(new Notepad().setModelName("WhitePaper"));
        view(managerSet);
        System.out.println("\nSort by the name and cost\n");
        managerSet.sort(Stationery.Comparators.NAME_AND_COST);
        view(managerSet);
        viewFullCost(managerSet);
    }


    private static void view(ArrayList<Stationery> array) {
        System.out.println("\tViewing...\n");
        ListIterator<Stationery> it = array.listIterator();

        while (it.hasNext())
        {
            System.out.println("Item " + it.nextIndex() + ':');
            it.next().view();
            System.out.println();
        }

        System.out.println("\tSize of the set = " + array.size() + " item(s)\n");
    }

    private static void viewFullCost(ArrayList<Stationery> array) {
        ListIterator<Stationery> it = array.listIterator();

        MonetaryAmount fullCost = FastMoney.of(0, Stationery.currency);

        while (it.hasNext())
        {
            fullCost = fullCost.add(it.next().getCost());
        }
        System.out.println("\tFull cost of set = " + fullCost);
    }
}
