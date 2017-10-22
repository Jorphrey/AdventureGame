package Room;
import Enemy.Enemy;
import Items.Item;
import Player.Player;
import TitleScreen.Game;
import Enemy.Enumy;

import java.util.List;
import java.util.Random;

public abstract class Room {

    private Game game;
    private Player player;
    private String unlocker;
    private boolean isLocked;
    private boolean hasLoot;
    private boolean hasPuzzle;
    private boolean hasEntered;
    private List<Enemy> enemies;
    private List<Item>  loot;
    private int rand;

    public Room(boolean isLocked, String unlocker, Enumy enumy, List<Item> loot, boolean hasPuzzle){
        this.isLocked = isLocked;
        this.unlocker = unlocker;
        this.loot = loot;
        this.hasPuzzle = hasPuzzle;
        this.hasEntered = false;
        Random random = new Random();
        rand = random.nextInt(enumy.getMax()-enumy.getMin()+enumy.getMin());

        for(int i = 0; i < rand; i++) {
            //enemies.add()

        }
    }

   public void unlockRoom(){
        if (player.getInventory().contains(this.unlocker)){
            this.isLocked = false;
            player.getInventory().remove(this.unlocker);
       }
   }

   public void hasLoot(){
       if(this.loot.isEmpty()) {
           game.outputScreen("There are no items here");
       }
           else {for (int i = 0; i < this.loot.size(); i++){
           System.out.println(this.loot.get(i) + " ");

           }
       }
   }

   public void showEnemy(){


   }
}
