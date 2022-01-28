package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class ListAggregatorTest {

    List<Integer> list;

    @BeforeEach
    public void initEach(){
        list = Arrays.asList(1,2,4,2);
    }


    @Test
    public void sum() {
        ListAggregator aggregator = new ListAggregator();
        int sum = aggregator.sum(list);

        Assertions.assertEquals(9, sum);
    }

    @Test
    public void max() {
        ListAggregator aggregator = new ListAggregator();
        int max = aggregator.max(list);

        Assertions.assertEquals(4, max);
    }

    @Test
    public void min() {
        ListAggregator aggregator = new ListAggregator();
        int min = aggregator.min(list);

        Assertions.assertEquals(1, min);
    }

    @Test
    public void distinct() {

        /*
        class StubListDeduplicator implements GenericListDeduplicator{
            @Override
            public List<Integer> deduplicate(List<Integer> list, GenericListSorter ListSorter) {
                return Arrays.asList(1,2,4);
            }
        }
        */

        GenericListDeduplicator deduplicator=Mockito.mock(GenericListDeduplicator.class);
        Mockito.when(deduplicator.deduplicate(Mockito.anyList(), Mockito.any())).thenReturn(Arrays.asList(1, 2, 4));

        ListAggregator aggregator = new ListAggregator();
        int distinct = aggregator.distinct(list, deduplicator);

        Assertions.assertEquals(3, distinct);
    }
}

