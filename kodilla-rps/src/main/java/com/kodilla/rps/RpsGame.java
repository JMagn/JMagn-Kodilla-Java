package com.kodilla.rps;

import com.kodilla.rps.round.RpsRound;
import com.kodilla.rps.round.RpsRoundResult;

import java.util.Scanner;

public class RpsGame {

    private RpsGameDefinition rpsGameDefinition;
    private static boolean end;
    private static int playerWins;
    private static int computerWins;
    private int roundCounter;

    public RpsGame(RpsGameDefinition rpsGameDefinition) {
        this.rpsGameDefinition = rpsGameDefinition;
        end = false;
        playerWins = 0;
        computerWins = 0;
        roundCounter = 0;
    }
    private void resolveRound(RpsRoundResult result) {
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
                replayGame();
                break;
            case END:
                endGame();
                break;
            case BAD:
                break;
        }
    }

    private RpsRound createNewRound() {
        roundCounter ++;
        return new RpsRound(roundCounter);
    }

    private void replayGame() {
        RpsMenu.printGameResult(playerWins, computerWins);
        playerWins = 0;
        computerWins = 0;
        roundCounter = 0;
    }

    private void endGame() {
        end = true;
        RpsMenu.printGameResult(playerWins, computerWins);
        RpsMenu.printFarewellMessage(rpsGameDefinition.getName());
    }

    public void play() {
        RpsMenu.printGameInstructions();

        while (!end) {
            resolveRound(createNewRound().playRound());

            int rounds = rpsGameDefinition.getRounds();
            if (rounds == playerWins || rounds == computerWins) {
                endGame();
            }
        }
    }
}
