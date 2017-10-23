package Room;

import Enemy.GrassEnemy.GrassEnumy;
import Enemy.GrassEnemy.Bat;
import Enemy.ENUMY;
import Enemy.Enemy;
import Items.Item;
import Player.Player;
import TitleScreen.Game;
import Enemy.EnemyFactory;
import Enemy.ENUMYTYPE;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Room {

    protected Game game;
    protected Player player;
    protected String unlocker;
    protected boolean isLocked;
    protected boolean hasLoot;
    protected boolean hasPuzzle;
    protected boolean hasEntered;
    protected List<Enemy> enemies;
    protected List<Item> loot;
    protected int rand;
    protected EnemyFactory enemyFactory;
    protected String name;
    protected ENUMYTYPE enumyType;
    protected Random random;


    public Room(boolean isLocked, String unlocker, ENUMY enumy, List<Item> loot, boolean hasPuzzle, Player player, Game game) {
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

    }

    public void unlockRoom() {
        if (player.getInventory().contains(this.unlocker)) {
            this.isLocked = false;
            player.getInventory().remove(this.unlocker);
        }
    }

    public void hasLoot() {
        if (this.loot.isEmpty()) {
            game.outputScreen("There are no items here");
        } else {
            for (int i = 0; i < this.loot.size(); i++) {
                System.out.println(this.loot.get(i) + " ");

            }
        }
    }

    public void showEnemy() {


    }

    public String getName() {
        return this.name;


    }

    public List<Enemy> getEnemies() {
        return enemies;
    }
}