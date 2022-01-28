package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PositiveFilterTest {


    public void positiveTest(Integer testNumber, boolean result) {
        PositiveFilter positive = new PositiveFilter();
        boolean positiveTest = positive.accept(testNumber);

        Assertions.assertEquals(result, positiveTest);
    }


    @Test
    public void testing(){
        List<Integer> testCases = Arrays.asList(-1, 0, 1);
        for(Integer i: testCases){
            boolean result= (i>=0);
            positiveTest(i,result);
        }
    }

}
