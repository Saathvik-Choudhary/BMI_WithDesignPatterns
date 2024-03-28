package org.example.bmi_withdesignpatterns;
import java.text.DecimalFormat;

public class BmiCalculator {

    public static float bmiCalculation(BmiBuilder obj)
    {
        return((10000* obj.getWeight())/(obj.getHeight()*obj.getHeight()));
    }

}
