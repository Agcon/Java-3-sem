package ru.agcon.new_labs.laba31.src.test;

import org.junit.jupiter.api.Test;
import ru.agcon.new_labs.laba31.src.main.BubbleSort;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void sort() {
        BubbleSort arraySort = new BubbleSort();

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arraySort.sort(new int[]{5,3,2,4,1}));

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arraySort.sort(new int[]{1,2,3,4,5}));

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arraySort.sort(new int[]{3,2,21,12,43}));

    }
}