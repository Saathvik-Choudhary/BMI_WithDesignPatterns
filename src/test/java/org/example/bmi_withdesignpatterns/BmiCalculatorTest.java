package org.example.bmi_withdesignpatterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BmiCalculatorTest {

    @Test
    public void bmiTest() {
        BmiBuilder object1 = new BmiBuilder(65,70,"in","kg");
        BmiBuilder object2 = new BmiBuilder(65,70000,"in","g");
        BmiBuilder object3 = new BmiBuilder(200,80000,"cm","g");
        BmiBuilder object4 = new BmiBuilder(200,80,"cm","kg");

        assertEquals(25.680526733398438,BmiCalculator.bmiCalculation(object1));
        assertEquals(25.680526733398438,BmiCalculator.bmiCalculation(object2));
        assertEquals(20.00,BmiCalculator.bmiCalculation(object3));
        assertEquals(20.00,BmiCalculator.bmiCalculation(object4));

    }
}