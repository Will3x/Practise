package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class MergeSort implements AbstractSort {

    @Override
    public Integer start(List<Integer> list) {
        if (list.size() < 2) {
            return null;
        }
        int mid = list.size() / 2;
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> r = new ArrayList<>();

        for (int i = 0; i < mid; i++) {
//            l[i] = list.get(i);
        }
        for (int i = mid; i < list.size(); i++) {
//            r[i - mid] = list.get(i);
        }
        return 1;
    }

    public static void mergeSort(int[] a, int n) {

    }

    public static void merge(List<Integer> a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
//                a[k++] = l[i++];
            }
            else {
//                a[k++] = r[j++];
            }
        }
        while (i < left) {
//            a[k++] = l[i++];
        }
        while (j < right) {
//            a[k++] = r[j++];
        }
    }

}
