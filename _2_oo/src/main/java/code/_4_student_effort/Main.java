package code._4_student_effort;


public class Main {

    public static void main(String[] args) {
        Fighter opponent1 = new Fighter("Gigel", 100, 10);
        Fighter opponent2 = new Fighter("Marcel", 100, 15);
        opponent1.attack(opponent2);
        System.out.println(opponent2.health);
        BoxingMatch boxingMatch = new BoxingMatch(fighter1, fighter2);
        String winner = boxingMatch.fight();


    }
}
