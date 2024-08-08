package car;

public class K5 implements Car {
    private final static int EFFICIENT = 13;

    private int distance;

    public K5(int distance) {
        this.distance = distance;
    }

    @Override
    public String report() {
        return "K5 : " + (distance / EFFICIENT) + "리터";
    }
}
