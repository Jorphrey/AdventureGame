

package Player;


import Items.Item;

import java.util.List;

public class Player {
    private String name;
    private String playerClass;
    private int maxHp;
    private int maxMp;
    private int currentMp;
    private int currentHp;
    private int intellect;
    private int strength;
    private int agility;
    private int defense;
    private int shell;
    private int level;
    private int currentXP;
    private int maxXP;
    private int gold;
    private List<Item> inventory;

    public Player(String name, String playerClass) {
        this.name = name;
        this.level = 1;
        this.currentXP = 50;
        this.maxHp = 100;
        this.maxMp = 100;
        this.maxHp = 100;
        this.currentHp = 50;
        this.currentMp = 50;
        this.playerClass = playerClass;
        this.defense = 0;
        this.shell = 0;
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
                this.agility = 10;
        }
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

    public int getMaxHp() {
        return this.maxHp;
    }

    public void setMaxHp(int hp) {
        this.maxHp += hp;
    }

    public int getMaxMp() {
        return this.maxMp;
    }

    public void setMaxMp(int mp) {
        this.maxMp += mp;
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

    public int getCurrentMp() {
        return this.currentMp;
    }

    public int getCurrentHp() {
        return this.currentHp;
    }

    public void setCurrentMp(int currentMp) {

        this.currentMp += currentMp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp += currentHp;
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
        return level;
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

    public List<Item> getInventory() {
        return inventory;
    }


}
