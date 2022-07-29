package tabledrivenmethods;

public class RaceCar extends TdmObject {
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
    protected void registerCollisions() {
        addCollisionWith(FreeBlock.class, this::collideWithFreeBock);
        addCollisionWith(LifePack.class, this::collideWithLifePack);
        addCollisionWith(Obstacle.class, this::collideWithObstacle);
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