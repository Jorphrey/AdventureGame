package Items;

import Player.Player;
import Enemy.Enemy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LootFactory {

    public Set<Item> getLoot(){
        Set<Item> loot = new HashSet<>();
        loot.add(new Key("Bronze Key", 1,99));
        loot.add(new Drink("Beer", 1, 99));
        return loot;
    }
}
