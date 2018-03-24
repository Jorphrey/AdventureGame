import Abilities.Ability;
import Inventory.Inventory;

import java.util.Random;

public abstract class InteractiveCharacter {
        protected Ability mAbility;
        private String name;
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

        public InteractiveCharacter() {
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
        }

    public String getName() {
        return name;
    }

    public int getmMaxHP() {
        return mMaxHP;
    }

    public int getmMaxMP() {
        return mMaxMP;
    }

    public int getmCurrentMP() {
        return mCurrentMP;
    }

    public int getmCurrentHP() {
        return mCurrentHP;
    }

    public int getmIntellect() {
        return mIntellect;
    }

    public int getmStrength() {
        return mStrength;
    }

    public int getmAgility() {
        return mAgility;
    }

    public int getmDefense() {
        return mDefense;
    }

    public int getmShell() {
        return mShell;
    }

    public int getmLevel() {
        return mLevel;
    }

    public int getmCurrentXP() {
        return mCurrentXP;
    }

    public int getmMaxXP() {
        return mMaxXP;
    }

    public int getmGold() {
        return mGold;
    }

    public int getmPositionX() {
        return mPositionX;
    }

    public int getmPositionY() {
        return mPositionY;
    }

    public Inventory getmInventory() {
        return mInventory;
    }

    public Random getmRandom() {
        return mRandom;
    }

    public Boolean getmIsCrit() {
        return mIsCrit;
    }
}
