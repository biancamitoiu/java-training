package clean.code.design_patterns.requirements.factory.sports;

import clean.code.design_patterns.requirements.factory.Sports;

public class Gym implements Sports {
    private final String name;

    public Gym(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " goes to the gym 3 times a week.");
    }
}
