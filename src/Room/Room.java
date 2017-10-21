package Room;
import Enemy.Enemy;
import Items.Item;
import Player.Player;

import java.util.List;

public abstract class Room {

    private Player player;
    private String unlocker;
    private int hasEnemy;
    private boolean isLocked;
    private boolean hasLoot;
    private boolean hasPuzzle;
    private boolean hasEntered;
    private boolean hasBoss;
    private List<Enemy> enemies;
    private List<Item>  loot;

    public Room(boolean isLocked, String unlocker, int hasEnemy, List<Item> loot, boolean hasPuzzle, boolean hasBoss){
        this.isLocked = isLocked;
        this.unlocker = unlocker;
        this.hasEnemy = hasEnemy;
        this.hasLoot = hasLoot;
        this.hasPuzzle = hasPuzzle;
        this.hasEntered = false;
    }

   public void unlockRoom(){
        if (player.getInventory().contains(this.unlocker)){
            this.isLocked = false;
            player.getInventory().remove(this.unlocker);
       }
   }
}
