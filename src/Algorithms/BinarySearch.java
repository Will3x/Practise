package Algorithms;

import java.util.List;

public class BinarySearch implements AbstractSearch{

    @Override
    public Integer start(List<Integer> list, int target) {
        int middleValue;

        if (list.size() > 1) {
            middleValue = list.get(list.size()/2);

            if (target == middleValue){
                return middleValue;
            } else if (target > middleValue){
                return start(list.subList(list.size()/2, list.size()), target);
            } else {
                return start(list.subList(0, list.size()/2), target);
            }

        } if(list.get(0) == target){
            return target;
        }
        return -1;
    }
}
