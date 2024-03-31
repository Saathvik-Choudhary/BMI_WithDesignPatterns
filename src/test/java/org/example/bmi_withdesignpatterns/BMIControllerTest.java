package org.example.bmi_withdesignpatterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMIControllerTest {

    @Test
    void update() {
        BMIController ob=new BMIController();

        ob.update(10.0f);


    }

    @Test
    void onCalculateButtonClick() {
    }

}