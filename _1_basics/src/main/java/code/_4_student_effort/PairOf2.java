package code._4_student_effort;

import java.util.ArrayList;

public class PairOf2 {
    //arrays - {type}[] nameArray
    //arrays initializing - nameArray = new {type}[arrayLength];
    //ArrayList declare - ArrayList<ObjectType> listName

    /*
        How to iterate through an ArrayList
        for(int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
        for(int elem : array) {
            System.out.println(elem);
        }
     */
    public static int pairOf2(ArrayList<Integer> array) {
        int pairs = 0;
        int[] checked = new int[array.size()];

        for (int i = 0; i < array.size() - 1; i++) {
            if(checked[i] == 0) {
                for (int j = i + 1; j < array.size(); j++) {
                    if(checked[j] == 0) {
                        if (array.get(i) == (-1) * array.get(j)) {
                            pairs += 1;
                            checked[i] = 1;
                            checked[j] = 1;
                            break;
                        }
                    }
                }
            }
        }
        return pairs;

    }
}
