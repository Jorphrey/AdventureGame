package TitleScreen;


import Level.Level;
import Player.Player;
import Room.Room;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Game implements Initializable {


    @FXML
    private TextArea eventScreen;
    @FXML
    private Title title;
    @FXML
    private ProgressBar playerHP;
    @FXML
    private ProgressBar playerMP;
    @FXML
    private ProgressBar playerXP;
    @FXML
    private ProgressBar playerCompletion;
    @FXML
    private Label playerName;
    @FXML
    private Label playerIntellect;
    @FXML
    private Label playerStrength;
    @FXML
    private Label playerAgility;
    @FXML
    private Label playerDefense;
    @FXML
    private Label playerShell;
    @FXML
    private Button enterButton;
    @FXML
    private Button attackButton;
    @FXML
    private Button magicButton;
    @FXML
    private Button fwd;
    @FXML
    private Button left;
    @FXML
    private Button back;
    @FXML
    private Button right;

    @FXML
    private Player player;
    private int count;
    List<String> eventOutput;
    private Level level;
    private Room room;



    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        eventScreen.setText("Click Enter below to start");
        playerHP.setStyle("-fx-accent:red;");
        playerMP.setStyle("-fx-accent:limegreen;");
        playerXP.setStyle("-fx-accent:mediumblue");

    }

    public void setPlayerOnScreen() {
        outputScreen("Click Begin to Start");
    }

    public Game() {
    }


    public void outputScreen(String event) {
        eventOutput.add(event);
        StringBuilder temp = new StringBuilder();

        for (int i = eventOutput.size() - 1; i > 0; i--) {
            temp.append(eventOutput.get(i) + "\n");
        }
        if (eventOutput.size() >= 50) {
            eventOutput.remove(0);
        }
        eventScreen.setText(temp.toString());
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void update() {
        //playerHP.setProgress((double) player.getMaxHp());
        playerName.setText(player.getName());

        playerIntellect.setText(Integer.toString(player.getIntellect()));
        playerStrength.setText(Integer.toString(player.getStrength()));
        playerAgility.setText(Integer.toString(player.getAgility()));
        playerDefense.setText(Integer.toString(player.getDefense()));
        playerShell.setText(Integer.toString(player.getShell()));

        playerHP.setProgress((player.getMaxHp() - (player.getMaxHp() - player.getCurrentHp())) / 100f);
        playerMP.setProgress((player.getMaxMp() - (player.getMaxMp() - player.getCurrentMp())) / 100f);
        playerXP.setProgress((player.getMaxXP() - (player.getMaxXP() - player.getCurrentXP())) / 100f);

    }

    public void attackButton(){
        player.setCurrentHp(-10);
        update();

    }

    public void magicButton(){
        player.setCurrentMp(-10);
        update();
    }



}

