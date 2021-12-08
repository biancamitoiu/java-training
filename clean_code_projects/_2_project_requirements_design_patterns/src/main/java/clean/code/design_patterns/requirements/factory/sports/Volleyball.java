package clean.code.design_patterns.requirements.factory.sports;

import clean.code.design_patterns.requirements.factory.Sports;

public class Volleyball implements Sports {

    private final int numberOfPlayers;

    public Volleyball(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    @Override
    public void play() {
        System.out.println(numberOfPlayers + " players play volleyball.");
    }
}
