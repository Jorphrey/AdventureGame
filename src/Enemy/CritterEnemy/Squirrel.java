package Enemy.CritterEnemy;

import Enemy.ENUMYRoom;
import Player.Player;
import TitleScreen.Game;

public class Squirrel extends CritterEnemy {
    public static int enemyCount = 1;


    public Squirrel(Player player, Game game, ENUMYRoom enumy) {
        super(player, game, enumy);

        if (enemyCount > 1) {
            this.name = "Squirrel " + enemyCount;
        } else {
            this.name = "Squirrel";
        }
        this.shell.add("fire");
    }
}

