package org.example.bmi_withdesignpatterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BmiCalculatorTest {

    @Test
    public void bmiTest() {
        Person object1 = new Person(65,70,"in","kg");
        Person object2 = new Person(65,70000,"in","g");
        Person object3 = new Person(200,80000,"cm","g");
        Person object4 = new Person(200,80,"cm","kg");

        assertEquals(25.680526733398438,BmiCalculator.bmiCalculation(object1));
        assertEquals(25.680526733398438,BmiCalculator.bmiCalculation(object2));
        assertEquals(20.00,BmiCalculator.bmiCalculation(object3));
        assertEquals(20.00,BmiCalculator.bmiCalculation(object4));

    }
}