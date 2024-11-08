package domain.ladder;

import domain.Height;
import domain.Width;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ladder {
    private final List<Line> lines;
    private final Width width;
    private final Height height;

    public Ladder(Width width, Height height) {
        this.width = width;
        this.height = height;
        this.lines = createLadder();
    }

    private List<Line> createLadder() {
        List<Line> ladderLines = new ArrayList<>();
        for (int i = 0; i < height.getValue(); i++) {
            ladderLines.add(new Line(width.getValue()));
        }
        return ladderLines;
    }

    public int getWidth() {
        return width.getValue();
    }

    public List<Line> getLines() {
        return Collections.unmodifiableList(lines);
    }
}
