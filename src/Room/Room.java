package Room;

import Enemy.Enemy;
import Items.Item;
import Player.Player;
import TitleScreen.Game;
import Enemy.EnemyFactory;
import Enemy.ENUMYRoom;
import Enemy.ENUMYDifficulty;

import java.util.*;

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
    protected String roomDescription;


    public Room(String name, boolean isLocked, String unlocker, ENUMYDifficulty enumyDifficulty, Set<Item> loot, boolean hasPuzzle, boolean hasEnemy, Player player, Game game) {
        this.name = name;
        this.game = game;
        this.player = player;
        this.isLocked = isLocked;
        this.unlocker = unlocker;
        this.loot = loot;
        this.hasPuzzle = hasPuzzle;
        this.enumyDifficulty = enumyDifficulty;
        enemies = new ArrayList<>();
        enemyFactory = new EnemyFactory();
        hasEntered = false;
        random = new Random();

    }


    public void unlockRoom(Item unlocker) {
        if (unlocker.equals(this.unlocker)) {
            this.isLocked = false;
            player.removeInventory(unlocker);
            game.outputScreen("You have unlocked the door!");
        }
    }

    public abstract String getUnlockRoomMessage();

    public void hasLoot() {
        if (this.loot.isEmpty()) {
            game.outputScreen("There are no items here");
        } else {
            for (int i = 0; i < this.loot.size(); i++) {
                System.out.println(this.loot.contains(i) + " ");

            }
        }
    }

    public String getRoomDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        if (!hasEntered) {
            sb.append(name + ": " + roomDescription);
        }
        if (hasEntered) {
            sb.append(name + ": " + "A familiar place. \n");
        }
        if (hasEnemy) {
            if (this.enemies.size() > 1) {
                sb.append("There are monsters in the area. \n");
            } else {
                sb.append("There is a monster in the area. \n");
            }
        }
        if (hasPuzzle) {
            sb.append("A cunning puzzle awaits you. \n");
        }

        return sb.toString();
    }


    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public void enterRoom() {
        this.hasEntered = true;
    }

    public void showEnemy() {


    }

    public String getName() {
        return this.name;


    }

    public EnemyFactory getEnemyFactory() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(getName(), room.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName());
    }
}