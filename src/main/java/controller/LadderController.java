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

    private Ladder ladder;
    private List<String> players;
    private List<String> results;
    private List<String> gameResult;

    public void createLadder(){
        players = InputView.inputPlayerNames();
        results = InputView.inputGamePrice();

        LadderWidth width = new LadderWidth(players.size());
        LadderHeight height = new LadderHeight(InputView.inputLadderHeight());

        ladder = new Ladder(width, height, players, results);
    }

    public void playLadderGame(){
        LadderGame ladderGame = new LadderGame(ladder, results);
        LadderResult ladderResult = ladderGame.playGame();
        gameResult = ladderResult.getResults();

        OutputView.printLadder(ladder, players, results);
    }

    public void checkLadderGameResult(){
        while (true){
            String who = InputView.inputWhoseResult();

            if (who.equals("exit")){
                OutputView.printExitMessage();
                break;
            }
            if (who.equals("all")){
                OutputView.printAllResult(gameResult, players);
                continue;
            }
            OutputView.printIndividualResult(gameResult,players, who);
        }
    }
}
