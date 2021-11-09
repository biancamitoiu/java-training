package code._4_student_effort;

import java.util.ArrayList;

public class PairOf3 {
    //Passing parameters - [type] [paramName]
    public static int pairOf3(ArrayList<Integer> vector) {
        int perechi = 0;
        int[] verificare = new int[vector.size()];
        for (int i = 0; i < vector.size() - 2; i++) {
            if (verificare[i] == 0){
                for (int j = i + 1; j < vector.size() - 1; j++) {
                    if (verificare[j] == 0) {
                        for (int k = j + 1; k < vector.size(); k++) {
                            if (verificare[k] == 0) {
                                if (vector.get(i) + vector.get(j) + vector.get(k) == 0) {
                                    perechi += 1;
                                    verificare[i] = 1;
                                    verificare[j] = 1;
                                    verificare[k] = 1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return perechi;
    }
}
