package Enemy;

import Abilities.Ability;
import Inventory.Inventory;
import Items.Item;
import Items.LootFactory;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public abstract class Enemy {
    private Ability mAbility;
    protected String mName;
    protected int mMaxLevel;
    protected ENUMYRoom mEnumy;
    protected Set<String> mShell;
    protected int mDefense;
    protected int mMaxHP;
    protected int mMaxMP;
    protected int mCurrentHP;
    protected int mCurrentMP;
    protected int mAttackPower;
    protected Random random;
    protected int mGold;
    protected int mLevel;
    protected Inventory mLoot;


    protected Set<Item> loot;
    private LootFactory lootFactory;


    public Enemy() {
        mAbility = new Ability();
        mShell = new HashSet<>();
        random = new Random();
        mAttackPower = random.nextInt(((mLevel * 10 + 5) - (mLevel * 10 - 5) + 1) + mLevel * 10 - 5);
        lootFactory = new LootFactory();
        mGold = random.nextInt((mLevel * 10 - this.mLevel * 5 + 1) + this.mLevel * 5);
        mLoot = lootFactory.getLoot(this);

    }

    public String toString() {
        return this.mName;
    }

    public String getmName() {
        return mName;
    }

    public int getmMaxLevel() {
        return mMaxLevel;
    }

    public ENUMYRoom getEnumyRoom() {
        return this.mEnumy;
    }

    public Set<String> getShell() {
        return mShell;
    }

    public int getDefense() {
        return mDefense;
    }

    public int getMaxHP() {
        return mMaxHP;
    }

    public int getMaxMP() {
        return mMaxMP;
    }

    public int getCurrentHP() {
        return mCurrentHP;
    }

    public void setCurrentHP(int mCurrentHP) {
        this.mCurrentHP = mCurrentHP;
    }

    public int getCurrentMP() {
        return mCurrentMP;
    }

    public int getAttackPower() {
        return mAttackPower;
    }

    public int getGold() {
        return mGold;
    }

    public int getLevel() {
        return mLevel;
    }

}
