package Enemy.GrassEnemy;

import Enemy.Enemy;
import Items.Item;
import Player.Player;
import TitleScreen.Game;


import java.util.List;
import java.util.Random;

public abstract class GrassEnemy extends Enemy {
    protected int magic;
    protected int maxHP;
    protected int maxMP;
    protected int currentHP;
    protected int currentMP;
    protected int attack;
    protected int defense;
    protected int shell;
    private Random random;
    protected List<Item> loot;

    public GrassEnemy(Player player, Game game) {
        super( player, game);

    }

    @Override
    public void attack() {
        int attack = random.nextInt(((this.attack + 7) - (this.attack - 7) + 1) + this.attack - 7);
        player.setCurrentHp(-attack);
        game.outputScreen("\t" + getName() + " attacked " + player.getName() + " for " + attack + " damage.");
    }

    @Override
    public void defend() {
        this.defense += 10;
    }

    @Override
    public void magic() {

    }

    public Player getPlayer() {
        return player;
    }

    public String getName() {
        return name;
    }

    public int getMagic() {
        return magic;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getMaxMP() {
        return maxMP;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public int getCurrentMP() {
        return currentMP;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public Random getRandom() {
        return random;
    }

    public List<Item> getLoot() {
        return loot;
    }

    public int getShell() {
        return shell;
    }

    public void setCurrentHP(int currentHP) {
        if (this.currentHP + currentHP > this.maxHP) {
            this.currentHP = this.maxHP;
        } else {
            this.currentHP += currentHP;
        }
    }


}
