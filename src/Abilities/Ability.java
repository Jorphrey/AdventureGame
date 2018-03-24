package Abilities;

import Enemy.Enemy;
import Abilities.Attack.AttackBehavior;
import Abilities.Defense.DefenseBehavior;
import Abilities.Magic.MagicBehavior;

public abstract class Ability implements AttackBehavior, MagicBehavior, DefenseBehavior{
    private Enemy mEnemy;

    public Ability(Enemy enemy){
        mEnemy = enemy;
    }
}
