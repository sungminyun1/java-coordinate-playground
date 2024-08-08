package coord;

public class Line implements Shape{

    private final Point x;
    private final Point y;

    public Line(Points points) {
        x = points.getPoint(0);
        y = points.getPoint(1);
    }

    @Override
    public Double measure() {
        int width = x.calcWidth(y);
        int height = x.calcHeight(y);
        return Math.sqrt(width * width + height * height);
    }
}
