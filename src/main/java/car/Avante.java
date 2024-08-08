package car;

public class Avante implements Car{

    private final static int EFFICIENT = 15;

    private int distance;

    public Avante(int distance) {
        this.distance = distance;
    }

    @Override
    public String report() {
        return "Avante : " + (distance / EFFICIENT) + "리터";
    }
}
