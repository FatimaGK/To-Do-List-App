package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.Main;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

public class firstPageController {
    @FXML
    private TextField passwordText;

    @FXML
    private TextField emailText;

    @FXML
    private Button signUpButton2;

    @FXML
    private Button logInButton;

    private void loginUser(String email, String password) {
        //Check in DB if th euser exists, if true
        // we add them to LoggedInSecreeen
    }

    public void openSignUp() {
        Stage primaryStage = new Stage();
        try {
            AnchorPane root = (AnchorPane) FXMLLoader.load(firstPageController.class.getResource("sample/view/SignUp.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Bluerift Timeline");
            primaryStage.show();
        } catch (Exception ex) {
            Logger.getLogger("dafak??????????"+firstPageController.class.getName()).log(Level.SEVERE, "dafak?", ex);
        }
        //take user to sign up screen
////            //-----------------------------
//            signUpButton2.getScene().getWindow().hide(); //populate sign up screen
//            FXMLLoader loader = new FXMLLoader();
//            loader.setLocation(getClass().getResource("/sample/view/SignUp.fxml"));
//            try {
//                loader.load();
//            } catch (IOException e) {
//                System.out.println(e+"dafak?");
//            }
//
//
//
//            Parent root1 = loader.getRoot();
//            Stage stage = new Stage();
//            stage.setTitle("SignUp Window");
//            stage.setScene(new Scene(root1, 600, 400));
//            stage.showAndWait();

    }

    public void openLogIn() {

        AtomicBoolean logIn = new AtomicBoolean(false);
        boolean error = false;
        logInButton.setOnAction(event -> {        //logs in by user's email&password
            if (!emailText.getText().equals("") && !passwordText.getText().equals("")) {  //making sure user both interface is not empty
                System.out.println("all fine");
                loginUser(emailText.getText(), passwordText.getText());
                logIn.set(true);
            } else {
                System.out.println("error login in user");
            }
        });
    }

}


//    @FXML
//    void initialize() {
//SIGN UP BUTTON
//        signUpButton2.setOnAction(event -> {
//            //take user to sign up screen
//            //-----------------------------
//            signUpButton2.getScene().getWindow().hide(); //populate sign up screen
//            FXMLLoader loader = new FXMLLoader();
//            loader.setLocation(getClass().getResource("/sample/view/SignUp.fxml"));
//            try {
//                loader.load();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            Parent root = loader.getRoot();
//            Stage stage = new Stage();
//            stage.setScene(new Scene(root));
//
//            stage.showAndWait();
//        });


//LOG IN BUTTON
//        AtomicBoolean logIn = new AtomicBoolean(false);
//        boolean error = false;
//        logInButton.setOnAction(event -> {        //logs in by user's email&password
//            if (!emailText.getText().equals("") && !passwordText.getText().equals("")) {  //making sure user both interface is not empty
//                System.out.println("all fine");
//                loginUser(emailText.getText(), passwordText.getText());
//                logIn.set(true);
//            } else {
//                System.out.println("error login in user");
//            }
//        });
//    }


