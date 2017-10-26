package Enemy.CritterEnemy;

import Enemy.Enemy;
import Player.Player;
import TitleScreen.Game;
import Enemy.ENUMYRoom;

public abstract class CritterEnemy extends Enemy {


    public CritterEnemy(Player player, Game game, ENUMYRoom enumy) {
        super(player, game, enumy);
        this.maxLevel = 10;
        this.defense = 10;

        if (this.player.getLevel() <= getMaxLevel()) {
            this.level = this.player.getLevel();
        } else {
            this.level = getMaxLevel();
        }

        this.maxHP = this.level * 50 + this.enumy.getLevel() * 50;
        this.maxMP = this.level * 25 + this.enumy.getLevel() * 25;

        this.currentHP = this.maxHP;
        this.currentMP = this.maxMP;
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
