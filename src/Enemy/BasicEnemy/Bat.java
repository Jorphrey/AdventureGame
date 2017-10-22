package Enemy.BasicEnemy;

import Enemy.Enemy;
import Player.Player;

public class Bat extends BasicEnemy {

    public Bat(String name, Player player, int hp, int mp) {
        super(name, player, hp, mp);

    }

    @Override
    public void magic() {
        int leech = this.getRandom().nextInt(-((this.getAttack() + 5) - (this.getAttack() - 5)) - this.getAttack() - 5);
        this.getPlayer().setCurrentHp(-leech);
        setCurrentHP(leech);
    }
}
