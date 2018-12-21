package com.kodilla.steps.knight;

class Knight {

    private Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }

    public void process() {

        System.out.println("Beginning journey...");

        this.quest.process();

        System.out.println(this.quest.getName() + " finished!");
    }
}
