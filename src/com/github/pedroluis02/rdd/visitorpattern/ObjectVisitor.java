package com.github.pedroluis02.rdd.visitorpattern;

public interface ObjectVisitor {
    void visit(FreeBlock object);

    void visit(LifePack object);

    void visit(Obstacle object);

    void visit(RaceCar object);
}
