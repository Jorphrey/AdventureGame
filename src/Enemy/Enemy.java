package Enemy;

import java.util.Random;

public abstract class Enemy {
    private int hp;
    private int mp;
    private int attack;
    private int defense;
    private Random random;

    public Enemy(int hp, int mp, int attack, int defense){

        this.hp = hp;
        this.mp = mp;
        this.attack = attack;
        this.defense = defense;

    }

    public abstract void attack();
    public abstract void defend();
    public abstract void magic();


}
