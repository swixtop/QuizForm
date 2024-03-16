package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrimaryController {

    @FXML
    private Button mQ;

    @FXML
    private Button sAQ;

    @FXML
    private Button tFQ;

    @FXML
    private void initialize() {
        // Set an event handler for the tFQ button
        tFQ.setOnAction(this::loadTrueFalseInterface);
    }

    private void loadTrueFalseInterface(ActionEvent event) {
        try {
            // Load the FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("trueFalseInterface.fxml"));
            Parent root = loader.load();

            // Create a new stage and set the scene
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();

            // Close the current stage (optional)
            tFQ.getScene().getWindow().hide();
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately
        }
    }

}