package com.github.pedroluis02.rdd.tabledrivenmethods;

import com.github.pedroluis02.rdd.shared.Game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TdmGame implements Game {
    RaceCar car;
    List<TdmObject> objects;

    public TdmGame() {
        init();
    }

    @Override
    public void init() {
        car = new RaceCar("Lightning McQueen", 2);
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
        System.out.println("Race starting: " + car + "\n");
        final Iterator<TdmObject> it = objects.iterator();
        do {
            TdmObject d = it.next();
            car.collideWith(d);
            d.collideWith(car);
        } while (it.hasNext());
        System.out.println("\nRace ending: " + car);
    }
}
