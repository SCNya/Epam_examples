package com.epam.examples.module02.stationery;

import org.javamoney.moneta.FastMoney;

import javax.money.MonetaryAmount;

/**
 * Created by Vsevolod on 13/03/16.
 */
public final class Eraser extends Stationery {
    public final static String type = "Eraser";

    public Eraser() {
        this("NoName", 0.2);
    }

    public Eraser(String modelName, Number cost) {
        super(modelName, cost);
    }

    public void view(){
        System.out.printf("Type = %s, model = %s, cost = %s\n", type, modelName, cost);
    }

    @Override
    public Eraser setModelName(String modelName) {
        if(this.modelName.equals(modelName))
            return this;
        else
            return new Eraser(modelName, cost.getNumber());
    }

    @Override
    public Eraser setCost(Number number) {
        MonetaryAmount cost = FastMoney.of(number, currency);
        if(this.cost.equals(cost))
            return this;
        else
            return new Eraser(modelName, cost.getNumber());
    }

    @Override
    public String toString() {
        final String toStr = super.toString() + "Eraser{" +
                ", type=\'" + type + "\'} ";
        return toStr;
    }
}
