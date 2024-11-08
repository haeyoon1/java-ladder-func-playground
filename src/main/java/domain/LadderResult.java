package domain;

import domain.ladder.Ladder;
import domain.ladder.Line;

import java.util.ArrayList;
import java.util.List;

public class LadderResult {

    private final Ladder ladder;
    private final List<String> gameResults;

    public LadderResult(Ladder ladder, List<String> gameResults) {
        this.ladder = ladder;
        this.gameResults = gameResults;
    }

    public List<String> calculateResults() {

        int width = ladder.getWidth();
        List<String> results = new ArrayList<>();

        for (int i = 0; i < width; i++) {
            int endPoint = calculateEndPoint(i);
            results.add(gameResults.get(endPoint));
        }
        return results;
    }

    private int calculateEndPoint(int startPoint) {
        int currentPoint = startPoint;

        for (Line line : ladder.getLines()) {
            if ((currentPoint < line.getPoints().size() - 1) && (line.getPoints().get(currentPoint))) {
                currentPoint++;
            } else if ((currentPoint > 0) && (line.getPoints().get(currentPoint - 1))) {
                currentPoint--;
            }
        }
        return currentPoint;
    }
}
