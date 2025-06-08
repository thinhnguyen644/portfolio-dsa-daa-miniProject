package org.example.mergesort.algorithm;

import java.util.ArrayList;

public class MergeSort {
    public ArrayList<Integer> sort(ArrayList<Integer> list) {
        if(list.size() <= 1) return list;
        int mid = list.size() / 2;
        ArrayList<Integer> listA = new ArrayList<>(list.subList(0, mid));
        ArrayList<Integer> listB = new ArrayList<>(list.subList(mid, list.size()));

        return merge(sort(listA), sort(listB));
    }

    public ArrayList<Integer> merge(ArrayList<Integer> listA, ArrayList<Integer> listB) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> mergedList = new ArrayList<>();
        while(i < listA.size() && j < listB.size()) {
            if(listA.get(i) < listB.get(j)) {
                mergedList.add(listA.get(i));
                i++;
            }else{
                mergedList.add(listB.get(j));
                j++;
            }
        }

        while(j < listB.size()) {
            mergedList.add(listB.get(j));
            j++;
        }
        while(i < listA.size()) {
            mergedList.add(listA.get(i));
            i++;
        }

        return mergedList;

    }
}
