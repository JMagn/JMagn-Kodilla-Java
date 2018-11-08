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
        RpsMove playerMove = RpsMove.getPlayerMove(scanner.next());
        RpsMove computerMove = RpsMove.getComputerMove();
        RpsRoundResult roundResult = RpsMovesComparator.compare(playerMove, computerMove);
        RpsMenu.printRoundResult(playerMove, computerMove, roundResult);
        return roundResult;
    }
}
