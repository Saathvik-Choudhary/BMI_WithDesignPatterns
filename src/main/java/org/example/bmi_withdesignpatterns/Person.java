package org.example.bmi_withdesignpatterns;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Person {

    private final BigDecimal height;
    private final BigDecimal weight;

    public Person(final BigDecimal height, final BigDecimal weight, final String heightUnits, final String weightUnits) {
        this.height= convertHeightToCm(height,heightUnits);

        this.weight=convertWeightToKg(weight,weightUnits);
    }



    private final BigDecimal convertWeightToKg(final BigDecimal weight,final String weightUnits) {
        Map<String,BigDecimal> map=new HashMap<>();
        map.put("g",BigDecimal.valueOf(0.001));
        map.put("kg",BigDecimal.valueOf(1));
        /*
        switch (weightUnits)
        {
            case "g":
            {
                return(weight/1000);
            }
            case "kg":
            {
                //return(weight);
            }
        }
         */
        return (weight.multiply( map.get(weightUnits)));
    }

    private final BigDecimal convertHeightToCm(final BigDecimal height, final String heightUnits) {

        Map<String,BigDecimal> map=new HashMap<>();
        map.put("in",BigDecimal.valueOf(2.54));
        map.put("cm",BigDecimal.valueOf(1));
        /*
        switch (heightUnits)
        {
            case "in":
            {
                return(height*2.54f);
            }
            case "cm":
            {
                //return(height);
            }
        }
         */

        return (height.multiply(map.get(heightUnits)));
    }

    public final BigDecimal getHeight() {
        return this.height;
    }

    public final BigDecimal getWeight() {
        return this.weight;
    }

}
