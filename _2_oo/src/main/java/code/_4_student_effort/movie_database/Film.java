package code._4_student_effort.movie_database;

public class Film {
    public Integer anAparitie;
    public String nume;
    public Actor[] actori;

    public Film(Integer anAparitie, String nume, Actor[] actori){
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }
}
