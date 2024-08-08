package coord;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CoordinateTest {

    @DisplayName("여려개의 좌표 생성")
    @Test
    void addPoints(){
        Coordinate coordinate = new Coordinate();

        coordinate.addPoints("(10,10)-(14,15)");
        Points points = coordinate.getPoints();

        List<Point> list = new ArrayList<>();
        list.add(Point.getPoint(10,10));
        list.add(Point.getPoint("(14,15)"));

        assertThat(points).isEqualTo(new Points(list));
    }
}