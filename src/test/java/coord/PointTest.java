package coord;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @DisplayName("포인트의 크기는 0 ~ 24 이다")
    @Test
    void createTest(){
        assertThatThrownBy(() -> Point.getPoint(0, 25)).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("String 을 이용해서 Point 를 생성할 수 있다")
    @Test
    void createStringPoint() {
        Point point = Point.getPoint("(10,10)");

        assertThat(point).isEqualTo(Point.getPoint(10, 10));
    }
}