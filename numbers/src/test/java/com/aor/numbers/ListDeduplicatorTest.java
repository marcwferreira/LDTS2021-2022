package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {

    List<Integer> list;
    List<Integer> expected;

    @BeforeEach
    public void initEach() {
        list = Arrays.asList(1,2,4,2);
        expected = Arrays.asList(1,2,4);
    }

    @Test
    public void deduplicate() {

        class StubListSorter implements GenericListSorter{

            @Override
            public List<Integer> sort(List<Integer> list) {
                return Arrays.asList(1,2,4);
            }
        }

        ListDeduplicator deduplicator = new ListDeduplicator();
        StubListSorter listSorter = new StubListSorter();
        List<Integer> distinct = deduplicator.deduplicate(list, listSorter);

        Assertions.assertEquals(expected, distinct);
    }
}
