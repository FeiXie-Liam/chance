package chance;

public class Chance {
    private Double fraction;

    public Chance(Double fraction) {
        this.fraction = fraction;
    }

    public Chance not() {
        return new Chance(1 - fraction);
    }
}
