package tabledrivenmethods;

public class LifePack extends TdmObject {
    private final int quantity;

    public LifePack(int quantity) {
        super("Life Pack");
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return getName() + " (lives=" + getQuantity() + ")";
    }

    @Override
    protected void registerCollisions() {
        addCollisionWith(RaceCar.class, this::collideWithCar);
    }

    private void collideWithCar(RaceCar object) {
        System.out.println(getName() + " was found by " + object);
    }
}
