package com.github.pedroluis02.rdd.visitorpattern;

import com.github.pedroluis02.rdd.shared.Game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VpGame implements Game {
    RaceCar car;
    List<VpObject> objects;

    public VpGame() {
        init();
    }

    @Override
    public void init() {
        car = new RaceCar("Lightning McQueen");
        objects = new ArrayList<>();
        objects.add(new FreeBlock());
        objects.add(new Obstacle("Rock", 1));
        objects.add(new LifePack(1));
        objects.add(new FreeBlock());
        objects.add(new Obstacle("Garbage", 1));
        objects.add(new FreeBlock());
    }

    @Override
    public void start() {
        ObjectVisitor visitor = new RaceCarVisitor(car, 2);
        System.out.println("Race starting: " + visitor + "\n");

        final Iterator<VpObject> it = objects.iterator();
        do {
            VpObject d = it.next();
            d.acceptVisitor(visitor);
        } while (it.hasNext());
        System.out.println("\nRace ending: " + visitor);
    }
}
