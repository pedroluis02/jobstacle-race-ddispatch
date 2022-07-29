package visitorpattern;

public class LifePack extends VpObject {
    private final int quantity;

    public LifePack(int quantity) {
        super("Life Pack");
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return getName() + " (lives=" + getQuantity() + ")";
    }

    @Override
    protected void acceptVisitor(ObjectVisitor visitor) {
        visitor.visit(this);
    }
}
