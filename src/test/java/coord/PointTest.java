package coord;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @DisplayName("포인트의 크기는 0 ~ 24 이다")
    @Test
    void createTest(){
        assertThatThrownBy(() -> new Point(0, 25)).isInstanceOf(IllegalArgumentException.class);
    }
}