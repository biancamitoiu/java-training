package clean.code.design_patterns.requirements.factory;

import clean.code.design_patterns.requirements.factory.sports.*;

public class Factory {
    public Sports getSport(String sportName) {
        switch (sportName) {
            case "football":
                return new Football("Andrei", "blue");
            case "volleyball":
                return new Volleyball(12);
            case "tennis":
                return new Tennis("Mihai", "Marcel", "Romania");
            case "basketball":
                return new Basketball(2);
            case "gym":
                return new Gym("John");
            case "swimming":
                return new Swimming("Ben");
        }

        return null;
    }
}
