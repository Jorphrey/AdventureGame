package Enemy.GrassEnemy;

import Enemy.Enemy;
import Items.Item;
import Player.Player;
import TitleScreen.Game;
import Enemy.ENUMYTYPE;

import java.util.HashSet;
import java.util.List;
import java.util.Random;

public abstract class GrassEnemy extends Enemy {


    public GrassEnemy(Player player, Game game, ENUMYTYPE enumy) {
        super(player, game, enumy);

    }


    @Override
    public void attack() {
        player.setCurrentHp(-attackPower);
        game.outputScreen("\t" + this.name + " attacked " + player.getName() + " for " + attackPower + " damage.");
    }

    @Override
    public void defend() {
        this.defense += 10;
    }


}
