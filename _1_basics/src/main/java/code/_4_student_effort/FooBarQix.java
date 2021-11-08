package code._4_student_effort;

public class FooBarQix {
    public static String compute(int numar) {
        String rez = "";
        int cifra;
        int numar2 = numar;

        if (numar2 % 3 == 0)
            rez += "Foo";
        if (numar2 % 5 == 0)
            rez += "Bar";
        if (numar2 % 7 == 0)
            rez += "Qix";

        while (numar > 0) {

            cifra = numar % 10;
            numar = numar / 10;

            if (cifra == 3)
                rez += "Foo";
            else if (cifra == 5)
                rez += "Bar";
            else if (cifra == 7)
                rez += "Qix";

        }
        if (rez.isEmpty()) {
            rez = String.valueOf(numar2);
        }
        return rez;
    }
    public static String compute2(int num){
        String rez = "";
        boolean verif = false;

        if (num % 3 == 0) rez += "Foo";
        if (num % 5 == 0) rez += "Bar";
        if (num % 7 == 0) rez += "Qix";

        char[] cifre = String.valueOf(num).toCharArray();
        for(char cifra : cifre) {
            if (cifra == '3')
                rez += "Foo";
            else if (cifra == '5')
                rez += "Bar";

            else if (cifra == '7'){
                rez += "Qix";
                verif = true;
            }
            else if (cifra == '0'){
                rez += "*";
                verif = true;
            }
            if (rez.isEmpty() && verif == false) {
                rez += cifra;
            }

        }
        if (rez.isEmpty()) {
            rez = String.valueOf(num);
        }
        return rez;
    }
}
