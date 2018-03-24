package Items;

import Inventory.Inventory;
import Items.EnvironmentUse.EnvironmentUseItem;
import Items.SelfUse.Drink;
import Enemy.Enemy;
import java.util.HashSet;
import java.util.Set;

public class LootFactory {

    //TODO Loot based on enemy type and level
    //TODO Randomly add loot from a pool of loot items


    public Inventory getLoot(Enemy enemy){
        Inventory inventory = new Inventory();

        inventory.addToInventory(getLootItem());
        inventory.addToInventory(getLootItem());
        return inventory;
    }

    private Item getLootItem(){
        return new EnvironmentUseItem("Bronze Key", 1,99);
    }

}
