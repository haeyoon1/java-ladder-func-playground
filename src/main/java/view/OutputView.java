package view;

import domain.ladder.Ladder;
import domain.LadderResult;
import domain.ladder.Line;

import java.util.List;

public class OutputView {

    public static void printLadder(Ladder ladder, List<String> playerNames, List<String> resultNames) {
        System.out.println("실행 결과");

        System.out.println(String.join(" ", playerNames));

        for (Line line : ladder.getLines()) {
            printLine(line);
        }

        System.out.println(String.join(" ", resultNames));
    }

    private static void printLine(Line line) {
        StringBuilder result = new StringBuilder("|");

        for (boolean point : line.getPoints()) {
            if (point) {
                result.append("----|");
            } else {
                result.append("    |");
            }
        }
        System.out.println(result);
    }

    public static void printResult(LadderResult ladderResult, List<String> playerNames, String who) {

        List<String> results = ladderResult.calculateResults();

        if (who.equals("all")) {
            for (int i = 0; i < playerNames.size(); i++) {
                System.out.println(playerNames.get(i) + " :" + results.get(i));
            }
        } else if (who.equals("exit")) { //반복문 탈출 조건
            System.out.println("결과 조회를 종료합니다.");
        } else { //이름 하나 입력할경우
            if (playerNames.contains(who)) {
                System.out.println(who + " : " + results.get(playerNames.indexOf(who)));
            } else {
                System.out.println("해당 이름의 결과가 없습니다.");
            }
        }
    }
}
