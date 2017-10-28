

package Player;


import Enemy.Enemy;
import Items.Item;
import TitleScreen.Game;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Player {
    private Game game;
    private Enemy e;
    private String name;
    private String playerClass;
    private int maxHP;
    private int maxMP;
    private int currentMP;
    private int currentHP;
    private int intellect;
    private int strength;
    private int agility;
    private int defense;
    private int shell;
    private int level;
    private int currentXP;
    private int maxXP;
    private int gold;
    private int positionX;
    private int positionY;
    private Set<Item> inventory;
    private Random random;
    private Boolean isCrit;

    public Player(String name, String playerClass, Game game) {
        this.inventory = new HashSet<Item>();
        this.game = game;
        this.random = new Random();
        this.name = name;
        this.level = 1;
        this.currentXP = 0;
        this.maxXP = 100;
        this.maxMP = 100;
        this.maxHP = 100;
        this.currentHP = this.maxHP;
        this.currentMP = this.maxMP;
        this.playerClass = playerClass;
        this.defense = 0;
        this.shell = 0;
        this.isCrit = false;
        switch (playerClass) {
            case "RadioButton[id=wizard, styleClass=radio-button]'Wizard'":
                this.intellect = 30;
                this.strength = 10;
                this.agility = 10;
            case "RadioButton[id=warrior, styleClass=radio-button]'Warrior'":
                this.intellect = 10;
                this.strength = 30;
                this.agility = 10;

            case "RadioButton[id=rogue, styleClass=radio-button]'rogue'":
                this.intellect = 10;
                this.strength = 10;
                this.agility = 30;
        }
    }

    public void attack(Enemy e) {
        int attack = random.nextInt((this.strength + this.level * 5) - (this.strength - this.level * 5) + 1
                + this.strength - this.level * 5);

        if (random.nextInt((100 - 0) - 0) < this.agility) {
            isCrit = true;
            attack = attack * 2;
        }

        e.setCurrentHP(-attack);

        if (isCrit) {
            game.outputScreen((this.name + " critted " + e.getName() + " for " + attack + " damage."));
        } else {
            game.outputScreen((this.name + " attacked " + e.getName() + " for " + attack) + " damage.");
        }
        isCrit = false;
    }

    public void removeInventory(Item item) {
        for (Item i : this.inventory) {
            if (i.equals(item)) {
                i.setQuantity(-1);
            }
        }
    }

    public void addToInventory(Item item) {
        if(!this.inventory.isEmpty()) {
            for (Item i : this.inventory) {
                if (i.equals(item)) {
                    if(i.getQuantity() + item.getQuantity() > i.getMaxQuantity()){
                        i.setQuantity(i.getMaxQuantity());
                    } else {
                        System.out.println("adding to inventory");
                        i.setQuantity(item.getQuantity());
                    }
                } else {
                    this.inventory.add(item);
                    System.out.println("new item");
                }
            }

        } else if(this.inventory.isEmpty()){
            this.inventory.add(item);
        }
    }

    public Item getInventoryItem(String name){
        for(Item i : inventory){
            if(i.getName().equals(name)){
                return i;
            }
        }
        return null;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPosition(int x, int y) {
        this.positionX += x;
        this.positionY += y;
    }

    public void setStartingPosition(int x, int y) {
        this.positionX = x;
        this.positionY = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    public int getMaxHP() {
        return this.maxHP;
    }

    public void setMaxHP(int hp) {
        this.maxHP += hp;
    }

    public int getMaxMP() {
        return this.maxMP;
    }

    public void setMaxMP(int mp) {
        this.maxMP += mp;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect += intellect;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        strength += strength;
    }

    public String toString() {
        return getName();
    }

    public int getCurrentMP() {
        return this.currentMP;
    }

    public int getCurrentHP() {
        return this.currentHP;
    }

    public void setCurrentMp(int currentMp) {

        this.currentMP += currentMp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHP += currentHp;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility += agility;
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

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level += level;
    }

    public int getCurrentXP() {
        return currentXP;
    }

    public void setCurrentXP(int currentXP) {
        this.currentXP += currentXP;
    }

    public int getMaxXP() {
        return maxXP;
    }

    public void setMaxXP(int maxXP) {
        this.maxXP += maxXP;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public Set<Item> getInventory() {
        return inventory;
    }


}
