package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import sample.database.DbHandler;

import java.net.URL;
import java.util.ResourceBundle;

public class signUpController {

    public Button LogInButton;
    @FXML
    private PasswordField passwordText;

    @FXML
    private TextField emailText;

    @FXML
    private Button back;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField name;

    @FXML
    private TextField surname;

    @FXML
    private CheckBox maleCheck;

    @FXML
    private CheckBox femaleCheck;

    @FXML
    private void handleMale() {
        if (maleCheck.isSelected()) {
            femaleCheck.setSelected(false);
        }
    }

    @FXML
    private void handleFemale() {
        if (femaleCheck.isSelected()) {
            maleCheck.setSelected(false);
        }
    }

//    public void checkHandler() {
//        if (femaleCheck.isSelected()) {
//            maleCheck.setSelected(false);
//        } else if (maleCheck.isSelected()) {
//            femaleCheck.setSelected(false);
//        }
//    }


    private String gender() {
        String answer = "empty";
        if (femaleCheck.isSelected()) {
            maleCheck.setSelected(false);
            answer = "female";
        } else if (maleCheck.isSelected()) {
            femaleCheck.setSelected(false);
            answer = "male";
        }
        return answer;

    }


    @FXML
    public void initialize() {

        if (maleCheck.isSelected()) {
            femaleCheck.setSelected(false);
        } else if (femaleCheck.isSelected()) {
            maleCheck.setSelected(false);
        }


        DbHandler dbHandler = new DbHandler();
        signUpButton.setOnAction(event -> {
            dbHandler.signUpUser(name.getText(), surname.getText(),
                    emailText.getText(), passwordText.getText(),
                    gender().toString());
//                    "Female");
        });

    }
}