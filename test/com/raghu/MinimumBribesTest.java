package com.raghu;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumBribesTest {

    MinimumBribes minimumBribes = new MinimumBribes();

    @Test
    public void minimumBribesTest(){
        assertEquals("3", minimumBribes.getMinimumBribes(new int[]{2,1,5,3,4}));
        assertEquals("7", minimumBribes.getMinimumBribes(new int[]{1,2,5,3,7,8,6,4}));
        assertEquals("Too chaotic", minimumBribes.getMinimumBribes(new int[]{2,5,1,3,4}));
        assertEquals("0", minimumBribes.getMinimumBribes(new int[]{1,2,3,4,5}));
    }

}