package tabledrivenmethods;

import shared.Game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TdmGame implements Game {
    RaceCar car;
    List <TdmObject> objects;

    public TdmGame() {
        init();
    }

    @Override
    public void init() {
        car = new RaceCar("Lightning McQueen", 2);
        objects = new ArrayList<>() {{
            add(new FreeBlock());
            add(new Obstacle("Rock", 1));
            add(new LifePack(1));
            add(new FreeBlock());
            add(new Obstacle("Garbage", 1));
            add(new FreeBlock());
        }};
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
