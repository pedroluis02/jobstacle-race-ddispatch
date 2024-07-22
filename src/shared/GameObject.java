package shared;

public abstract class GameObject {
    private final String name;

    protected GameObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
