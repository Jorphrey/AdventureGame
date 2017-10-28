package TitleScreen;

import Enemy.CritterEnemy.Bat;
import Enemy.Enemy;
import Items.EnvironmentUse.EnvironmentUseItem;
import Items.Item;
import Items.SelfUse.SelfUseItem;
import Level.Level;
import Level.TheGnarl;
import Player.Player;
import Room.Room;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
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
    private Button northButton;
    @FXML
    private Button westButton;
    @FXML
    private Button southButton;
    @FXML
    private Button eastButton;
    @FXML
    private ComboBox<String> playerInventorySelfComboBox;
    @FXML
    private Label selfInventoryQty;
    @FXML
    private ComboBox<String> playerInventoryEnvironmentComboBox;
    @FXML
    private Label environmentInventoryQty;
    @FXML
    private GridPane board;
    @FXML
    private Button lookButton;
    @FXML
    private Button speakButton;
    @FXML
    private Button openButton;
    @FXML
    private Button hitButton;

    private Room nextRoom;

    private ObservableList<String> playerInventoryObservableListSelf;
    private ObservableList<String> playerInventoryObservableListEnvironment;
    private Label gridLabel[][];
    private static Player player;
    private static List<String> eventOutput;
    private Level level;
    private Room room;
    private Bat bat;
    List<Enemy> enemies;


    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        enemies = new ArrayList<Enemy>();
        eventOutput = new ArrayList<>();

        eventScreen.setText("Welcome");
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

        enemyAttackOne.setDisable(true);
        enemyAttackTwo.setDisable(true);
        enemyAttackThree.setDisable(true);
        enemyAttackFour.setDisable(true);
        enemyAttackFive.setDisable(true);
    }

    public void setPlayerOnScreen() {

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

    }

    public Game() {
    }


    public void outputScreen(String event) {
        eventOutput.add(event);
        StringBuilder temp = new StringBuilder();

        for (int i = eventOutput.size() - 1; i > 0; i--) {
            temp.append(eventOutput.get(i) + "\n");

        }
        if (eventOutput.size() >= 100) {
            eventOutput.remove(0);
        }
        eventScreen.setText(temp.toString());
    }

    public void setPlayer(Player player) {
        this.player = player;
        this.level = new TheGnarl(player, this);
        outputScreen("You're in a pitch black room.");
        player.setPosition(2, 4);
        Item potion = new SelfUseItem("Healing Potion", 5, 99);
        Item key = new EnvironmentUseItem("Key", 1, 99);
        //Item flashlight = new EnvironmentUseItem("Flashlight", 1,1);
        //player.addToInventory(flashlight);
        //adding flashlight breaks stops the game from loading for some reason
        player.addToInventory(potion);
        player.addToInventory(key);

    }

    public void update() {


        //playerHP.setProgress((double) player.getMaxHp());


        setPlayerOnScreen();
        setBoard();
        // setEnemies(t);
        setInventory();
    }

    public void setEnemies(List<Enemy> enemies) {
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

    }


    public void setInventory() {
        try {
            playerInventoryEnvironmentComboBox.getItems().clear();
            playerInventoryObservableListEnvironment.clear();
        } catch (Exception e) {

        }
        playerInventoryObservableListEnvironment = FXCollections.observableArrayList();
        playerInventoryObservableListSelf = FXCollections.observableArrayList();

        for (Item e : player.getInventory()) {
            if (e instanceof EnvironmentUseItem) {
                playerInventoryObservableListEnvironment.add(e.getName());
            } else if (e instanceof SelfUseItem) {
                playerInventoryObservableListSelf.add(e.getName());
            }
        }

        playerInventorySelfComboBox.setItems(playerInventoryObservableListSelf);
        playerInventorySelfComboBox.setPromptText("Items");

        playerInventoryEnvironmentComboBox.setItems(playerInventoryObservableListEnvironment);
        playerInventoryEnvironmentComboBox.setPromptText("Items");

        playerInventoryEnvironmentComboBox.setOnAction(e -> environmentInventoryQty.setText("QTY " +
                Integer.toString(player.getInventoryItem(playerInventoryEnvironmentComboBox.getValue()).getQuantity())));
        playerInventorySelfComboBox.setOnAction(e -> selfInventoryQty.setText("QTY " +
                Integer.toString(player.getInventoryItem(playerInventorySelfComboBox.getValue()).getQuantity())));
    }

    public void setBoard() {
        board.getChildren().clear();
        gridLabel = new Label[this.level.getWidth()][this.level.getHeight()];
        for (int col = 0; col < this.level.getHeight(); col++) {
            for (int row = 0; row < this.level.getWidth(); row++) {
                if (this.level.getRoom(row, col).equals("nothing") || !this.level.getRoom(row, col).isHasEntered()) {
                    gridLabel[row][col] = new Label("");
                    gridLabel[row][col].setStyle("-fx-background-color:black;");
                    gridLabel[row][col].setPrefWidth(80);
                    gridLabel[row][col].setPrefHeight(50);
                    gridLabel[row][col].setAlignment(Pos.CENTER);
                    board.add(gridLabel[row][col], row, col);
                } else {
                    gridLabel[row][col] = new Label();
                    gridLabel[row][col].setPrefWidth(80);
                    gridLabel[row][col].setPrefHeight(50);
                    gridLabel[row][col].setAlignment(Pos.CENTER);
                    if (this.player.getPositionX() == row && this.player.getPositionY() == col) {
                        gridLabel[row][col].setText("O");
                    }
                    board.add(gridLabel[row][col], row, col);
                }

            }
        }
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
        update();

    }


    public void attackButton() {
        Enemy e = enemies.get(0);
        player.attack(e);
        e.attack();

        update();


    }
/*
    public void createEnemies() {
        List<Enemy> enemies =this.level.getRoom(this.player.getPositionX(), this.player.getPositionY()).getEnemies();
       for(Enemy e : enemies){
           if(enemies.size() == 1){
               enemyNameOne.setText(e.getName());
               enemyHPOne.setProgress();
           }
       }
      }
 */

    public void magicButton() {
        player.setCurrentMp(-10);
        update();
    }

    public void playerMove(ActionEvent ae) {
        int x = player.getPositionX();
        int y = player.getPositionY();
        try {
            if (ae.getSource().equals(northButton)) {
                if (this.level.getRoom(x, y - 1).isLocked() && !this.level.getRoom(x, y - 1).getName().equals("nothing")) {
                    outputScreen((this.level.getRoom(x, y - 1).getUnlockRoomMessage()));
                } else if (this.level.getRoom(x, y - 1).getName().equals("nothing")) {
                    outputScreen("There is no path in this direction");
                } else if (this.level.getRoom(x, y).isHasEnemy()) {
                    outputScreen("Monsters are blocking the way out!");
                } else {
                    player.setPosition(0, -1);
                   outputScreen("----------------------------------------------------------------------------\n");
                    outputScreen(level.getRoom(player.getPositionX(), player.getPositionY()).getRoomDescription());
                    this.level.getRoom(player.getPositionX(), player.getPositionY()).enterRoom();
                    update();
                }
            } else if (ae.getSource().equals(southButton)) {
                if (this.level.getRoom(x, y + 1).isLocked() && !this.level.getRoom(x, y + 1).getName().equals("nothing")) {
                    outputScreen((this.level.getRoom(x, y - 1).getUnlockRoomMessage()));

                } else if (this.level.getRoom(x, y + 1).getName().equals("nothing")) {
                    outputScreen("There is no path in this direction");
                } else if (this.level.getRoom(x, y).isHasEnemy()) {
                    outputScreen("Monsters are blocking the way out!");
                } else {
                    player.setPosition(0, 1);
                    outputScreen("----------------------------------------------------------------------------\n");
                    outputScreen(level.getRoom(player.getPositionX(), player.getPositionY()).getRoomDescription());
                    this.level.getRoom(player.getPositionX(), player.getPositionY()).enterRoom();
                    update();
                }
            } else if (ae.getSource().equals(eastButton)) {
                if (this.level.getRoom(x + 1, y).isLocked() && !this.level.getRoom(x + 1, y).getName().equals("nothing")) {
                    outputScreen((this.level.getRoom(x, y - 1).getUnlockRoomMessage()));
                } else if (this.level.getRoom(x + 1, y).getName().equals("nothing")) {
                    outputScreen("There is no path in this direction");
                } else if (this.level.getRoom(x, y).isHasEnemy()) {
                    outputScreen("Monsters are blocking the way out!");
                } else {
                    player.setPosition(1, 0);
                    outputScreen("----------------------------------------------------------------------------\n");
                    outputScreen(level.getRoom(player.getPositionX(), player.getPositionY()).getRoomDescription());
                    this.level.getRoom(player.getPositionX(), player.getPositionY()).enterRoom();
                    update();
                }
            } else if (ae.getSource().equals(westButton)) {
                if (this.level.getRoom(x - 1, y).isLocked() && !this.level.getRoom(x - 1, y).getName().equals("nothing")) {
                    outputScreen((this.level.getRoom(x, y - 1).getUnlockRoomMessage()));
                } else if (this.level.getRoom(x - 1, y).getName().equals("nothing")) {
                    outputScreen("There is no path in this direction");
                } else if (this.level.getRoom(x, y).isHasEnemy()) {
                    outputScreen("Monsters are blocking the way out!");
                } else {
                    player.setPosition(-1, 0);
                    outputScreen("----------------------------------------------------------------------------\n");
                    outputScreen(level.getRoom(player.getPositionX(), player.getPositionY()).getRoomDescription());
                    this.level.getRoom(player.getPositionX(), player.getPositionY()).enterRoom();
                    update();
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            outputScreen("There is no path in this direction");
        }
    }

    public void lookAround(){
        outputScreen(level.getRoom(player.getPositionX(), player.getPositionY()).getRoomDescription());
    }
}