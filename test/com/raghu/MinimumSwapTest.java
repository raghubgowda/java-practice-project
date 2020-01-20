package com.raghu;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumSwapTest {

    MinimumSwap minimumSwap = new MinimumSwap();

    @Test
    public void getMinimumSwapsTest(){
        //assertEquals(5, minimumSwap.getMinimumSwaps(new int[]{7,1,3,2,4,5,6}));
        assertEquals(3, minimumSwap.getMinimumSwaps(new int[]{4,3,1,2}));
        /*assertEquals(0, minimumSwap.getMinimumSwaps(new int[]{1,2,3,4}));
        assertEquals(3, minimumSwap.getMinimumSwaps(new int[]{2,3,4,1,5}));
        assertEquals(3, minimumSwap.getMinimumSwaps(new int[]{1,3,5,2,4,6,7}));*/
    }

}