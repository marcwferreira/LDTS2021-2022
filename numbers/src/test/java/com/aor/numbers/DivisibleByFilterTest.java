package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class DivisibleByFilterTest {

    @Test
    public void DivisibleByTest3() {
        Integer testNumber = 3;
        DivisibleByFilter divisible = new DivisibleByFilter(2);
        boolean result = divisible.accept(testNumber);

        Assertions.assertEquals(false, result);
    }


}
