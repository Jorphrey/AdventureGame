package Enemy.GrassEnemy;

import Enemy.ENUMYTYPE;
import Player.Player;
import TitleScreen.Game;

import java.util.HashSet;

public class Squirrel extends GrassEnemy {


    public Squirrel(Player player, Game game, int maxLevel, ENUMYTYPE enumy, HashSet<String> shell, int defense) {
        super(player, game, maxLevel, enumy, shell, defense);
        this.name = "Squirrel";
    }
}

