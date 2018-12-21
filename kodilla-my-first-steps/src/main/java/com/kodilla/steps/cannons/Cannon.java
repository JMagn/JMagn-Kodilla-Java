package com.kodilla.steps.cannons;

class Cannon {

    public boolean loaded;

    public Cannon (boolean loaded) {
        this.loaded = loaded;
    }

    public void fire() {
        if (!loaded) {
            System.out.println("Cannon uncharged.\nLoading...");
            this.loaded = true;
            System.out.println("BANG!\n");
        } else {
            System.out.println("BANG!\n");
        }
    }
}
