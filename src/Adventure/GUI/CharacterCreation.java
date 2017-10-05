package Adventure.GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.Node;

import java.awt.*;
import java.awt.event.ActionEvent;


public class UserInterface extends Application {

    Button button;

    public UserInterface() {

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Adventure Game");
        button = new Button();
        button.setText("Select");

        button.setOnAction(this);

        StackPane layout = new StackPane();
        layout.getChildren().add(button)

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

    public void handle(ActionEvent event){
        if(event.getSource()==button){
            //do thing here
        }
        }


    }
}
