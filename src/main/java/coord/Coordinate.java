package coord;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Coordinate {

    private Points points;
    private Shape shape;

    public Coordinate() {
        points = new Points();
    }

    public Coordinate(String stringPoints) {
       points = Points.getPoints(stringPoints);
       shape = ShapeFactory.getShape(points);
    }


}
