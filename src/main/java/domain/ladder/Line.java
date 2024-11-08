package domain.ladder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Line {
    private final List<Boolean> points;

    public Line(int width) {
        this.points = createLine(width);
    }

    private List<Boolean> createLine(int width) {
        List<Boolean> linePoints = new ArrayList<>();

        Random random = new Random();
        boolean previousPoint = false; //이전에 가로선 있었는지

        for (int i = 0; i < width - 2; i++) {
            boolean point = random.nextBoolean() && !previousPoint;
            linePoints.add(point);
            previousPoint = point;
        }
        linePoints.add(false);

        return linePoints;
    }

    public List<Boolean> getPoints() {
        return Collections.unmodifiableList(points);
    }

}
