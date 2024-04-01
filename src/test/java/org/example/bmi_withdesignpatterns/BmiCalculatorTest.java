package org.example.bmi_withdesignpatterns;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

public class BmiCalculatorTest {

    @Test
    public void bmiTest() {
        Person object1 = new Person(BigDecimal.valueOf(65),BigDecimal.valueOf(70),"in","kg");
        Person object2 = new Person(BigDecimal.valueOf(65),BigDecimal.valueOf(70000),"in","g");
        Person object3 = new Person(BigDecimal.valueOf(200),BigDecimal.valueOf(80000),"cm","g");
        Person object4 = new Person(BigDecimal.valueOf(200),BigDecimal.valueOf(80),"cm","kg");

        BmiCalculator ob=new BmiCalculator();

        assertEquals(BigDecimal.valueOf(25.68), ob.bmiCalculation(object1));
        //assertTrue(BigDecimal.valueOf(25.680526733398438).equals( ob.bmiCalculation(object2)));
        //assertTrue(BigDecimal.valueOf(20.00).equals( ob.bmiCalculation(object3)));
        //assertTrue(BigDecimal.valueOf(20.00).equals( ob.bmiCalculation(object4)));

    }
}