package Enemy.BasicEnemy;

import Enemy.Enemy;
import Player.Player;
import TitleScreen.Game;

public class Rat extends BasicEnemy {


    public Rat(String name, Player player, int healthMod, int magicMod, Game game) {
        super(name, player, healthMod, magicMod, game);
    }
}

