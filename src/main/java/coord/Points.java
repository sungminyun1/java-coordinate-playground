package coord;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Points {
    List<Point> points;

    public Points(){
        points = new ArrayList<>();
    }

    public Points(List<Point> points) {
        this.points = points;
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public static Points getPoints(String stringPoints) {
        return new Points(Arrays.stream(stringPoints.split("-"))
                .map(Point::getPoint)
                .collect(Collectors.toList()));
    }

    public int getPointsSize(){
        return points.size();
    }

    public Point getPoint(int index){
        return points.get(index);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Points points1 = (Points) o;
        return Objects.equals(points, points1.points);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(points);
    }
}
