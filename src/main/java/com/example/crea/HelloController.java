package com.example.crea;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;


public class HelloController {


    public TextField usweight;
    public TextField emailacc;
    public TextField uname;
    public TextField usernamea;
    public TextField usage;
    public TextField usheight;
    public PasswordField password;
    public TextField gender;
    public Button signup;

    public void signupButton(ActionEvent actionEvent) {
        String name = uname.getText();
       if(uname.getText().isEmpty()){
           Alert alert =new Alert(Alert.AlertType.ERROR);
           alert.setContentText("Please enter your name");
           alert.showAndWait();
       }
       String email = emailacc.getText();
        if(emailacc.getText().isEmpty()){
            Alert alert =new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter your Email Address!!");
            alert.showAndWait();
        }

        String username= usernamea.getText();
        if(usernamea.getText().isEmpty()){
            Alert alert =new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter your username!!");
            alert.showAndWait();
        }
        String pass = password.getText();
        if(password.getText().isEmpty()){
            Alert alert =new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter your password!!");
            alert.showAndWait();
        }
        String age= usage.getText();
        if(usage.getText().isEmpty()){
            Alert alert =new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter your age!!");
            alert.showAndWait();
        }
        String gen = gender.getText();
        if(gender.getText().isEmpty()){
            Alert alert =new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter your gender!!");
            alert.show();
        }
        String  hei = usheight.getText();
        if(usheight.getText().isEmpty()){
            Alert alert =new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter your height!!");
            alert.showAndWait();
        }
        String weigh = usweight.getText();
        if(usweight.getText().isEmpty()){
            Alert alert =new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter your weight!!");
            alert.showAndWait();
        }
        }
}

