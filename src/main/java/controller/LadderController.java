package controller;

import domain.LadderGame;
import domain.ladder.LadderHeight;
import domain.ladder.Ladder;
import domain.LadderResult;
import domain.ladder.LadderWidth;
import view.InputView;
import view.OutputView;

import java.util.List;

public class LadderController {

    public void run(){
        List<String> players = InputView.inputPlayerNames();
        List<String> results = InputView.inputGamePrice();
        LadderWidth width = new LadderWidth(players.size());
        LadderHeight height = new LadderHeight(InputView.inputLadderHeight());

        Ladder ladder = new Ladder(width, height);
        LadderGame ladderGame = new LadderGame(ladder, results);
        LadderResult ladderResult = ladderGame.playGame();
        List<String> gameResult = ladderResult.getResults();

        OutputView.printLadder(ladder, players, results);

        while (true){
            String who = InputView.inputWhoseResult();

            if (who.equals("exit")){
                OutputView.printExitMessage();
                break;
            } else if (who.equals("all")){
                OutputView.printAllResult(gameResult, players);
                continue;
            }
            OutputView.printIndividualResult(gameResult,players, who);
        }
    }
}
