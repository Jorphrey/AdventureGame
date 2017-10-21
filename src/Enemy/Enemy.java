package Enemy;

import Items.Item;

import java.util.List;
import java.util.Random;

public abstract class Enemy {
    private int hp;
    private int mp;
    private int attack;
    private int defense;
    private int shell;
    private int gold;
    private Random random;
    private List<Item> loot;

    public Enemy(int hp, int mp, int attack, int defense){

        this.hp = hp;
        this.mp = mp;
        this.attack = attack;
        this.defense = defense;

    }

    public abstract void attack();
    public abstract void defend();
    public abstract void magic();

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp += mp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack += attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense += defense;
    }

    public int getShell() {
        return shell;
    }

    public void setShell(int shell) {
        this.shell += shell;
    }

    public Random getRandom() {
        return random;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public List<Item> getLoot() {
        return loot;
    }

    public void setLoot(List<Item> loot) {
        this.loot = loot;
    }
}
