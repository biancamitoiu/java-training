package code._4_student_effort.animal_hierarchy;

public class Fish extends Animal {

    protected Fish() {
        super(0);
    }

    @Override
    protected void walk() {
        System.out.println("Fish can't walk.");
    }

    @Override
    void eat() {
        System.out.println("Fish eats worms.");
    }

}
