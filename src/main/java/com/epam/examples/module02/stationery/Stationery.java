package com.epam.examples.module02.stationery;

import org.javamoney.moneta.FastMoney;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import java.util.Comparator;
import java.util.Objects;

/**
 * Created by Vsevolod on 12/03/16.
 */
public abstract class Stationery{
    public final static CurrencyUnit currency = Monetary.getCurrency("USD");
    protected final String modelName;
    protected final MonetaryAmount cost;

    public Stationery(String modelName, Number cost) {
        this.modelName = modelName;
        this.cost = FastMoney.of(cost, currency);
    }

    public String getModelName() {
        return modelName;
    }

    public MonetaryAmount getCost() {
        return cost;
    }

    public abstract void view();

    public abstract Stationery setModelName(String modelName);

    public abstract Stationery setCost(Number number);

    public static class Comparators {

        public static Comparator<Stationery> NAME = new Comparator<Stationery>() {
            @Override
            public int compare(Stationery o1, Stationery o2) {
                return o1.modelName.compareTo(o2.modelName);
            }
        };
        
        public static Comparator<Stationery> COST = new Comparator<Stationery>() {
            @Override
            public int compare(Stationery o1, Stationery o2) {
                return o1.cost.compareTo(o2.cost);
            }
        };
        
        public static Comparator<Stationery> NAME_AND_COST = new Comparator<Stationery>() {
            @Override
            public int compare(Stationery o1, Stationery o2) {
                int i = o1.modelName.compareTo(o2.modelName);
                if (i == 0) {
                    return o1.cost.compareTo(o2.cost);
                }
                return i;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stationery that = (Stationery) o;
        return Objects.equals(modelName, that.modelName) &&
                Objects.equals(cost, that.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, cost);
    }

    @Override
    public String toString() {
        final String toStr = "Stationery{" +
                "modelName='" + modelName + '\'' +
                ", cost=" + cost + "} ";
        return toStr;
    }
}