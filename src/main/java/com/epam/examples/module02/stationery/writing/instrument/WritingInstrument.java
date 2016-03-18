package com.epam.examples.module02.stationery.writing.instrument;

import com.epam.examples.module02.stationery.Colors;
import com.epam.examples.module02.stationery.Stationery;

import java.util.Objects;

/**
 * Created by Vsevolod on 11/03/16.
 */
public abstract class WritingInstrument extends Stationery {
    protected final Colors color;
    protected final double scale;

    public WritingInstrument(double scale, Colors color, String modelName, Number cost) {
        super(modelName, cost);
        this.scale = scale;
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }

    public double getScale() {
        return scale;
    }

    public abstract void view();

    public abstract Stationery setColor(Colors color);

    public abstract Stationery setScale(double scale);

    public abstract Stationery setModelName(String modelName);

    public abstract Stationery setCost(Number number);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WritingInstrument that = (WritingInstrument) o;
        return Double.compare(that.scale, scale) == 0 &&
                Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, scale);
    }

    @Override
    public String toString() {
        final String toStr = super.toString() + "WritingInstrument{" +
                "color=" + color + ", scale=" + scale + "} ";
        return toStr;
    }
}
