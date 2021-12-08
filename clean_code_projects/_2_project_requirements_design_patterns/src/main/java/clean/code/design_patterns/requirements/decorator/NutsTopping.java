package clean.code.design_patterns.requirements.decorator;

public class NutsTopping extends Decorator {

    /*
        @Override
        public String description() {
            return "Chocolate ice cream";
        }*/
    public NutsTopping(Icecream specialVanillaIcecream) {
        super(specialVanillaIcecream);
    }

    public String makeIcecream() {
        return specialVanillaIcecream.makeIcecream() + addNuts();
    }

    private String addNuts() {
        return " + nuts topping";
    }
}
