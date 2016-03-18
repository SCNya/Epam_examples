package com.epam.examples.module02.stationery.writing.instrument;

import com.epam.examples.module02.stationery.Colors;
import org.javamoney.moneta.FastMoney;

import javax.money.MonetaryAmount;

/**
 * Created by Vsevolod on 13/03/16.
 */
public final class Pencil extends WritingInstrument  {
    public final static String type = "Simple pencil";

    public Pencil() {
        this(0.6, Colors.GRAY, "NoName", 0.40);
    }

    public Pencil(double scale, Colors color, String modelName, Number cost) {
        super(scale, color, modelName, cost);
    }

    public void view(){
        System.out.printf("Type = %s, model = %s, color = %s, cost = %s\n", type, modelName, color, cost);
    }

    @Override
    public Pencil setColor(Colors color) {
        if(this.color.equals(color))
            return this;
        else
            return new Pencil(scale, color, modelName, cost.getNumber());
    }

    @Override
    public Pencil setScale(double scale) {
        if(this.scale == scale)
            return this;
        else
            return new Pencil(scale, color, modelName, cost.getNumber());
    }

    @Override
    public Pencil setModelName(String modelName) {
        if(this.modelName.equals(modelName))
            return this;
        else
            return new Pencil(scale, color, modelName, cost.getNumber());
    }

    @Override
    public Pencil setCost(Number number) {
        MonetaryAmount cost = FastMoney.of(number, currency);
        if(this.cost.equals(cost))
            return this;
        else
            return new Pencil(scale, color, modelName, cost.getNumber());
    }

    @Override
    public String toString() {
        final String toStr = new String(super.toString() + "Pencil{" +
                ", type=\'" + type + "\'}");
        return toStr;
    }
}
