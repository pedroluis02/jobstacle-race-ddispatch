package visitorpattern;

public class RaceCar extends VpObject {
    public RaceCar(String name) {
        super(name);
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