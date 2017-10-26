package Room;

import Enemy.ENUMYDifficulty;
import Enemy.CritterEnemy.CritterENUM;
import Enemy.ENUMYRoom;
import Items.Item;
import Player.Player;
import TitleScreen.Game;

import java.util.List;
import java.util.Set;

public class GrassRoom extends Room {


    public GrassRoom(String name, boolean isLocked, String unlocker, ENUMYDifficulty enumyDifficulty, Set<Item> loot, boolean hasPuzzle,
                     boolean hasEnemy, Player player, Game game) {
        super(name, isLocked, unlocker, enumyDifficulty, loot, hasPuzzle, hasEnemy, player, game);
        this.enumyType = ENUMYRoom.GRASS;

        if (hasEnemy) {
            rand = random.nextInt((enumyDifficulty.getMax() - enumyDifficulty.getMin() + 1) + enumyDifficulty.getMin());

            for (int i = 0; i < rand; i++) {
                enemies.add(this.enemyFactory.makeEnemy(this.enumyType, CritterENUM.values().length, this.player, this.game));
            }
        }

    }
}


