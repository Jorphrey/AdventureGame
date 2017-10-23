package Room;

import Enemy.ENUMY;
import Enemy.ENUMYTYPE;
import Enemy.Enemy;
import Enemy.GrassEnemy.GrassEnumy;
import Items.Item;
import Player.Player;
import TitleScreen.Game;

import java.util.List;

public class GrassRoom extends Room {

    private Enemy enemy;

    public GrassRoom(boolean isLocked, String unlocker, ENUMY enumy, List<Item> loot, boolean hasPuzzle, Player player, Game game) {
        super(isLocked, unlocker, enumy, loot, hasPuzzle, player, game);
        this.name = "Grass";
        this.enumyType = ENUMYTYPE.GRASS;

        rand = random.nextInt((enumy.getMax() - enumy.getMin() + 1) + enumy.getMin());
        for (int i = 0; i < rand; i++) {
            enemies.add(enemyFactory.makeEnemy(this.enumyType, GrassEnumy.values().length, this.player, this.game));
        }
    }

}


