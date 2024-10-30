package domain;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private final List<Line> lines;

    private final int width;
    private final int height;

    public Ladder(int width, int height) {
        this.width = width;
        this.height = height;
        this.lines = createLadder();
    }

    private List<Line> createLadder() {
        List<Line> ladderLines = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            ladderLines.add(new Line(width));
        }
        return ladderLines;
    }

    public int getWidth() {
        return width;
    }

    public List<Line> getLines() {
        return lines;
    }
}
