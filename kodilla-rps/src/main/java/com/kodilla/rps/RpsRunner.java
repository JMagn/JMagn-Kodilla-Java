package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {
        RpsMenu.printOpeningMenu();
        RpsGame game = new RpsGame(RpsMenu.getGameDefinition());
        game.play();
    }
}
