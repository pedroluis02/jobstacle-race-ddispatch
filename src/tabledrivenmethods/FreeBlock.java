package tabledrivenmethods;

public class FreeBlock extends GameObject {

    public FreeBlock() {
        super("Free block");
    }
    @Override
    protected void initCollisionMap() {
        addCollisionObject(RaceCar.class, this::collideWithCard);
    }

    private void collideWithCard(RaceCar object) {
        System.out.println(getName() + " was passed by " + object);
    }
}
