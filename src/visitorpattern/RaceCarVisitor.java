package visitorpattern;

public class RaceCarVisitor implements ObjectVisitor {
    final private RaceCar car;
    private int lives;
    private int damage;

    RaceCarVisitor(RaceCar car, int lives) {
        this.car = car;
        this.lives = lives;
        this.damage = 0;
    }

    @Override
    public String toString() {
        return car + " (lives=" + lives + ")";
    }

    @Override
    public void visit(FreeBlock object) {
        System.out.println("Continue: " + object + ", " + this);
    }

    @Override
    public void visit(LifePack object) {
        lives += object.getQuantity();
        System.out.println("Good Luck: " + object + ", " + this);
    }

    @Override
    public void visit(Obstacle object) {
        int d = object.getDamage();
        lives -= d;
        damage += d;

        System.out.println("Crashed: " + object+ ", " + this);
    }

    @Override
    public void visit(RaceCar object) {
        damage += 1;
        System.out.println("Crashed: " + object + ", " + this);
    }
}
