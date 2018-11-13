package com.kodilla.rps.round;

import com.kodilla.rps.RpsMenu;
import com.kodilla.rps.move.RpsMove;
import com.kodilla.rps.move.RpsMovesComparator;
import java.util.Scanner;

public class RpsRound {

    private int roundNumber;

    public RpsRound(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public RpsRoundResult playRound() {
        RpsMenu.printRoundInstructions(roundNumber);
        RpsMove playerMove = resolvePlayerMove();
        RpsMove computerMove = RpsMove.getComputerMove();
        RpsRoundResult roundResult = RpsMovesComparator.compare(playerMove, computerMove);
        RpsMenu.printRoundResult(playerMove, computerMove, roundResult);
        return roundResult;
    }

    private RpsMove resolvePlayerMove() {
        RpsMove playerMove = RpsMenu.getPlayerMove();
        if (playerMove.equals(RpsMove.REPLAY) || playerMove.equals(RpsMove.END)) {
            playerMove = RpsMenu.confirmExit(playerMove);
        }
        return playerMove;
    }
}
