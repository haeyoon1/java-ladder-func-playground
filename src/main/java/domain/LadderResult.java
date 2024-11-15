package domain;

import domain.ladder.Ladder;
import domain.ladder.Line;

import java.util.ArrayList;
import java.util.List;

public class LadderResult {

    private final List<String> gameResults;

    public LadderResult(List<String> gameResults) {
        this.gameResults = gameResults;
    }

    public List<String> getResults(){
        return gameResults;
    }


}
