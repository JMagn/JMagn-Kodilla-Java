package com.kodilla.rps;

import com.kodilla.rps.move.RpsMove;
import com.kodilla.rps.round.RpsRound;
import com.kodilla.rps.round.RpsRoundResult;

import java.util.Scanner;

public class RpsMenu {

    private static final String ROUND_INSTRUCTIONS = "\nRound %d begins. Please choose your move:";
    private static final String ROUND_RESULT = "Your move: %s\nComputer move: %s\nRound result: %s";

    public static void printOpeningMenu() {
        System.out.println("Welcome in Rock-Paper-Scissors game.\nPlease insert your name and number of wins that will end the game:");
    }

    public static RpsGameDefinition getGameDefinition() {
        Scanner sc = new Scanner(System.in);
        return new RpsGameDefinition(sc.next(), sc.nextInt());
    }

    public static void printGameInstructions() {
        System.out.println("Keys instruction:\n1 - ROCK\n2 - PAPER\n3 - SCISSORS\nx - end current game\nn - play new game");
    }

    public static void printRoundInstructions() {
        System.out.println(String.format(ROUND_INSTRUCTIONS, RpsRound.getRoundNumber()));
    }

    public static void printRoundResult(RpsMove userMove, RpsMove computerMove, RpsRoundResult roundResult) {
        System.out.println(String.format(ROUND_RESULT, userMove, computerMove, roundResult));
    }
}
