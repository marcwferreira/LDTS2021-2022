package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListSorterTest {

    List<Integer> list;
    List<Integer> expected;

    @BeforeEach
    public void iniEach(){
        list = Arrays.asList(3, 2, 6, 1, 4, 5, 7);
        expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    }

    @Test
    public void sort() {
        ListSorter sorter = new ListSorter();
        List<Integer> sorted = sorter.sort(list);

        Assertions.assertEquals(expected, sorted);
    }
}
