package coord;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
