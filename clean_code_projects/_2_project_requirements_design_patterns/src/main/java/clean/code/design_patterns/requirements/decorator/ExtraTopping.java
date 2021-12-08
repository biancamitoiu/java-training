package clean.code.design_patterns.requirements.decorator;

public class ExtraTopping extends Decorator {

    public ExtraTopping(Icecream specialIcecream) {
        super(specialIcecream);
    }

    public String makeIcecream() {
        return specialVanillaIcecream.makeIcecream() + addChocolate();
    }

    private String addChocolate() {
        return " + extra chocolate";
    }
}


