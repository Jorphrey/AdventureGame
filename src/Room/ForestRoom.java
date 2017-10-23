package Room;

import Enemy.ENUMY;
import Enemy.Enemy;
import Items.Item;
import Player.Player;
import TitleScreen.Game;

import java.util.List;
import java.util.Random;

public class ForestRoom extends Room {

    public ForestRoom(boolean isLocked, String unlocker, ENUMY enumy, List<Item> loot, boolean hasPuzzle, Player player, Game game) {
        super(isLocked, unlocker, enumy, loot, hasPuzzle, player, game);


    }
}
