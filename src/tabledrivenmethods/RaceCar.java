package tabledrivenmethods;

import java.util.HashMap;
import java.util.Map;

public class RaceCar extends GameObject {

    private int lives;
    private int damage;

    public RaceCar(String name, int lives) {
        super(name);
        this.lives = lives;
        this.damage = 0;
    }

    @Override
    public String toString() {
        return getName() + " (lives=" + lives + ")";
    }

    @Override
    public void initCollisionMap() {
        addCollisionObject(FreeBlock.class, this::collideWithFreeBock);
        addCollisionObject(LifePack.class, this::collideWithLifePack);
        addCollisionObject(Obstacle.class, this::collideWithObstacle);
    }

    private void collideWithFreeBock(FreeBlock object) {
        System.out.println(object.getName() + " passed");
    }

    private void collideWithLifePack(LifePack object) {
        lives += object.getQuantity();
        System.out.println("Good Luck: " + object);
    }
    private void collideWithObstacle(Obstacle object) {
        int d = object.getDamage();
        lives -= d;
        damage += d;

        System.out.println("Crashed: " + object);
    }

}