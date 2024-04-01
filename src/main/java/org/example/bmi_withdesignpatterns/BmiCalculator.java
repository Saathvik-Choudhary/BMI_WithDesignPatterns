package org.example.bmi_withdesignpatterns;

public class BmiCalculator {

    public float bmiCalculation(Person obj) {
        return((10000* obj.getWeight())/(obj.getHeight()*obj.getHeight()));
    }

}
