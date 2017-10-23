package Enemy.GrassEnemy;

import Player.Player;
import TitleScreen.Game;

public class Bat extends GrassEnemy {

    public Bat( Player player, Game game) {
        super(player, game);
        this.maxHP = 50 + (player.getLevel() * 10);
        this.maxMP = 20 + (player.getLevel() * 5);
        this.currentHP = this.maxHP;
        this.currentMP = this.maxMP;
        this.attack = 5 + player.getLevel();
        this.defense = 5 + player.getLevel();
        this.shell = 2 + player.getLevel();
        this.magic = 2 + player.getLevel();
        this.name = "Bat";
    }

    @Override
    public void magic() {
        int leech = this.getRandom().nextInt(-((this.getAttack() + 5) - (this.getAttack() - 5) + 1) + this.getAttack() - 5);
        this.getPlayer().setCurrentHp(-leech);
        setCurrentHP(leech);
    }
}
