package clean.code.design_patterns.requirements.factory.sports;

import clean.code.design_patterns.requirements.factory.Sports;

public class Swimming implements Sports {
    private final String name;

    public Swimming(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " likes to go to the pool to swim.");
    }
}
