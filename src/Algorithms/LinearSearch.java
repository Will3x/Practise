package Algorithms;

import java.util.List;

public class LinearSearch implements AbstractSearch {
    @Override
    public Integer start(List<Integer> list, int target) {
        for (Integer i: list) {
            if (i == target){
                return i;
            }
        }
        return null;
    }
}
