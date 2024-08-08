package coord;

import java.util.Arrays;

public class Coordinate {

    private Points points = new Points();

    public void addPoints(String stringPoints){
        Arrays.stream(stringPoints.split("-"))
                .forEach(str -> points.addPoint(Point.getPoint(str)));
    }

    public Points getPoints() {
        return points;
    }
}
