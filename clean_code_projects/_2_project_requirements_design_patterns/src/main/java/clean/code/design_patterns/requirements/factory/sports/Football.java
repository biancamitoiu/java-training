package clean.code.design_patterns.requirements.factory.sports;

import clean.code.design_patterns.requirements.factory.Sports;

public class Football implements Sports {
    private final String playerName;
    private final String ballColor;

    public Football(String playerName, String ballColor) {
        this.playerName = playerName;
        this.ballColor = ballColor;
    }

    @Override
    public void play() {

        System.out.println(playerName + " plays football with a " + ballColor + " ball.");
    }
}
