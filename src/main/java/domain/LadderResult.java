package domain;

public class LadderResult {

    private final Ladder ladder;

    public LadderResult(Ladder ladder) {
        this.ladder = ladder;
    }

    public int[] calculateResults() {

        int width = ladder.getWidth();
        int[] results = new int[width];

        for (int i = 0; i < width; i++) {
            results[i] = calculaateEndPoint(i);
        }
        return results;
    }

    private int calculaateEndPoint(int startPoint) {
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
