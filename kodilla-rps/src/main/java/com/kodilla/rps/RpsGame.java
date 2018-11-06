package com.kodilla.rps;

import com.kodilla.rps.round.RpsRound;
import com.kodilla.rps.round.RpsRoundResult;

public class RpsGame {

    private RpsGameDefinition rpsGameDefinition;
    private static boolean end;
    private static int playerWins;
    private static int computerWins;

    public RpsGame(RpsGameDefinition rpsGameDefinition) {
        this.rpsGameDefinition = rpsGameDefinition;
        end = false;
        playerWins = 0;
        computerWins = 0;
    }

    private static void endGame() {
        end = true;
    }

    private static void resolveRound(RpsRoundResult result) {
        switch (result) {
            case WIN:
                playerWins++;
                break;
            case LOSS:
                computerWins++;
                break;
            case DRAW:
                break;
            case REPLAY:
                break;
            case END:
                endGame();
                break;
            case BAD:
                break;
        }
    }

    public void play() {
        RpsMenu.printGameInstructions();
        while (!end) {
            resolveRound(RpsRound.playRound());

            int rounds = rpsGameDefinition.getRounds();
            if (rounds == playerWins || rounds == computerWins) {
                endGame();
            }
        }
    }
}
