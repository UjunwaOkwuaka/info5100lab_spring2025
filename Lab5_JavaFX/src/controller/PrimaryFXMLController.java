/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import model.User;

/**
 * FXML Controller class
 *
 * @author okwua
 */
public class PrimaryFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    TextField nameTextField;
    
    @FXML
    TextField ageTextField;
    
    @FXML
    TextField emailTextField;
    
    
    public void submit(){
        User userObject = new User();
        
        // Data members
        userObject.setName(nameTextField.getText());
        userObject.setAge(Integer.parseInt(ageTextField.getText()));
        userObject.setEmail(emailTextField.getText());
        
        Alert errorAlert = new Alert(AlertType.ERROR);
        errorAlert.setTitle("Failure");
        errorAlert.setHeaderText("Error input");
        
        //Validate Age
        if(userObject.getName().isBlank()) {
            errorAlert.setContentText("Please enter a valid name");
            errorAlert.showAndWait();
            return;
            }
        
        if(userObject.getAge()< 18){
            errorAlert.setContentText("Please enter a valid age");
            errorAlert.showAndWait();
            return;
            }

        //Validate Email
        if(userObject.getEmail().isBlank()){
            errorAlert.setContentText("Please enter a valid e-mail");
            errorAlert.showAndWait();
            return;
            }
        
        //Alert
        Alert userAlert = new Alert(AlertType.INFORMATION);
        userAlert.setTitle("Success");
        userAlert.setHeaderText("Thanks for submitting");
        userAlert.setContentText(userObject.toString());
        userAlert.showAndWait();
    }
}
