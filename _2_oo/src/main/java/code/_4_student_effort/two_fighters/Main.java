package code._4_student_effort.two_fighters;


import code._4_student_effort.two_fighters.BoxingMatch;
import code._4_student_effort.two_fighters.Fighter;

public class Main {

    //How to call class methods(non-static)?
    //objectName.methodName(parameters);
    public static void main(String[] args) {
        Fighter opponent1 = new Fighter("Gigel", 100, 10);
        Fighter opponent2 = new Fighter("Marcel", 100, 15);
        opponent1.attack(opponent2);
        System.out.println(opponent1.health);
        BoxingMatch boxingMatch = new BoxingMatch(opponent1, opponent2);
        String winner = boxingMatch.fight();
        System.out.println(winner);


    }
}
