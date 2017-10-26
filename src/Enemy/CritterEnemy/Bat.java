package Enemy.CritterEnemy;

import Enemy.ENUMYRoom;
import Enemy.EnemyAttacks.Magic.GreenMagic1;
import Player.Player;
import TitleScreen.Game;

public class Bat extends CritterEnemy implements GreenMagic1 {
    public static int enemyCount = 1;

    public Bat(Player player, Game game, ENUMYRoom enumy) {
        super(player, game, enumy);
        enemyCount = 1;
        if (enemyCount > 1) {
            this.name = "Bat " + enemyCount;
        } else {
            this.name = "Bat";
        }
        this.shell.add("fire");
        enemyCount++;
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
        for (int i = 30; i > 0; i--) {
            try {
                player.setCurrentHp(-5);
                thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
