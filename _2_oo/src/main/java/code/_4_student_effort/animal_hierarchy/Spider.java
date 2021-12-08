package code._4_student_effort.animal_hierarchy;

public class Spider extends Animal {

    //Polymorphism
    /*
        -> override(runtime polymorphism)
            - aceeasi structura a unei metode(denumire + lista de parametrii = signatura)
                dar implementari diferite intre clase inrudite
        -> overload(compile time polymorphism)
            - In aceeasi clasa sau in clase inrudite putem avea metode care au
              aceeasi denumire(forma) a unei metode dar cu lista de parametrii diferiti
     */
    //overloading
    //public int sum(int a, int b) {
    //    return a + b;
    //}
    //
    //public int sum(int a, int b, int c) {
    //    return a + b + c;
    //}
    protected Spider() {
        //super <-> call Animal() constructor
        super(8);
    }

    @Override
    void eat() {
        System.out.println("Spider eats");
    }
}
