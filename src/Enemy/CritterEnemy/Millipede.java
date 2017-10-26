package Enemy.CritterEnemy;

import Enemy.ENUMYRoom;
import Player.Player;
import TitleScreen.Game;

public class Millipede extends CritterEnemy {
    public static int enemyCount = 1;

    public Millipede(Player player, Game game, ENUMYRoom enumy) {
        super(player, game, enumy);
        if (enemyCount > 1) {
            this.name = "Millipede " + enemyCount;
        } else {
            this.name = "Millipede";
        }
        this.shell.add("fire");
    }
}


