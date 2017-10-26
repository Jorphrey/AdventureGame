package Room;

import Enemy.Enemy;
import Items.Item;
import Player.Player;
import TitleScreen.Game;
import Enemy.ENUMYDifficulty;

import java.util.List;
import java.util.Set;

public class ForestRoom extends Room {

    public ForestRoom(String name,boolean isLocked, String unlocker, ENUMYDifficulty enumyDifficulty, List<Item> loot, boolean hasPuzzle, boolean hasEnemy, Player player, Game game) {
        super(name, isLocked, unlocker, enumyDifficulty, (Set<Item>) loot, hasPuzzle, hasEnemy, player, game);
    }
}
