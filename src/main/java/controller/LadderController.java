package controller;

import domain.Ladder;
import view.InputView;
import view.OutputView;

import java.util.List;

public class LadderController {

    public void run(){
        List<String> players = InputView.playerNames(); // 참여자 이름 입력
        List<String> results = InputView.gameResult(); // 실행 결과 입력
        int width = players.size(); // 사다리 넓이
        int height = InputView.getLadderHeight();  // 사다리 높이 입력

        Ladder ladder = new Ladder(width, height);

        OutputView.printLadder(ladder, players, results); //사다리 모양 출력

        while (true){ //사다리 결과 출력
            String who = InputView.whoseResult();
            OutputView.printResult(ladder, players, results, who);
            if (who.equals("exit")){
                break;
            }
        }
    }
}
