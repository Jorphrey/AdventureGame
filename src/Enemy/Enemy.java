package Enemy;

import Items.Item;
import Items.LootFactory;
import Player.Player;
import TitleScreen.Game;

import java.util.List;
import java.util.Random;

public abstract class Enemy {
    protected int level;
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
    protected ENUMYTYPE enumytype;
    protected List<Item> loot;
    private LootFactory lootFactory;


    public Enemy(Player player, Game game) {
        lootFactory = new LootFactory();
        this.game = game;
        random = new Random();
        this.player = player;
        this.gold = random.nextInt(((player.getLevel()*10) + player.getLevel()*5 ) -
                ((player.getLevel()*10 - player.getLevel()*5) + player.getLevel()*10 - player.getLevel()*5));
        this.loot = lootFactory.getLoot(this);
        this.level = player.getLevel();
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
