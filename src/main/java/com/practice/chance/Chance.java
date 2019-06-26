package com.practice.chance;

public class Chance {
    private Double fraction;

    public Chance(Double fraction) {
        this.fraction = fraction;
    }

    public Chance not() {
        return new Chance(1 - this.fraction);
    }

    public Chance and(Chance another) {
        return new Chance(this.fraction * another.fraction);
    }

    public Chance or(Chance another) {
        return this.not().and(another.not()).not();
    }
}
