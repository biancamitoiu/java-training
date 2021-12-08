package clean.code.design_patterns.requirements.factory.sports;

import clean.code.design_patterns.requirements.factory.Sports;

public class Tennis implements Sports {
    private final String namePlayer1;
    private final String namePlayer2;
    private final String country;

    public Tennis(String namePlayer1, String namePlayer2, String country) {
        this.namePlayer1 = namePlayer1;
        this.namePlayer2 = namePlayer2;
        this.country = country;
    }

    @Override
    public void play() {
        System.out.println(namePlayer1 + " plays tennis with " + namePlayer2 + " in " + country + ".");
    }
}
