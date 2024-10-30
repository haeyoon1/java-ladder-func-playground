package domain;

import view.InputView;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private final List<Line> lines;

    private static final int WIDTH = InputView.getLadderWidth();
    private static final int HEIGHT = InputView.getLadderHeight();

    public Ladder() {
        this.lines = createLadder();
    }

    private List<Line> createLadder() {
        List<Line> ladderLines = new ArrayList<>();
        for (int i = 0; i < HEIGHT; i++) {
            ladderLines.add(new Line(WIDTH));
        }
        return ladderLines;
    }

    public int getWidth() {
        return WIDTH;
    }

    public List<Line> getLines() {
        return lines;
    }
}
