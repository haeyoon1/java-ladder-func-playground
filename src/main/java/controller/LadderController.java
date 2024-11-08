package controller;

import domain.Height;
import domain.ladder.Ladder;
import domain.LadderResult;
import domain.Width;
import view.InputView;
import view.OutputView;

import java.util.List;

public class LadderController {

    public void run(){
        List<String> players = InputView.inputPlayerNames();
        List<String> results = InputView.inputGamePrice();
        Width width = new Width(players.size());
        Height height = new Height(InputView.inputLadderHeight());

        Ladder ladder = new Ladder(width, height);
        LadderResult ladderResult = new LadderResult(ladder, results);

        OutputView.printLadder(ladder, players, results);

        while (true){
            String who = InputView.inputWhoseResult();
            if (who.equals("exit")){
                break;
            }
            OutputView.printResult(ladderResult, players, who);
        }
    }
}
