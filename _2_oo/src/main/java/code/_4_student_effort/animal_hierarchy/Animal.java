package code._4_student_effort.animal_hierarchy;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs){
        this.legs = legs;
    }

    abstract void eat();

    protected void walk(){
        System.out.println("Walk with " + legs + " legs.");
    }
}