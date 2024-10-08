package sabrina.gui_sabrina;

// Sabrina
// CSC 325 - Software Engineering
// GUI Project

import javafx.fxml.FXML; // Importing the FXML annotation for linking FXML components
import javafx.scene.control.TableView; // Importing TableView for displaying tabular data
import javafx.scene.control.TextField; // Importing TextField for user input fields
import javafx.scene.image.ImageView; // Importing ImageView for displaying images

public class MainController {

    // Linking FXML components to this controller
    @FXML
    private TableView<?> tableView; // The TableView to display user entries

    @FXML
    private TextField lastNameField; // Field for entering the last name of a user

    @FXML
    private TextField departmentField; // Field for entering the department of a user

    @FXML
    private TextField majorField; // Field for entering the major of a user

    @FXML
    private TextField emailField; // Field for entering the email of a user

    @FXML
    private TextField imageURLField; // Field for entering the URL of the user's image

    @FXML
    private ImageView userImage; // ImageView for displaying the user's image

    // Method to clear all input fields
    @FXML
    private void clearFields() {
        lastNameField.clear(); // Clear the last name field
        departmentField.clear(); // Clear the department field
        majorField.clear(); // Clear the major field
        emailField.clear(); // Clear the email field
        imageURLField.clear(); // Clear the image URL field
    }

    // Method to add an entry to the table
    @FXML
    private void addEntry() {
        // Logic to add an entry to the table
        // This will involve collecting data from the text fields and adding it to the TableView
    }

    // Method to delete an entry from the table
    @FXML
    private void deleteEntry() {
        // Logic to delete an entry from the table
        // This will involve identifying the selected entry and removing it from the TableView
    }

    // Method to edit an entry in the table
    @FXML
    private void editEntry() {
        // Logic to edit an entry in the table
        // This will involve updating the selected entry based on the values in the text fields
    }
}
