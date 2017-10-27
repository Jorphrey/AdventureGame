package Room;

import Enemy.Enemy;
import Items.Item;
import Player.Player;
import TitleScreen.Game;
import Enemy.EnemyFactory;
import Enemy.ENUMYRoom;
import Enemy.ENUMYDifficulty;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public abstract class Room {

    protected Game game;
    protected Player player;
    protected String unlocker;
    protected String name;
    protected boolean isLocked;
    protected boolean hasLoot;
    protected boolean hasPuzzle;
    protected boolean hasEntered;
    protected boolean hasEnemy;
    protected List<Enemy> enemies;
    protected Set<Item> loot;
    protected int rand;
    protected EnemyFactory enemyFactory;
    protected ENUMYRoom enumyType;
    protected Random random;
    protected ENUMYDifficulty enumyDifficulty;


    public Room(String name, boolean isLocked, String unlocker, ENUMYDifficulty enumyDifficulty, Set<Item> loot, boolean hasPuzzle, boolean hasEnemy, Player player, Game game) {
        this.name = name;
        this.enemyFactory = new EnemyFactory();
        this.game = game;
        this.player = player;
        this.isLocked = isLocked;
        this.unlocker = unlocker;
        this.loot = loot;
        this.hasPuzzle = hasPuzzle;
        this.hasEntered = false;
        this.enemies = new ArrayList<>();
        this.random = new Random();
        this.enumyDifficulty = enumyDifficulty;


    }

    public void setHasEntered(){
        this.hasEntered = true;
    }

    public void unlockRoom(Item unlocker) {
        if (unlocker.equals(this.unlocker)) {
            this.isLocked = false;
           player.removeInventory(unlocker);
           game.outputScreen("You have unlocked the door!");
        }
    }

    public void hasLoot() {
        if (this.loot.isEmpty()) {
            game.outputScreen("There are no items here");
        } else {
            for (int i = 0; i < this.loot.size(); i++) {
                System.out.println(this.loot.contains(i) + " ");

            }
        }
    }

    public void enterRoom(){
        this.hasEntered = true;
    }
    public void showEnemy() {


    }

    public String getName() {
        return this.name;


    }

    public EnemyFactory getEnemyFactory(){
        return this.enemyFactory;
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", isLocked=" + isLocked +
                ", hasLoot=" + hasLoot +
                ", hasPuzzle=" + hasPuzzle +
                ", hasEntered=" + hasEntered +
                ", hasEnemy=" + hasEnemy +
                ", unLocker=" + unlocker +
                '}';
    }

    public String getUnlocker() {
        return unlocker;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public boolean isHasLoot() {
        return hasLoot;
    }

    public boolean isHasPuzzle() {
        return hasPuzzle;
    }

    public boolean isHasEntered() {
        return hasEntered;
    }

    public boolean isHasEnemy() {
        return hasEnemy;
    }

    public Set<Item> getLoot() {
        return loot;
    }
}