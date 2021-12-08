package clean.code.design_patterns.requirements.decorator;



public class Main {
    public static void main(String[] args) {
        VanillaIceCream vanillaIcecreamObj = new VanillaIceCream();
        String vanillaIcecream = vanillaIcecreamObj.makeIcecream();
        System.out.println(vanillaIcecream);


        String vanillaIcecreamWithNuts=new NutsTopping(vanillaIcecreamObj).makeIcecream();
        System.out.println(vanillaIcecreamWithNuts);


        String vanillaIcecreamWithChocolate=new ExtraTopping(vanillaIcecreamObj).makeIcecream();
        System.out.println(vanillaIcecreamWithChocolate);


        String vanillaIcecreamWithChocolateAndNuts=new NutsTopping(new ExtraTopping(vanillaIcecreamObj)).makeIcecream();
        System.out.println(vanillaIcecreamWithChocolateAndNuts);

    }
}
