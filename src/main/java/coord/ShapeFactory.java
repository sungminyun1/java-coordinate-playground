package coord;

public class ShapeFactory {
    private static final int LINE = 2;

    private ShapeFactory() {}

    public static Shape getShape(Points points){
        if (points.getPointsSize() == LINE) {
            return new Line(points);
        }
        return null;
    }
}
