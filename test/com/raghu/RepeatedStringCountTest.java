package com.raghu;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedStringCountTest {

    RepeatedStringCount repeatedStringCount = new RepeatedStringCount();

    @Test
    public void getRepeatedStringCountTest(){
        assertEquals(51574523448L, repeatedStringCount.repeatedString("kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm", 736778906400L));
    }

}