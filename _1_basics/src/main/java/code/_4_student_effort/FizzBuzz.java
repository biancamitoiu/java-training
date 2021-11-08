package code._4_student_effort;

public class FizzBuzz {
    public static void fizzBuzz() {
        String rez = "";
        for(int x = 1; x <= 100; x++){
            if(x % 3 == 0 && x % 5 == 0){
                rez += "FizzBuzz, ";
            }
            else if(x == 100){
                rez += "Buzz.";
            }
            else if(x % 3 == 0){
                rez += "Fizz, ";
            }
            else if(x % 5 == 0){
                rez += "Buzz, ";
            }
            else if(x % 7 == 0){
                rez += "Rizz, ";
            }
            else if(x % 11 == 0){
                rez += "Jazz, ";
            }
            else{
                rez += x + ", ";
            }
        }
        System.out.println(rez);
    }
}
