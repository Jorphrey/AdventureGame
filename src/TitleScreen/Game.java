package TitleScreen;


import Enemy.BasicEnemy.BasicEnemy;
import Enemy.BasicEnemy.Bat;
import Enemy.Enemy;
import Level.Level;
import Player.Player;
import Room.Room;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
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
    private ProgressBar enemyHP;
    @FXML
    private ProgressBar enemyMP;
    @FXML
    private Label enemyName;
    @FXML
    private Label enemyIntellect;
    @FXML
    private Label enemyStrength;
    @FXML
    private Label enemyAgility;
    @FXML
    private Label enemyDefense;
    @FXML
    private Label enemyShell;
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
    private Label playerLevel;
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
    private Bat bat;
    List<Enemy> enemies;


    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        eventScreen.setText("Click Enter below to start");
        playerHP.setStyle("-fx-accent:red;");
        playerMP.setStyle("-fx-accent:limegreen;");
        playerXP.setStyle("-fx-accent:mediumblue");
        enemyHP.setStyle("-fx-accent:red;");
        enemyMP.setStyle("-fx-accent:limegreen;");
        enemies = new ArrayList<Enemy>();


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
        playerLevel.setText("Level: " + Integer.toString(player.getLevel()));
        playerHP.setProgress((float)player.getCurrentHP()/ player.getMaxHP());
        playerMP.setProgress((float)player.getCurrentMP()/ player.getMaxMP());
        playerXP.setProgress((float)player.getCurrentXP()/ player.getMaxXP());

        Enemy bat2 = new Bat("Bat", player, 50, 20);
        Enemy bat = new Bat("Bat2", player, 50, 20);
        Enemy bat3 = new Bat("Bat3", player, 50, 20);

        enemies.add(bat);
        enemies.add(bat2);
        enemies.add(bat3);


        Enemy e = enemies.get(0);

        enemyName.setText(e.getName());
        enemyHP.setProgress((float) e.getCurrentHP() / e.getMaxHP());
        enemyMP.setProgress((float) e.getCurrentMP() / e.getMaxMP());
        enemyShell.setText(Integer.toString(e.getShell()));
        enemyDefense.setText(Integer.toString(e.getDefense()));

        System.out.println(e.getCurrentHP() + " " + e.getMaxHP());
    }

    public void attackButton() {
        player.setCurrentHp(-10);
        update();

    }

    public void magicButton() {
        player.setCurrentMp(-10);
        update();
    }


}

