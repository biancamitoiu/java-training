package clean.code.design_patterns.requirements.decorator;

public abstract class Decorator implements Icecream{

    protected Icecream specialVanillaIcecream;

    public Decorator(Icecream specialVanillaIcecream) {
        this.specialVanillaIcecream = specialVanillaIcecream;
    }

    public String makeIcecream() {
        return specialVanillaIcecream.makeIcecream();
    }
}
