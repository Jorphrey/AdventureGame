package Enemy.GrassEnemy;

import Player.Player;
import TitleScreen.Game;

public class Squirrel extends GrassEnemy{
    public Squirrel(Player player, Game game) {
        super(player, game);
        this.maxHP = 30 + (player.getLevel() * 10);
        this.maxMP = 20 + (player.getLevel() * 5);
        this.currentHP = this.maxHP;
        this.currentMP = this.maxMP;
        this.attack = 5 + player.getLevel();
        this.defense = 5 + player.getLevel();
        this.shell = 2 + player.getLevel();
        this.magic = 2 + player.getLevel();
        this.name = "Squirrel";
    }
}
