package code._4_student_effort.two_fighters;

//encapsulation - abstraction of a real-time object
public class Fighter {
    //class attributes
    public String name;
    public int health;
    public int damagePerAttack;

    //ConstructorName == ClassName
    //class constructor(also a method)
    //What does it do? -> instantiate an object
    //instantiate <-> initialize
    //How to instantiate an "Object"?
    //Classname objectName = new Classname(constructor parameters)
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    //class method
    public void attack(Fighter opponent) {
        opponent.health = opponent.health - this.damagePerAttack;
    }
}


