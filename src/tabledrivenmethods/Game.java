package tabledrivenmethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Game {

    RaceCar car;
    List <GameObject> objects;

    public Game() {
        init();
    }

    private void init() {
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

    public void start() {
        System.out.println("Race starting: " + car + "\n");
        final Iterator<GameObject> it = objects.iterator();
        do {
            GameObject d = it.next();
            car.collideWith(d);
            d.collideWith(car);
        } while (it.hasNext());
        System.out.println("\nRace ending: " + car);
    }

}
