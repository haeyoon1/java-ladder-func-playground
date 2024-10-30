package view;

import domain.Ladder;
import domain.LadderResult;
import domain.Line;

public class OutputView {

    public static void printLadder(Ladder ladder) {
        System.out.println("실행 결과");
        for (Line line : ladder.getLines()) {
            printLine(line);
        }
        System.out.println();
    }

    private static void printLine(Line line) {
        StringBuilder result = new StringBuilder("|");

        for (boolean point : line.getPoints()) {
            result.append(point ? "----|" : "    |");
        }
        System.out.println(result);
    }

    public static void printResult(Ladder ladder) {
        LadderResult ladderResult = new LadderResult(ladder);
        int[] results = ladderResult.calculateResults();

        for (int i = 0; i < results.length; i++) {
            System.out.println(i + " -> " + results[i]);
        }
    }
}
