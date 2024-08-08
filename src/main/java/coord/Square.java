package coord;

public class Square implements Shape{

    private static final int POINTS_NUM = 4;

    public Square(Points points) {

    }

    public static boolean support(Points points) {
        return points.getPointsSize() == POINTS_NUM;
    }

    @Override
    public Double measure() {
        return 0.0;
    }
}
