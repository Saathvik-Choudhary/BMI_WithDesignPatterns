package org.example.bmi_withdesignpatterns;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

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


    public final void update(float bmi) {
        if(bmi==0)
            Output.setText("Invalid Input");

        Output.setText(Float.toString(bmi));
    }



    @FXML
    public final void onCalculateButtonClick() {
        try {
            Person bmiObject = new Person(Float.parseFloat(getValue(heightInput)), Float.parseFloat(getValue(weightInput)), heightUnits.getValue(), weightUnits.getValue());
            BmiCalculator calculatorObject=new BmiCalculator();
            float bmi = calculatorObject.bmiCalculation(bmiObject);
            update(bmi);
        }
        catch (Exception e) {
            update(0);
        }
    }



    @Override
    public final String getValue(TextField a) {
        String value= a.getText();

        return(value);
    }


}