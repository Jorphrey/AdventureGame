package TitleScreen;

import Enemy.CritterEnemy.Bat;
import Enemy.Enemy;
import Level.Level;
import Level.TheGnarl;
import Player.Player;
import Room.Room;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;



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
    private Button enemyAttackOne;
    @FXML
    private ProgressBar enemyHPTwo;
    @FXML
    private ProgressBar enemyMPTwo;
    @FXML
    private Label enemyNameTwo;
    @FXML
    private Button enemyAttackTwo;
    @FXML
    private ProgressBar enemyHPThree;
    @FXML
    private ProgressBar enemyMPThree;
    @FXML
    private Label enemyNameThree;
    @FXML
    private Button enemyAttackThree;
    @FXML
    private ProgressBar enemyHPFour;
    @FXML
    private ProgressBar enemyMPFour;
    @FXML
    private Label enemyNameFour;
    @FXML
    private Button enemyAttackFour;
    @FXML
    private ProgressBar enemyHPFive;
    @FXML
    private ProgressBar enemyMPFive;
    @FXML
    private Label enemyNameFive;
    @FXML
    private Button enemyAttackFive;
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
    private GridPane board;
    @FXML
    private Label gridLabel[][];


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

        enemyAttackOne.setDisable(true);
        enemyAttackTwo.setDisable(true);
        enemyAttackThree.setDisable(true);
        enemyAttackFour.setDisable(true);
        enemyAttackFive.setDisable(true);

    }

    public void setPlayerOnScreen() {


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
        this.level = new TheGnarl(player, this);
        this.board = new GridPane();

        setBoard();

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


        if (!enemies.isEmpty()) {


            for (int i = 0; i < enemies.size(); i++) {

                enemies.get(i).getCurrentHP();
                if (enemies.size() >= 1) {
                    enemyNameOne.setText(enemies.get(0).getName());
                    enemyHPOne.setProgress((float) enemies.get(0).getCurrentHP() / enemies.get(0).getMaxHP());
                    enemyMPOne.setProgress((float) enemies.get(0).getCurrentMP() / enemies.get(0).getMaxMP());
                    enemyAttackOne.setDisable(false);
                }
                if (enemies.size() >= 2) {
                    enemyNameTwo.setText(enemies.get(1).getName());
                    enemyHPTwo.setProgress((float) enemies.get(1).getCurrentHP() / enemies.get(1).getMaxHP());
                    enemyMPTwo.setProgress((float) enemies.get(1).getCurrentMP() / enemies.get(1).getMaxMP());
                    enemyAttackTwo.setDisable(false);
                }
                if (enemies.size() >= 3) {
                    enemyNameThree.setText(enemies.get(2).getName());
                    enemyHPThree.setProgress((float) enemies.get(2).getCurrentHP() / enemies.get(2).getMaxHP());
                    enemyMPThree.setProgress((float) enemies.get(2).getCurrentMP() / enemies.get(2).getMaxMP());
                    enemyAttackThree.setDisable(false);
                }
                if (enemies.size() >= 4) {
                    enemyNameFour.setText(enemies.get(3).getName());
                    enemyHPFour.setProgress((float) enemies.get(3).getCurrentHP() / enemies.get(3).getMaxHP());
                    enemyMPFour.setProgress((float) enemies.get(3).getCurrentMP() / enemies.get(3).getMaxMP());
                    enemyAttackFour.setDisable(false);
                }
                if (enemies.size() >= 5) {
                    enemyNameFive.setText(enemies.get(4).getName());
                    enemyHPFive.setProgress((float) enemies.get(4).getCurrentHP() / enemies.get(4).getMaxHP());
                    enemyMPFive.setProgress((float) enemies.get(4).getCurrentMP() / enemies.get(4).getMaxMP());
                    enemyAttackFive.setDisable(false);


                }

            }


        }
        setBoard();
    }

    public void setEnemie(){
        
    }

    public void setBoard() {
        gridLabel = new Label[this.level.getWidth()][this.level.getHeight()];

        for (int row = 0; row < this.level.getHeight(); row++) {
            for (int col = 0; col < this.level.getWidth(); col++) {
                if (this.level.getRoom(row, col).getName().equals("nothing")) {
                    gridLabel[row][col] = new Label("X");
                    gridLabel[row][col].setText("X");
                    board.add(gridLabel[row][col], row, col);
                } else {
                    gridLabel[row][col] = new Label(this.level.getRoom(row, col).getName());
                    gridLabel[row][col].setText(this.level.getRoom(row, col).getName());
                    board.add(gridLabel[row][col], row, col);
                }
            }

        }

        System.out.println(gridLabel[4][2].getText());
        System.out.println(gridLabel[0][0].getText());




    }

    public void attackEnemy(javafx.event.ActionEvent ae) {
        if (ae.getSource().equals(enemyAttackOne)) {
            player.attack(enemies.get(0));
            update();
        }
        if (ae.getSource().equals(enemyAttackTwo)) {
            player.attack(enemies.get(1));
            update();
        }
        if (ae.getSource().equals(enemyAttackThree)) {
            player.attack(enemies.get(2));
            update();
        }
        if (ae.getSource().equals(enemyAttackFour)) {
            player.attack(enemies.get(3));
            update();
        }
        if (ae.getSource().equals(enemyAttackFive)) {
            player.attack(enemies.get(4));
            update();
        }

        for (Enemy e : enemies) {
            e.attack();
        }

    }

    public void attackButton() {
        Enemy e = enemies.get(0);
        player.attack(e);
        e.attack();

        update();


    }

    public void createEnemies() {

    }


    public void magicButton() {
        player.setCurrentMp(-10);
        update();
    }


}

