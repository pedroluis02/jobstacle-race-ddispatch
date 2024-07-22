package com.github.pedroluis02.rdd.visitorpattern;

public class FreeBlock extends VpObject {
    public FreeBlock() {
        super("Free block");
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    protected void acceptVisitor(ObjectVisitor visitor) {
        visitor.visit(this);
    }
}
