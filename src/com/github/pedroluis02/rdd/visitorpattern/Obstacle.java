package com.github.pedroluis02.rdd.visitorpattern;

public class Obstacle extends VpObject {
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
    protected void acceptVisitor(ObjectVisitor visitor) {
        visitor.visit(this);
    }
}
