package com.example.unittetsing_lab5;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class MathUtilTest {
    @Test
    public void TestAbsofPositiveNumber()
    {
        double inputvalue = -6.0;
        double actulaabsulte = MathUtil.abs(inputvalue);
        double expectedvalue = inputvalue;
        assertEquals(expectedvalue, actulaabsulte, 0.0005);

    }

    @Test
    public void TestAbsofNegativeNumber()
    {
        double inputvalue = -8.0;
        double actulaabsulte = MathUtil.abs(inputvalue);
        double expectedvalue = inputvalue *-1;
        assertEquals(expectedvalue, actulaabsulte, 0.0005);
    }
}
