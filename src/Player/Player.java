

package Player;


import Enemy.Enemy;
import Inventory.Inventory;
import Items.Item;
import java.util.Random;
import java.util.Set;

public class Player extends Interactive {
    private String mPlayerClass;
    private int mMaxHP;
    private int mMaxMP;
    private int mCurrentMP;
    private int mCurrentHP;
    private int mIntellect;
    private int mStrength;
    private int mAgility;
    private int mDefense;
    private int mShell;
    private int mLevel;
    private int mCurrentXP;
    private int mMaxXP;
    private int mGold;
    private int mPositionX;
    private int mPositionY;
    private Inventory mInventory;
    private Random mRandom;
    private Boolean mIsCrit;

    public Player(String name, String mPlayerClass) {
        super(name);
        this.mPlayerClass = mPlayerClass;
        mInventory = new Inventory();
        mRandom = new Random();
        mLevel = 1;
        mCurrentXP = 0;
        mMaxXP = 100;
        mMaxMP = 100;
        mMaxHP = 100;
        mCurrentHP = mMaxHP;
        mCurrentMP = mMaxMP;
        mDefense = 0;
        mShell = 0;
        mIsCrit = false;
        switch (mPlayerClass) {
            case "RadioButton[id=wizard, styleClass=radio-button]'Wizard'":
                mIntellect = 30;
                mStrength = 10;
                mAgility = 10;
            case "RadioButton[id=warrior, styleClass=radio-button]'Warrior'":
                mIntellect = 10;
                mStrength = 30;
                mAgility = 10;
            case "RadioButton[id=rogue, styleClass=radio-button]'rogue'":
                mIntellect = 10;
                mStrength = 10;
                mAgility = 30;
        }
    }

    public void playerInit(){

    }


    public void attack(Enemy e) {
        int attack = mRandom.nextInt((mStrength + mLevel * 5) - (mStrength - mLevel * 5) + 1
                + mStrength - mLevel * 5);

        if (mRandom.nextInt((100 - 0) - 0) < mAgility) {
            mIsCrit = true;
            attack = attack * 2;
        }

        e.setCurrentHP(-attack);

        if (mIsCrit) {
            game.outputScreen((name + " critted " + e.getName() + " for " + attack + " damage."));
        } else {
            game.outputScreen((name + " attacked " + e.getName() + " for " + attack) + " damage.");
        }
        mIsCrit = false;
    }



    public int getPositionX() {
        return mPositionX;
    }

    public int getPositionY() {
        return mPositionY;
    }

    public void setPosition(int x, int y) {
        mPositionX += x;
        mPositionY += y;
    }

    public void setStartingPosition(int x, int y) {
        mPositionX = x;
        mPositionY = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getmPlayerClass() {
        return mPlayerClass;
    }

    public void setmPlayerClass(String mPlayerClass) {
        mPlayerClass = mPlayerClass;
    }

    public int getmMaxHP() {
        return mMaxHP;
    }

    public void setmMaxHP(int hp) {
        mMaxHP += hp;
    }

    public int getmMaxMP() {
        return mMaxMP;
    }

    public void setmMaxMP(int mp) {
        mMaxMP += mp;
    }

    public int getmIntellect() {
        return mIntellect;
    }

    public void setmIntellect(int mIntellect) {
        mIntellect += mIntellect;
    }

    public int getmStrength() {
        return mStrength;
    }

    public void setmStrength(int mStrength) {
        mStrength += mStrength;
    }

    public String toString() {
        return getName();
    }

    public int getmCurrentMP() {
        return mCurrentMP;
    }

    public int getmCurrentHP() {
        return mCurrentHP;
    }

    public void setCurrentMp(int currentMp) {

        mCurrentMP += currentMp;
    }

    public void setCurrentHp(int currentHp) {
        mCurrentHP += currentHp;
    }

    public int getmAgility() {
        return mAgility;
    }

    public void setmAgility(int mAgility) {
        mAgility += mAgility;
    }

    public int getmDefense() {
        return mDefense;
    }

    public void setmDefense(int mDefense) {
        mDefense += mDefense;
    }

    public int getmShell() {
        return mShell;
    }

    public void setmShell(int mShell) {
        mShell += mShell;
    }

    public int getmLevel() {
        return mLevel;
    }

    public void setmLevel(int mLevel) {
        mLevel += mLevel;
    }

    public int getmCurrentXP() {
        return mCurrentXP;
    }

    public void setmCurrentXP(int mCurrentXP) {
        mCurrentXP += mCurrentXP;
    }

    public int getmMaxXP() {
        return mMaxXP;
    }

    public void setmMaxXP(int mMaxXP) {
        mMaxXP += mMaxXP;
    }

    public int getmGold() {
        return mGold;
    }

    public void setmGold(int mGold) {
        mGold = mGold;
    }

    public Set<Item> getmInventory() {
        return mInventory;
    }


}
