package Enemy.GrassEnemy;

import Enemy.ENUMYTYPE;
import Enemy.EnemyAttacks.Magic.GreenMagic1;
import Player.Player;
import TitleScreen.Game;

import java.util.HashSet;
import java.util.Set;

public class Bat extends GrassEnemy implements GreenMagic1{

    public Bat(Player player, Game game, ENUMYTYPE enumy) {
        super(player, game, enumy);
        this.shell = new HashSet<>();
        this.shell.add("fire");
        this.defense = 10;
        this.name = "Bat";
        this.maxLevel = 10;
    }


    @Override
    public void leech() {
        int leech = this.random.nextInt(-((this.attackPower + 5) - (this.attackPower - 5) + 1) + this.attackPower - 5);
        this.player.setCurrentHp(-leech);
        setCurrentHP(leech);

    }

    @Override
    public void venom() {
        Thread thread = new Thread();
        for(int i = 30; i > 0; i--){
            try {
                thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
