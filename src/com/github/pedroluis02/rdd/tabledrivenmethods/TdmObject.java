package com.github.pedroluis02.rdd.tabledrivenmethods;

import com.github.pedroluis02.rdd.shared.GameObject;

import java.util.HashMap;
import java.util.Map;

public abstract class TdmObject extends GameObject {
    private final Map<Class<? extends TdmObject>, CollisionMethod<? extends TdmObject>> collisionMap;

    protected TdmObject(String name) {
        super(name);
        collisionMap = new HashMap<>();
        registerCollisions();
    }

    protected void registerCollisions() {
    }

    public <T extends TdmObject> void addCollisionWith(Class<T> objectsClass, CollisionMethod<T> objectMethod) {
        collisionMap.put(objectsClass, objectMethod);
    }

    public <T extends TdmObject> void collideWith(T otherObject) {
        CollisionMethod<? extends TdmObject> collisionMethod = collisionMap.get(otherObject.getClass());
        if (collisionMethod != null) {
            CollisionMethod<T> handler = (CollisionMethod<T>) collisionMethod;
            handler.collideWith(otherObject);
        } else {
            String message = "Undefined method for " + otherObject.getClass().getName();
            System.out.println(message);
        }
    }
}
