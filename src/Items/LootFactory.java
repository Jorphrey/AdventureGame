package Items;

import Items.EnvironmentUse.EnvironmentUseItem;
import Items.SelfUse.Drink;

import java.util.HashSet;
import java.util.Set;

public class LootFactory {

    public Set<Item> getLoot(){
        Set<Item> loot = new HashSet<>();
        loot.add(new EnvironmentUseItem("Bronze Key", 1,99));
        loot.add(new Drink("Beer", 1, 99));
        return loot;
    }
}
