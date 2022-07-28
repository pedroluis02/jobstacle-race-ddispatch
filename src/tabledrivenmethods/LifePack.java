package tabledrivenmethods;

public class LifePack extends GameObject {

    private final int quantity;

    public LifePack(int quantity) {
        super("Life Pack");

        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return getName() + " (lives=" + getQuantity() + ")";
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public void initCollisionMap() {
        addCollisionObject(RaceCar.class, this::collideWithCard);
    }

    private void collideWithCard(RaceCar object) {
        System.out.println(getName() + " was found by " + object);
    }
}
