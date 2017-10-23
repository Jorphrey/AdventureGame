package Enemy.GrassEnemy;

import Player.Player;
import TitleScreen.Game;

public class Rat extends GrassEnemy {


    public Rat(Player player, Game game) {
        super(player, game);
        this.maxHP = 40 + (player.getLevel() * 10);
        this.maxMP = 100 + (player.getLevel() * 5);
        this.currentHP = this.maxHP;
        this.currentMP = this.maxMP;
        this.attack = 5 + player.getLevel();
        this.defense = 5 + player.getLevel();
        this.shell = 2 + player.getLevel();
        this.magic = 2 + player.getLevel();
        this.name = "Rat";

    }
}

