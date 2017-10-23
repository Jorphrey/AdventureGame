package Enemy;

import Enemy.GrassEnemy.Bat;
import Enemy.GrassEnemy.Millipede;
import Enemy.GrassEnemy.Rat;
import Enemy.GrassEnemy.Squirrel;
import TitleScreen.Game;
import Player.Player;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;


public class EnemyFactory {


    public Enemy makeEnemy(ENUMYTYPE type, int enumSize, Player player, Game game) {

        Random random = new Random();
        int rand = random.nextInt(enumSize);

        if (type.getName().equals("Grass")) {
            switch (rand) {
                case 0:
                    return new Bat(player, game);
                case 1:
                    return new Millipede(player, game);
                case 2:
                    return new Rat(player, game);
                case 3:
                    return new Squirrel(player, game);
            }

        }
        return null;
    }
}





        /*Attempting to use reflection to add new enemy based only on the ENUMYTYPE string name given by the room
          room that is creating the enemy.
          Will try to implement in the future

        String enumeName = type.values()[rand].name();

        try {
            return (Enemy) Class.forName(enumeName).getConstructor(String.class).newInstance(player, game);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

         */


