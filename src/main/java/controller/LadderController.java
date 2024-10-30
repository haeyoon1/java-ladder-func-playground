package controller;

import domain.Ladder;
import view.OutputView;

public class LadderController {

    public void run(){
        Ladder ladder = new Ladder();

        OutputView.printLadder(ladder); //사다리 모양 출력
        OutputView.printResult(ladder); //사다리 결과 출력
    }
}
