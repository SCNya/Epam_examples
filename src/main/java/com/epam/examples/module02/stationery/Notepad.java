package com.epam.examples.module02.stationery;

import org.javamoney.moneta.FastMoney;

import javax.money.MonetaryAmount;
import java.util.Objects;

/**
 * Created by Vsevolod on 13/03/16.
 */
public final class Notepad extends Stationery {
    public final static String type = "Notepad";
    protected final int size;    //Blank pages

    public Notepad() {
        this(120);
    }

    public Notepad(int size) {
        super("NoName", 1.2);
        this.size = size;
    }
    public Notepad(int size, String modelName, Number cost) {
        super(modelName, cost);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public Stationery setSize(int size) {
        if(this.size == size)
            return this;
        else
            return new Notepad(size, modelName, cost.getNumber());
    }

    public void view(){
        System.out.printf("Type = %s, model = %s, size = %s pages, cost = %s\n", type, modelName, size, cost);
    }

    @Override
    public Notepad setModelName(String modelName) {
        if(this.modelName.equals(modelName))
            return this;
        else
            return new Notepad(size, modelName, cost.getNumber());
    }

    @Override
    public Notepad setCost(Number number) {
        MonetaryAmount cost = FastMoney.of(number, currency);
        if(this.cost.equals(cost))
            return this;
        else
            return new Notepad(size, modelName, cost.getNumber());
    }

    public Notepad setSize(MonetaryAmount cost) {
        if(this.size == size)
            return this;
        else
            return new Notepad(size, modelName, cost.getNumber());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Notepad notepad = (Notepad) o;
        return size == notepad.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }

    @Override
    public String toString() {
        final String toStr = super.toString() + "Notepad{" +
                "size=" + size + ", type=\'" + type + "\'} ";
        return toStr;
    }
}
