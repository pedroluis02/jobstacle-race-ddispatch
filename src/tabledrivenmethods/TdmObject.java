package tabledrivenmethods;

import shared.GameObject;

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

    public <T extends TdmObject> void collideWith(T otherObject) /*throws Exception*/ {
        CollisionMethod<T> handler = (CollisionMethod<T>) collisionMap.get(otherObject.getClass());
        if (handler != null) {
            handler.collideWith(otherObject);
        } else {
            String message = "Undefined method for " + otherObject.getClass().getName();
            //throw new Exception(message);
            System.out.println(message);
        }
    }
}
