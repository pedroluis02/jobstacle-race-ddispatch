package com.github.pedroluis02.rdd.tabledrivenmethods;

@FunctionalInterface
public interface CollisionMethod<T> {
    void collideWith(T object);
}
