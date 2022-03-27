package com.oliverr.algorithms.other;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LookAndSayTest {
    
    LookAndSay las;

    @Test
    void testLookAndSayTest() {
        las = new LookAndSay();
        Assertions.assertEquals("11", las.lookAndSay("1"));
        Assertions.assertEquals("21", las.lookAndSay("11"));
        Assertions.assertEquals("2112", las.lookAndSay("112"));
        Assertions.assertEquals("311311", las.lookAndSay("11131"));
        Assertions.assertEquals("4215", las.lookAndSay("22225"));
        Assertions.assertEquals("133115", las.lookAndSay("31115"));
    }

}
