package Enemy;

import Items.Item;
import Items.LootFactory;
import Player.Player;
import TitleScreen.Game;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public abstract class Enemy {
    protected String name;
    protected Player player;
    protected Game game;
    protected int maxLevel;
    protected ENUMYRoom enumy;
    protected Set<String> shell;
    protected int defense;
    protected int maxHP;
    protected int maxMP;
    protected int currentHP;
    protected int currentMP;
    protected int attackPower;
    protected Random random;
    protected int gold;
    protected int level;


    protected Set<Item> loot;
    private LootFactory lootFactory;


    public Enemy(Player player, Game game, ENUMYRoom enumy) {
        this.player = player;
        this.game = game;
        this.enumy = enumy;
        this.shell = new HashSet<>();




        random = new Random();

        this.attackPower = random.nextInt(((this.level * 10 + 5) - (this.level * 10 - 5) + 1) + this.level * 10 - 5);
        lootFactory = new LootFactory();

        this.gold = random.nextInt((this.level * 10 - this.level * 5 + 1) + this.level * 5);
        this.loot = lootFactory.getLoot();

    }

    public abstract void attack();

    public abstract void defend();

    public String toString() {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    public ENUMYRoom getEnumyRoom() {
        return this.enumy;
    }

    public void setEnumy(ENUMYRoom enumy) {
        this.enumy = enumy;
    }

    public Set<String> getShell() {
        return shell;
    }

    public void setShell(HashSet<String> shell) {
        this.shell = shell;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getMaxMP() {
        return maxMP;
    }

    public void setMaxMP(int maxMP) {
        this.maxMP = maxMP;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public int getCurrentMP() {
        return currentMP;
    }

    public void setCurrentMP(int currentMP) {
        this.currentMP = currentMP;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Set<Item> getLoot() {
        return loot;
    }

    public void setLoot(Set<Item> loot) {
        this.loot = loot;
    }


}
