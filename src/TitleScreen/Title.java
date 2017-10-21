package TitleScreen;

import Player.Player;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Title implements Initializable {
    @FXML
    Label error;
    @FXML
    TextField name;
    @FXML
    RadioButton wizard;
    @FXML
    RadioButton warrior;
    @FXML
    RadioButton rogue;
    @FXML
    Button create;
    @FXML
    Button load;
    @FXML


    private Player player;
    ToggleGroup group = new ToggleGroup();


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        wizard.setToggleGroup(group);
        warrior.setToggleGroup(group);
        rogue.setToggleGroup(group);
        wizard.setSelected(true);
    }

    public Title() {


    }


    public void createPlayer() {

        try {
            if (name.getText().equals("")) {
                error.setText("Please enter your name");
            } else if (!name.getText().equals("")) {

                try {

                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("Game.fxml"));
                    Parent root1 = fxmlLoader.load();
                    Stage gameStage = new Stage();
                    gameStage.setResizable(false);
                    Game game = fxmlLoader.getController();
                    game.setPlayer(new Player(name.getText(), group.getSelectedToggle().toString()));
                    gameStage.setTitle("Adventure Game");
                    gameStage.setScene(new Scene(root1));

                    gameStage.show();


                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        } catch (Exception e) {

        }

    }

}