package com.kodilla.rps.round;

import com.kodilla.rps.RpsMenu;
import com.kodilla.rps.move.RpsMove;
import com.kodilla.rps.move.RpsMovesComparator;
import java.util.Scanner;

public class RpsRound {

    private static final Scanner scanner = new Scanner(System.in);
    private static int roundNumber = 1;

    public static RpsRoundResult playRound() {
        RpsMenu.printRoundInstructions();
        RpsMove playerMove = RpsMove.getPlayerMove(scanner.next());
        RpsMove computerMove = RpsMove.getComputerMove();
        RpsRoundResult roundResult = RpsMovesComparator.compare(playerMove, computerMove );
        RpsMenu.printRoundResult(playerMove, computerMove, roundResult);
        RpsRound.roundNumber++;
        return roundResult;
    }

    public static int getRoundNumber() {
        return roundNumber;
    }
}
