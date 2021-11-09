package code._4_student_effort;

import java.util.*;

public class Main {

    //Accessing static attributes: className.attributeName;
    //Calling static methods: className.methodName(parameters);
    //Methods: [accessing modifier]{static} [return type] [functionName](parameters)
    public static void main(String[] args) {
        FizzBuzz.fizzBuzz();
        Scanner numar= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = numar.nextInt();
        System.out.println(FooBarQix.compute(num));
        System.out.println(FooBarQix.compute2(num));
        ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(
                3, -2, -2, 3, -2, -1, 0, -1
        ));

        System.out.println(PairOf2.pairOf2(array));
        System.out.println(PairOf3.pairOf3(array));
    }


}
