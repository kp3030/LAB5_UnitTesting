package com.example.unittetsing_lab5;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class CalculatorUtilTest {

     @Test

    public void Testingaddition ()
     {
         double a = 5.0;
         double b = 3.0;
         double expetedvalue = 8.0;


         double actualvalue = calcuator.add(a,b);
         assertEquals(expetedvalue, actualvalue, 0.005);
     }

    @Test
     public void Testginsub()
     {
         double a = 5.0;
         double b = 3.0;
         double expetedvalue = 1.0;


         double actualvalue = calcuator.sub(a,b);
         assertEquals(expetedvalue, actualvalue, 0.005);

     }



}
