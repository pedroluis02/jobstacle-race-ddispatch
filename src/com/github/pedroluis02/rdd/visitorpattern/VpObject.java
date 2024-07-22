package com.github.pedroluis02.rdd.visitorpattern;

import com.github.pedroluis02.rdd.shared.GameObject;

public abstract class VpObject extends GameObject {
    protected VpObject(String name) {
        super(name);
    }

    protected abstract void acceptVisitor(ObjectVisitor visitor);
}