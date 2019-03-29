package Algorithms;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    private static List<Integer> arrayList = new ArrayList<>();
    private static List<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) throws InterruptedException {

        AbstractSearch binarySearch = new BinarySearch();
        AbstractSearch linearSearch = new LinearSearch();

        AbstractSort bubbleSort = new BubbleSort();
        AbstractSort mergeSort = new MergeSort();

        fillLists();

//        long startTime = System.currentTimeMillis();
//        bubbleSort.start(arrayList);
//        long finishedTime = System.currentTimeMillis() - startTime;
//        System.out.println("Sorting done in: " + finishedTime + " ms.");
//
//        long startTime2 = System.currentTimeMillis();
//        bubbleSort.start(linkedList);
//        long finishedTime2 = System.currentTimeMillis() - startTime2;
//        System.out.println("Sorting done in: " + finishedTime2 + " ms.");

        mergeSort.start(arrayList);


    }

    private static void fillLists(){
        for (int i = 0; i < 10000000; i++){
            int rand = (int)(Math.random()*9999)+1;
            arrayList.add(rand);
            linkedList.add(rand);
        }
    }


}
