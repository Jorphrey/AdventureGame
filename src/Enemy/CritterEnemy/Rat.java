package Enemy.GrassEnemy;

import Enemy.ENUMYTYPE;
import Player.Player;
import TitleScreen.Game;

import java.util.HashSet;

public class Rat extends GrassEnemy {


    public Rat(Player player, Game game, int maxLevel, ENUMYTYPE enumy, HashSet<String> shell, int defense) {
        super(player, game, maxLevel, enumy, shell, defense);
    }
}


