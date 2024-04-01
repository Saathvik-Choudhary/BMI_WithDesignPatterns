package org.example.bmi_withdesignpatterns;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BmiCalculator {

    public BigDecimal bmiCalculation(Person obj) {
        return ((BigDecimal.valueOf(10000).multiply(obj.getWeight())).divide (obj.getHeight().multiply(obj.getHeight()),2, RoundingMode.HALF_UP));
    }

}
