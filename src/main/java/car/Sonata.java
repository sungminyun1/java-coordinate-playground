package car;

public class Sonata implements Car {
    private final static int EFFICIENT = 10;

    private int distance;

    public Sonata(int distance) {
        this.distance = distance;
    }

    @Override
    public String report() {
        return "Sonata : " + (distance / EFFICIENT) + "리터";
    }
}
