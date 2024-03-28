package org.example.bmi_withdesignpatterns;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public interface Controller {

    @FXML
    String getValue(TextField a);
}
