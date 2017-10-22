package Enemy;

import Items.Item;
import Player.Player;
import TitleScreen.Game;

import java.util.List;
import java.util.Random;

public abstract class Enemy {
    protected Game game;
    protected boolean isAlive;
    protected int healthMod;
    protected int magicMod;
    protected int shell;
    protected int defense;
    protected int currentHP;
    protected int currentMP;
    protected int maxHP;
    protected int maxMP;
    protected String name;
    protected Player player;
    private Random random;
    protected int gold;


    public Enemy(String name, Player player, int healthMod, int magicMod, Game game) {
        this.game = game;
        this.healthMod = healthMod;
        this.magicMod = magicMod;
        random = new Random();
        this.name = name;
        this.player = player;
        this.gold = random.nextInt(((player.getLevel()*10) + player.getLevel()*5 ) -
                ((player.getLevel()*10 - player.getLevel()*5) + player.getLevel()*10 - player.getLevel()*5));
    }

    public abstract void attack();

    public abstract void defend();

    public abstract void magic();

    public String toString() {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public Player getPlayer() {
        return player;
    }

    public int getGold() {
        return gold;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public int getCurrentMP() {
        return currentMP;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getMaxMP() {
        return maxMP;
    }

    public int getShell() {
        return shell;
    }

    public int getDefense() {
        return defense;
    }

    public int getHealthMod() {
        return healthMod;
    }

    public int getMagicMod() {
        return magicMod;
    }

    public void setShell(int shell) {
        this.shell = shell;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP += currentHP;
    }

    public void setCurrentMP(int currentMP) {
        this.currentMP = currentMP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public void setMaxMP(int maxMP) {
        this.maxMP = maxMP;
    }
}
