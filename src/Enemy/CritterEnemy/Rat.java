package Enemy.CritterEnemy;

import Enemy.ENUMYRoom;
import Player.Player;
import TitleScreen.Game;

public class Rat extends CritterEnemy {
    public static int enemyCount = 1;

    public Rat(Player player, Game game, ENUMYRoom enumy) {
        super(player, game, enumy);

        if (enemyCount > 1) {
            this.name = "Rat " + enemyCount;
        } else {
            this.name = "Rat";
        }
        this.shell.add("fire");
    }
}


