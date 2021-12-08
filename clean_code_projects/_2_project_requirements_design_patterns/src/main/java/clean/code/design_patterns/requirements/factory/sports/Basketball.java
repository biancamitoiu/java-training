package clean.code.design_patterns.requirements.factory.sports;

import clean.code.design_patterns.requirements.factory.Sports;

public class Basketball implements Sports {
    private final int numberOfTeams;

    public Basketball(int numberOfTeams) {
        this.numberOfTeams = numberOfTeams;
    }

    @Override
    public void play() {
        System.out.println(numberOfTeams + " teams are ready to play in the basketball competition.");
    }
}
