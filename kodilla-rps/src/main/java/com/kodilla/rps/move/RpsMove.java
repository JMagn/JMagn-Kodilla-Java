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
        return getMoveByNumber(random.nextInt(3) + 3);
    }

    public static RpsMove getMoveByNumber(int nr) {return RpsMove.values()[nr]; }
}
