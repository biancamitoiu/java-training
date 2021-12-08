package clean.code.design_patterns.requirements.factory;

import clean.code.design_patterns.requirements.factory.Factory;
import clean.code.design_patterns.requirements.factory.Sports;

public class Main {

    public static void main(String[] args) {
        Factory factoryObject = new Factory();

        Sports sport1 = factoryObject.getSport("football");
        Sports sport2 = factoryObject.getSport("volleyball");
        Sports sport3 = factoryObject.getSport("tennis");
        Sports sport4 = factoryObject.getSport("basketball");
        Sports sport5 = factoryObject.getSport("gym");
        Sports sport6 = factoryObject.getSport("swimming");

        sport1.play();
        sport2.play();
        sport3.play();
        sport4.play();
        sport5.play();
        sport6.play();
    }
}
