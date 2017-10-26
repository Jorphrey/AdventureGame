package Enemy.ForestEnemy;

import Enemy.Enemy;
import Player.Player;
import TitleScreen.Game;
import Enemy.ENUMYRoom;

public abstract class ForestEnemy extends Enemy {


    public ForestEnemy(Player player, Game game, ENUMYRoom enumy) {
        super(player, game, enumy);
    }
}

