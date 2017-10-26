package Enemy;

import Enemy.CritterEnemy.Bat;
import Enemy.CritterEnemy.Millipede;
import Enemy.CritterEnemy.Rat;
import Enemy.CritterEnemy.Squirrel;
import TitleScreen.Game;
import Player.Player;
import Enemy.ENUMYRoom;

import java.util.Random;
import java.util.Set;


public class EnemyFactory {
    Set<String> shell;

    public Enemy makeEnemy(ENUMYRoom type, int enumSize, Player player, Game game) {

        Random random = new Random();

        int rand = random.nextInt(enumSize);

        if (type.getName().equals("Grass")) {
            switch (rand) {
                case 0:
                    return new Bat(player, game, type);
                case 1:
                    return new Millipede(player, game, type);
                case 2:
                    return new Rat(player, game, type);
                case 3:
                    return new Squirrel(player, game, type);
            }

        }
        return null;
    }
}





        /*Attempting to use reflection to add new enemy based only on the ENUMYRoom string name given by the room
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


