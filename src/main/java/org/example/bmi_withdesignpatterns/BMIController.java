package org.example.bmi_withdesignpatterns;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class BMIController implements Controller {

    @FXML
    private TextField weightInput;

    @FXML
    private TextField heightInput;

    @FXML
    private ChoiceBox<String> weightUnits;

    @FXML
    private ChoiceBox<String> heightUnits;

    @FXML
    private TextField Output;


    // Tried to set default values using constructor but failed 😭
    /*
    public BMIController(){
        try {
            this.weightInput.setText("0");
            this.heightInput.setText("0");
            this.weightUnits.setValue("kg");
            this.heightUnits.setValue("cm");
            this.Output.setText("0");
        }
        catch (Exception e)
        {
            System.out.println("Error is being caused");
        }
    }
     */


    public final void update(BigDecimal bmi) {
        if(bmi.equals(0))
            Output.setText("Invalid Input");

        Output.setText(bmi.setScale(2, RoundingMode.HALF_UP).toString());
    }

    @FXML
    public void initialize()
    {
        HeightUnits[] values = HeightUnits.values();
        for (HeightUnits value : values) {
            String unit=Arrays.toString((new HeightUnits[]{value}));
            unit=unit.substring(1,unit.length()-1);
            heightUnits.getItems().add(unit);
        }

        WeightUnits[] values1 = WeightUnits.values();
        for (WeightUnits value : values1) {
            String unit=Arrays.toString((new WeightUnits[]{value}));
            unit=unit.substring(1,unit.length()-1);
            weightUnits.getItems().add(unit);
        }
    }

    @FXML
    public final void onCalculateButtonClick() {

        try {
            Person bmiObject = new Person(BigDecimal.valueOf(Float.parseFloat(getValue(heightInput))) , BigDecimal.valueOf(Float.parseFloat(getValue(weightInput))), heightUnits.getValue(), weightUnits.getValue());
            BmiCalculator calculatorObject=new BmiCalculator();
            BigDecimal bmi = calculatorObject.bmiCalculation(bmiObject);
            update(bmi);
        }
        catch (Exception e) {
            update(BigDecimal.valueOf(0));
        }
    }



    @Override
    public final String getValue(TextField a) {
        String value= a.getText();

        return(value);
    }


}