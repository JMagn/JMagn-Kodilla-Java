package com.kodilla.rps.round;

import com.kodilla.rps.RpsMenu;
import com.kodilla.rps.move.RpsMove;
import com.kodilla.rps.move.RpsMovesComparator;
import java.util.Scanner;

public class RpsRound {

    private static final Scanner scanner = new Scanner(System.in);
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
        RpsMove playerMove = getPlayerMove();
        if (playerMove.equals(RpsMove.REPLAY) || playerMove.equals(RpsMove.END)) {
            playerMove = confirmExit(playerMove);
        }
        return playerMove;
    }

    private RpsMove confirmExit(RpsMove playerMove) {
        RpsMenu.printConfirmationRequest();
        RpsMove confirmedMove = playerMove;
        boolean rightKey = false;
        while (!rightKey) {
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("y")) {
                rightKey = true;
            } else if (answer.equalsIgnoreCase("n")) {
                RpsMenu.printNewMoveRequest();
                confirmedMove = getPlayerMove();
                rightKey = true;
            } else {
                RpsMenu.printWrongKeyInfo();
            }
        }
        return confirmedMove;
    }

    private RpsMove getPlayerMove() {
        boolean rightMove = false;
        RpsMove playerMove = RpsMove.BAD;
        while (!rightMove) {
            playerMove = RpsMove.mapPlayerMove(scanner.next());
            if (!RpsMove.isRightMove(playerMove)) {
                RpsMenu.printWrongKeyInfo();
            } else {
                rightMove = true;
            }
        }
        return playerMove;
    }
}
