package visitorpattern;

import shared.BaseGameObject;

public abstract class GameObject extends BaseGameObject {
    public GameObject(String name) {
        super(name);
    }

    protected abstract void acceptVisitor(ObjectVisitor visitor);
}