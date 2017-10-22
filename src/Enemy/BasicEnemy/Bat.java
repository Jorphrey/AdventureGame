package Enemy.BasicEnemy;

import Enemy.Enemy;
import Player.Player;
import TitleScreen.Game;

public class Bat extends BasicEnemy {

    public Bat(String name, Player player, int healthMod, int magicMod, Game game) {
        super(name, player, healthMod, magicMod, game);

    }

    @Override
    public void magic() {
        int leech = this.getRandom().nextInt(-((this.getAttack() + 5) - (this.getAttack() - 5) + 1) + this.getAttack() - 5);
        this.getPlayer().setCurrentHp(-leech);
        setCurrentHP(leech);
    }
}
