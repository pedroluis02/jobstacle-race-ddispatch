package com.github.pedroluis02.rdd.visitorpattern;

public class RaceCarVisitor implements ObjectVisitor {
    private final RaceCar car;
    private int lives;

    RaceCarVisitor(RaceCar car, int lives) {
        this.car = car;
        this.lives = lives;
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

        System.out.println("Crashed: " + object + ", " + this);
    }

    @Override
    public void visit(RaceCar object) {
        System.out.println("Crashed: " + object + ", " + this);
    }
}
