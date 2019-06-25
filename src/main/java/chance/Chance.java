package chance;

public class Chance {
    private Double fraction;

    public Chance(Double fraction) {
        this.fraction = fraction;
    }

    public Chance not() {
        return new Chance(1 - fraction);
    }

    public Chance add(Chance other) {
        return new Chance(fraction * other.fraction);
    }

    public Chance or(Chance other) {
        return this.not().add(other.not()).not();
    }
}
