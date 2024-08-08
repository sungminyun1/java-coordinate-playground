package coord;

public class Line implements Shape{

    private static final int POINTS_NUM = 2;

    private final Point x;
    private final Point y;

    public Line(Points points) {
        x = points.getPoint(0);
        y = points.getPoint(1);
    }

    public static boolean support(Points points) {
        return points.getPointsSize() == POINTS_NUM;
    }

    @Override
    public Double measure() {
        int width = x.calcWidth(y);
        int height = x.calcHeight(y);
        return Math.sqrt(width * width + height * height);
    }
}
