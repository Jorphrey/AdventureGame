package Enemy.ForestEnemy;

import Enemy.Enemy;
import Player.Player;
import TitleScreen.Game;

public abstract class ForestEnemy extends Enemy {

    public ForestEnemy(String name, Player player, int healthMod, int magicMod, Game game) {
        super(name, player, healthMod, magicMod, game);
    }
}
