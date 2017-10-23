package TitleScreen;

import Enemy.ENUMYTYPE;
import Enemy.EnemyFactory;
import Enemy.GrassEnemy.Bat;
import Enemy.Enemy;
import Items.Drink;
import Items.Item;
import Items.Key;
import Level.Level;
import Player.Player;
import Room.ForestRoom;
import Room.GrassRoom;
import Room.Room;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import Enemy.ENUMY;

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
    private ProgressBar enemyHPOne;
    @FXML
    private ProgressBar enemyMPOne;
    @FXML
    private Label enemyNameOne;
    @FXML
    private ProgressBar enemyHPTwo;
    @FXML
    private ProgressBar enemyMPTwo;
    @FXML
    private Label enemyNameTwo;
    @FXML
    private ProgressBar enemyHPThree;
    @FXML
    private ProgressBar enemyMPThree;
    @FXML
    private Label enemyNameThree;
    @FXML
    private ProgressBar enemyHPFour;
    @FXML
    private ProgressBar enemyMPFour;
    @FXML
    private Label enemyNameFour;
    @FXML
    private ProgressBar enemyHPFive;
    @FXML
    private ProgressBar enemyMPFive;
    @FXML
    private Label enemyNameFive;
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
    private static Player player;
    private static List<String> eventOutput;
    private Level level;
    private Room room;
    private Bat bat;
    List<Enemy> enemies;


    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        eventOutput = new ArrayList<>();
        eventScreen.setText("Click Enter below to start");
        playerHP.setStyle("-fx-accent:red;");
        playerMP.setStyle("-fx-accent:limegreen;");
        playerXP.setStyle("-fx-accent:mediumblue");
        enemyHPOne.setStyle("-fx-accent:red;");
        enemyMPOne.setStyle("-fx-accent:limegreen;");
        enemyHPTwo.setStyle("-fx-accent:red;");
        enemyMPTwo.setStyle("-fx-accent:limegreen;");
        enemyHPThree.setStyle("-fx-accent:red;");
        enemyMPThree.setStyle("-fx-accent:limegreen;");
        enemyHPFour.setStyle("-fx-accent:red;");
        enemyMPFour.setStyle("-fx-accent:limegreen;");
        enemyHPFive.setStyle("-fx-accent:red;");
        enemyMPFive.setStyle("-fx-accent:limegreen;");
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
        playerHP.setProgress((float) player.getCurrentHP() / player.getMaxHP());
        playerMP.setProgress((float) player.getCurrentMP() / player.getMaxMP());
        playerXP.setProgress((float) player.getCurrentXP() / player.getMaxXP());

        /*
        Enemy bat2 = new Bat("Bat", player, this);
        Enemy bat = new Bat("Bat2", player, this);
        Enemy bat3 = new Bat("Bat3", player,  this);

        enemies.add(bat);
        enemies.add(bat2);
        enemies.add(bat3);


        int i = 0;
        Enemy e = enemies.get(i);
        if(e.getCurrentHP() == 0){
          i++;
        }
*/

        String key = "key";
        List<Item> loot = new ArrayList<>();
        loot.add(new Key("Skeleton key"));
        loot.add(new Drink("Ale"));

        Room room = new GrassRoom(false, key, ENUMY.EASY, loot, false, player, this);
        enemies.addAll(room.getEnemies());
        System.out.println(enemies);
        if (!enemies.isEmpty()) {
            for (int i = 0; i < enemies.size(); i++) {

                if (enemies.size() >= 1) {
                    enemyNameOne.setText(enemies.get(0).getName());
                    enemyHPOne.setProgress((float) enemies.get(0).getCurrentHP() / enemies.get(0).getMaxHP());
                    enemyMPOne.setProgress((float) enemies.get(0).getCurrentMP() / enemies.get(0).getMaxMP());
                }
                if (enemies.size() >= 2) {
                    enemyNameTwo.setText(enemies.get(1).getName());
                    enemyHPTwo.setProgress((float) enemies.get(1).getCurrentHP() / enemies.get(1).getMaxHP());
                    enemyMPTwo.setProgress((float) enemies.get(1).getCurrentMP() / enemies.get(1).getMaxMP());
                }
                if (enemies.size() >= 3) {
                    enemyNameThree.setText(enemies.get(2).getName());
                    enemyHPThree.setProgress((float) enemies.get(2).getCurrentHP() / enemies.get(2).getMaxHP());
                    enemyMPThree.setProgress((float) enemies.get(2).getCurrentMP() / enemies.get(2).getMaxMP());
                }
                if (enemies.size() >= 4) {
                    enemyNameFour.setText(enemies.get(3).getName());
                    enemyHPFour.setProgress((float) enemies.get(3).getCurrentHP() / enemies.get(3).getMaxHP());
                    enemyMPFour.setProgress((float) enemies.get(3).getCurrentMP() / enemies.get(3).getMaxMP());
                }
                if (enemies.size() >= 5) {
                    enemyNameFive.setText(enemies.get(4).getName());
                    enemyHPFive.setProgress((float) enemies.get(4).getCurrentHP() / enemies.get(4).getMaxHP());
                    enemyMPFive.setProgress((float) enemies.get(4).getCurrentMP() / enemies.get(4).getMaxMP());
                }

            }


        }

    }

    public void attackButton() {
        Enemy e = enemies.get(0);
        player.attack(e);
        e.attack();

        update();


    }

    public void magicButton() {
        player.setCurrentMp(-10);
        update();
    }


}

