package org.example.mergesort;

import org.example.mergesort.algorithm.MergeSort;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MergeSortApplicationTests {

//    @Test
//    void contextLoads() {
//    }

    @Test
    public void testSortedList() {
        MergeSort sorter = new MergeSort();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 3, 8, 1));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 5, 8));
        assertEquals(expected, sorter.sort(input));
    }

    @Test
    public void testEmptyList() {
        MergeSort sorter = new MergeSort();
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, sorter.sort(input));
    }

    @Test
    public void testSingleElementList() {
        MergeSort sorter = new MergeSort();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(10));
        assertEquals(expected, sorter.sort(input));
    }

    @Test
    public void testAlreadySorted() {
        MergeSort sorter = new MergeSort();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertEquals(expected, sorter.sort(input));
    }

    @Test
    public void testNegativeNumbers() {
        MergeSort sorter = new MergeSort();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-3, -1, -2, 0));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(-3, -2, -1, 0));
        assertEquals(expected, sorter.sort(input));
    }

}
