package org.example.bmi_withdesignpatterns;

public class BmiBuilder {

    private final float height;
    private final float weight;

    public BmiBuilder(final float height, final float weight, final String heightUnits, final String weightUnits)
    {
        this.height= convertHeightToCm(height,heightUnits);

        this.weight=convertWeightToKg(weight,weightUnits);
    }



    private final float convertWeightToKg(final float weight,final String weightUnits) {
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
        return (weight);
    }

    private final float convertHeightToCm(final float height, final String heightUnits) {
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
        return (height);
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getWeight() {
        return this.weight;
    }

}
