package Unit6JavaFX;

import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;

public class FXFormDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{
        Label usernameLabel = new Label("Username:");
        Label passwordLabel = new Label("Password:");
        Label genderLabel = new Label("Gender");
        Label courseLabel = new Label("Course");
        Label countryLabel = new Label("Country");

        TextField textField = new TextField();
        PasswordField passwordField = new PasswordField();
        RadioButton maleButton = new RadioButton("Male");
        RadioButton femaleButton = new RadioButton("Female");

        ToggleGroup toggleGroup = new ToggleGroup();
        maleButton.setToggleGroup(toggleGroup);
        femaleButton.setToggleGroup(toggleGroup);

        CheckBox javaCheckBox = new CheckBox("Java");
        CheckBox cppCheckBox = new CheckBox("C++");
        CheckBox pythonCheckBox = new CheckBox("Python");

        // Dropdown: Choicebox
        ChoiceBox choiceBox = new ChoiceBox();
        choiceBox.getItems().addAll("Nepal", "India", "Other");

        Button button = new Button("Submit");

        // Grid layout
        GridPane gridPane = new GridPane();
        gridPane.add(usernameLabel, 0, 0);
        gridPane.add(textField, 1, 0);

        gridPane.add(passwordLabel, 0, 1);
        gridPane.add(passwordField, 1, 1);

        gridPane.add(genderLabel, 0, 2);
        gridPane.add(maleButton, 1, 2);

        gridPane.add(new Label(), 0, 3);
        gridPane.add(femaleButton, 1, 3);

        gridPane.add(courseLabel, 0, 4);
        gridPane.add(javaCheckBox, 1, 4);
        gridPane.add(cppCheckBox, 1, 5);
        gridPane.add(pythonCheckBox, 1, 6);

        gridPane.add(countryLabel, 0, 7);
        gridPane.add(choiceBox, 1, 7);

        gridPane.add(button, 1, 8);

        // Button event handling
        button.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
                //extract form field and connect to database
                String username = textField.getText();
                String password = passwordField.getText();
                

            }
        });

        Scene scene = new Scene(gridPane, 400, 400);
        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }
}