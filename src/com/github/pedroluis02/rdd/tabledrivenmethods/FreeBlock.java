package com.github.pedroluis02.rdd.tabledrivenmethods;

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
        addCollisionWith(RaceCar.class, this::collideWithCar);
    }

    private void collideWithCar(RaceCar object) {
        System.out.println(getName() + " was passed by " + object);
    }
}
