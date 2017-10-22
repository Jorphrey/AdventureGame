package Enemy.BasicEnemy;

import Enemy.Enemy;
import Items.Item;
import Player.Player;


import java.util.List;
import java.util.Random;

public abstract class BasicEnemy<T> extends Enemy{
    private int magic;
    private int maxHP;
    private int maxMP;
    private int currentHP;
    private int currentMP;
    private int attack;
    private int defense;
    private int shell;
    private Random random;
    private List<Item> loot;

    public BasicEnemy(String name, Player player, int healthMod, int magicMod) {
        super(name, player, healthMod, magicMod);
        this.maxHP = healthMod + (player.getLevel() * 10);
        this.maxMP = magicMod + (player.getLevel() * 5);
        this.currentHP = this.maxHP;
        this.currentMP = this.maxMP;
        this.attack = healthMod/10 + player.getLevel();
        this.defense = healthMod/10 + player.getLevel();
        this.shell = magicMod/10 + player.getLevel();
        this.magic = magicMod/10 + player.getLevel();

        this.random = new Random();

    }

    @Override
    public void attack() {
        player.setCurrentHp(random.nextInt(-(this.attack + 7 - this.attack - 7) - this.attack - 7));
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
        if(this.currentHP + currentHP > this.maxHP){
            this.currentHP = this.maxHP;
        }else {
            this.currentHP += currentHP;
        }
    }
}
