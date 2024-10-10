package sabrina.gui_sabrina;

// Sabrina
// CSC 325 - Software Engineering
// GUI Project

import javafx.application.Application; // Importing Application class for JavaFX applications
import javafx.fxml.FXMLLoader; // Importing FXMLLoader for loading FXML files
import javafx.scene.Parent; // Importing Parent class as a base for the scene graph
import javafx.scene.Scene; // Importing Scene class for creating a scene
import javafx.stage.Stage; // Importing Stage class for the main window of the application

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file from the specified resources path
        Parent root = FXMLLoader.load(getClass().getResource("/sabrina/gui_sabrina/Main.fxml"));

        // Create a Scene with the loaded root node and set its dimensions
        Scene scene = new Scene(root);

        // Link the CSS stylesheet to the scene for styling
        scene.getStylesheets().add(getClass().getResource("/css/styles.css").toExternalForm());

        // Set up the primary Stage (window) for the application
        primaryStage.setTitle("JavaFX Application with CSS"); // Set the title of the window
        primaryStage.setScene(scene); // Associate the created scene with the stage
        primaryStage.show(); // Display the stage to the user
    }

    // Main entry point for the JavaFX application
    public static void main(String[] args) {
        launch(args); // Launch the application
    }
}