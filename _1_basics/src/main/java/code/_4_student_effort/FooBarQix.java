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
        String res = "";
        boolean verif = false;

        if (num % 3 == 0) res += "Foo";
        if (num % 5 == 0) res += "Bar";
        if (num % 7 == 0) res += "Qix";

        char[] digits = String.valueOf(num).toCharArray();
        for(char digit : digits) {
            if (digit == '3') {
                res += "Foo";
                verif = true;
            }
            else if (digit == '5') {
                res += "Bar";
                verif = true;
            }
            else if (digit == '7'){
                res += "Qix";
                verif = true;
            }
            else if (digit == '0'){
                res += "*";
                verif = true;
            }
            if (res.isEmpty() && verif == false) {
                res += digit;
            }

        }
        if (res.isEmpty()) {
            res = String.valueOf(num);
        }
        return res;
    }
}
