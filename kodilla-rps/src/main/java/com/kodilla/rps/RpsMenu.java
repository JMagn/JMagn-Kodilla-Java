package com.kodilla.rps;

import com.kodilla.rps.move.RpsMove;
import com.kodilla.rps.round.RpsRound;
import com.kodilla.rps.round.RpsRoundResult;

import java.util.Scanner;

public class RpsMenu {

    private static final String ROUND_INSTRUCTIONS = "\nRound %d begins. Please choose your move:";
    private static final String ROUND_RESULT = "Your move: %s\nComputer move: %s\nRound result: %s";
    private static final String GAME_RESULT = "\nGAME FINISHED\nYour score: %d\nComputer score: %d";
    private static final String UNFINISHED_GAME = "\nYou chose to %s current game.";
    private static final String FAREWELL = "\nThank you for playing %s. See you next time!";

    private static void printOpeningMenu() {
        System.out.println("Welcome in Rock-Paper-Scissors game.\n\nPlease insert your name:");
    }

    private static void printWinsNumberRequest() {
        System.out.println("Please insert number of wins that will end the game:");
    }

    public static RpsGameDefinition getGameDefinition() {
        printOpeningMenu();
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printWinsNumberRequest();
        return new RpsGameDefinition(name, sc.nextInt());
    }

    public static void printGameInstructions() {
        System.out.println("\nNEW GAME BEGINS\nKeys instruction:\n1 - ROCK\n2 - PAPER\n3 - SCISSORS\nx - end current game\nn - play new game");
    }

    public static void printRoundInstructions(int roundNumber) {
        System.out.println(String.format(ROUND_INSTRUCTIONS, roundNumber));
    }

    public static void printRoundResult(RpsMove userMove, RpsMove computerMove, RpsRoundResult roundResult) {
        if (roundResult.equals(RpsRoundResult.REPLAY) || roundResult.equals(RpsRoundResult.END)) {
            System.out.println(String.format(UNFINISHED_GAME, roundResult));
        } else {
            System.out.println(String.format(ROUND_RESULT, userMove, computerMove, roundResult));
        }
    }

    public static void printWrongKeyInfo() {
        System.out.println("Wrong key! Please try again.");
    }

    public static void printGameResult(int playerWins, int computerWins) {
        System.out.println(String.format(GAME_RESULT, playerWins, computerWins));
    }

    public static void printFarewellMessage(String name) {
        System.out.println(String.format(FAREWELL, name));
    }
}
