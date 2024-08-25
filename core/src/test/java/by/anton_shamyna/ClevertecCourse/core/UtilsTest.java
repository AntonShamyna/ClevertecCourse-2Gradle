package by.anton_shamyna.ClevertecCourse.core;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UtilsTest {
    @Test
    public void testIsPositiveNumber() {
        Utils numberUtils = new Utils();

        assertTrue(numberUtils.isAllPositiveNumber("10","20"));
        assertTrue(numberUtils.isAllPositiveNumber("10.234","20"));
        assertFalse(numberUtils.isAllPositiveNumber("","","20"));
        assertFalse(numberUtils.isAllPositiveNumber("","",""));
        assertFalse(numberUtils.isAllPositiveNumber(null,null));
        assertFalse(numberUtils.isAllPositiveNumber("","",null));
        assertFalse(numberUtils.isAllPositiveNumber("NotNumber","20"));
        assertFalse(numberUtils.isAllPositiveNumber("-10"));
        assertFalse(numberUtils.isAllPositiveNumber("-10.234"));
        assertFalse(numberUtils.isAllPositiveNumber("-10","20"));
    }
}