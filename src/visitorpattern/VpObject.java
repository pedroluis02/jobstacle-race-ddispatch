package visitorpattern;

import shared.GameObject;

public abstract class VpObject extends GameObject {
    public VpObject(String name) {
        super(name);
    }

    protected abstract void acceptVisitor(ObjectVisitor visitor);
}