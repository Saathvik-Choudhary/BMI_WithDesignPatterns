package org.example.bmi_withdesignpatterns;

import java.util.HashMap;
import java.util.Map;

public class Person {

    private final float height;
    private final float weight;

    public Person(final float height, final float weight, final String heightUnits, final String weightUnits) {
        this.height= convertHeightToCm(height,heightUnits);

        this.weight=convertWeightToKg(weight,weightUnits);
    }



    private final float convertWeightToKg(final float weight,final String weightUnits) {
        Map<String,Float> map=new HashMap<>();
        map.put("g",0.001f);
        map.put("kg",1.0f);
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
        return (weight*map.get(weightUnits));
    }

    private final float convertHeightToCm(final float height, final String heightUnits) {

        Map<String,Float> map=new HashMap<>();
        map.put("in",2.54f);
        map.put("cm",1.0f);
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

        return (height*map.get(heightUnits));
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getWeight() {
        return this.weight;
    }

}
