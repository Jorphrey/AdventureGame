package Room;

import Enemy.Enemy;
import Enemy.Enumy;
import Items.Item;

import java.util.List;

public class ForestRoom extends Room{
    public ForestRoom(boolean isLocked, String unlocker, Enumy hasEnemy, List<Item> loot, boolean hasPuzzle) {
        super(isLocked, unlocker, hasEnemy, loot, hasPuzzle);
    }
}
