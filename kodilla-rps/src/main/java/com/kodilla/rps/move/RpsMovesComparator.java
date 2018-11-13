package com.kodilla.rps.move;

import com.kodilla.rps.round.RpsRoundResult;

public class RpsMovesComparator {

    public static RpsRoundResult compare(RpsMove playerMove, RpsMove computerMove) {
        switch (playerMove) {
            case ROCK:
                switch (computerMove) {
                    case ROCK:
                        return RpsRoundResult.DRAW;
                    case SCISSORS:
                        return RpsRoundResult.WIN;
                    case PAPER:
                        return RpsRoundResult.LOSS;
                }
            case PAPER:
                switch (computerMove) {
                    case ROCK:
                        return RpsRoundResult.WIN;
                    case SCISSORS:
                        return RpsRoundResult.LOSS;
                    case PAPER:
                        return RpsRoundResult.DRAW;
                }
            case SCISSORS:
                switch (computerMove) {
                    case ROCK:
                        return RpsRoundResult.LOSS;
                    case SCISSORS:
                        return RpsRoundResult.DRAW;
                    case PAPER:
                        return RpsRoundResult.WIN;
                }
            case END:
                return RpsRoundResult.END;
            case REPLAY:
                return RpsRoundResult.REPLAY;
        }
        return RpsRoundResult.BAD;
    }
}
