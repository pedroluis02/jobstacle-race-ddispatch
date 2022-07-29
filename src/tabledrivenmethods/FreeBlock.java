package tabledrivenmethods;

public class FreeBlock extends TdmObject {
    public FreeBlock() {
        super("Free block");
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    protected void registerCollisions() {
        addCollisionWith(RaceCar.class, this::collideWithCard);
    }

    private void collideWithCard(RaceCar object) {
        System.out.println(getName() + " was passed by " + object);
    }
}
