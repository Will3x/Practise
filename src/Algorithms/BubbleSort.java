package Algorithms;

import java.util.List;

public class BubbleSort implements AbstractSort {

    @Override
    public Integer start(List<Integer> list) {
        if (list.size() == 1){
            return 1;
        } else if (list.size() < 1){
            return -1;
        }

        int temp;
        for (int i = 0; i < list.size()-1; i++){
            for (int j = 0; j < list.size()-i-1; j++) {
                if(list.get(j) > list.get(j+1)){
                    temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
        return 1;
    }
}
