package coord;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static org.junit.jupiter.api.Assertions.*;

class LineTest {


    @DisplayName("라인의 길이를 구한다")
    @Test
    void getLineLen() {
        Points points = Points.getPoints("(10,10)-(14,15)");
        Shape line = new Line(points);

        assertThat(line.measure()).isEqualTo(6.403124, offset(0.009));

    }
}