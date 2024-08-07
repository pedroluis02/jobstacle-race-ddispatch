package com.github.pedroluis02.rdd.tabledrivenmethods;

public class Obstacle extends TdmObject {
    private final int damage;

    public Obstacle(String name, int damage) {
        super(name);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return getName() + " (damage=" + getDamage() + ")";
    }

    @Override
    protected void registerCollisions() {
        addCollisionWith(RaceCar.class, this::collideWithCar);
    }

    private void collideWithCar(RaceCar object) {
        System.out.println(getName() + " was crashed by " + object);
    }
}
