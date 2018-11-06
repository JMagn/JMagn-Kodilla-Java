package com.kodilla.rps.move;

import java.util.Arrays;
import java.util.Random;

public enum RpsMove {

    BAD(""), END("x"), REPLAY("n"), ROCK("1"), PAPER("2"), SCISSORS("3");

    private String move;
    private static final Random random = new Random();

    RpsMove(String move) {
        this.move = move;
    }

    public static RpsMove getPlayerMove(String move) {
        return Arrays.stream(values()).filter(x -> x.getMove().equalsIgnoreCase(move)).findFirst().orElse(BAD);
    }

    private String getMove() {
        return move;
    }

    public static RpsMove getComputerMove() {
        int n = random.nextInt(3);
        switch (n) {
            case 0:
                return RpsMove.ROCK;
            case 1:
                return RpsMove.PAPER;
            case 2:
                return RpsMove.SCISSORS;
        }
        return RpsMove.BAD;
    }
}
