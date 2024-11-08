package domain;

import domain.ladder.Ladder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LadderTest {
    @Test
    public void 사다리_크기_확인_테스트() {
        Width width = new Width(4);
        Height height = new Height(3);
        Ladder ladder = new Ladder(width, height);

        assertEquals(width.getValue(), ladder.getWidth());
        assertEquals(height.getValue(), ladder.getLines().size());
    }

}
