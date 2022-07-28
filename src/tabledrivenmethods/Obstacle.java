package tabledrivenmethods;

public class Obstacle extends GameObject {

    private final int damage;

    public Obstacle(String name, int damage) {
        super(name);
        this.damage = damage;
    }

    @Override
    public String toString() {
        return getName() + " (damage=" + getDamage() + ")";
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void initCollisionMap() {
        addCollisionObject(RaceCar.class, this::collideWithCard);
    }

    private void collideWithCard(RaceCar object) {
        System.out.println(getName() + " was crashed by " + object);
    }
}
