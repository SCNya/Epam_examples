package com.epam.examples.module02.stationery.writing.instrument;

import com.epam.examples.module02.stationery.Colors;
import org.javamoney.moneta.FastMoney;

import javax.money.MonetaryAmount;
import java.util.Objects;

/**
 * Created by Vsevolod on 13/03/16.
 */
public final class Pen extends WritingInstrument {
    public final static String type = "Ballpoint pen";
    private final boolean automatic;

    public Pen() {
        this(0.5, Colors.BLUE, false, "NoName", 0.60);
    }

    public Pen(double scale, Colors color, boolean automatic, String modelName, Number cost) {
        super(scale, color, modelName, cost);
        this.automatic = automatic;
    }

    public void view(){
        System.out.printf("Type = %s, automatic = %s, model = %s, color = %s, cost = %s\n", type, automatic, modelName, color, cost);
    }

    @Override
    public Pen setColor(Colors color) {
        if(this.color.equals(color))
            return this;
        else
            return new Pen(scale, color, automatic, modelName, cost.getNumber());
    }

    @Override
    public Pen setScale(double scale) {
        if(this.scale == scale)
            return this;
        else
            return new Pen(scale, color, automatic, modelName, cost.getNumber());
    }

    @Override
    public Pen setModelName(String modelName) {
        if(this.modelName.equals(modelName))
            return this;
        else
            return new Pen(scale, color, automatic, modelName, cost.getNumber());
    }

    @Override
    public Pen setCost(Number number) {
        MonetaryAmount cost = FastMoney.of(number, currency);
        if(this.cost.equals(cost))
            return this;
        else
        return new Pen(scale, color, automatic, modelName, cost.getNumber());
    }

    public Pen setAutomatic(boolean automatic) {
        if(this.automatic == automatic)
            return this;
        else
            return new Pen(scale, color, automatic, modelName, cost.getNumber());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pen pen = (Pen) o;
        return automatic == pen.automatic;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), automatic);
    }

    @Override
    public String toString() {
        final String toStr = super.toString() + "Pen{" +
                "automatic=" + automatic + ", type=\'" + type + "\'}";
        return toStr;
    }
}
