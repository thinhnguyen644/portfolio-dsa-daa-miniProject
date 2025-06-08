package org.example.mergesort;

import org.example.mergesort.algorithm.MergeSort;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class MergeSortApplication {

    public static void main(String[] args) {

//        SpringApplication.run(MergeSortApplication.class, args);

        ArrayList<Integer> arr_lst = new ArrayList<>();
        arr_lst.add(6);
        arr_lst.add(3);
        arr_lst.add(1);
        arr_lst.add(4);
        arr_lst.add(5);
        arr_lst.add(8);
        arr_lst.add(9);
        arr_lst.add(7);
        arr_lst.add(10);
        arr_lst.add(2);

        MergeSort ms = new MergeSort();
        ArrayList<Integer> arrayList = ms.sort(arr_lst);
        arrayList.forEach(item -> System.out.print(item + "-->"));
    }

}
