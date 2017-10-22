package Enemy.ForestEnemy;

import Enemy.Enemy;
import Player.Player;

public abstract class ForestEnemy extends Enemy {

    public ForestEnemy(String name, Player player, int healthMod, int magicMod) {
        super(name, player, healthMod, magicMod);
    }
}
