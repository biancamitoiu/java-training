package code._4_student_effort.animal_hierarchy;

public class Main {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Pufosica");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        c.eat();
    }
}
