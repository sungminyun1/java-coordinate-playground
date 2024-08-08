package coord;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Point {

    private final int x;
    private final int y;

    public static Point getPoint(int x, int y) {
        return new Point(x, y);
    }

    public static Point getPoint(String pointString) {
        List<Integer> points = parseString(pointString);
        return new Point(points.get(0), points.get(1));
    }

    private Point(int x, int y) {
        this.x = checkPoint(x);
        this.y = checkPoint(y);
    }

    private static List<Integer> parseString(String pointString) {
        return Arrays.stream(pointString.substring(1, pointString.length() - 1)
                .split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    private int checkPoint(int p){
        if(p < 0 || p > 24) throw new IllegalArgumentException("범위 초과");
        return p;
    }

    public int calcWidth(Point end){
        return x - end.x;
    }

    public int calcHeight(Point end){
        return y - end.y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
