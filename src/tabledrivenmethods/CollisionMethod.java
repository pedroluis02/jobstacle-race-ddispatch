package tabledrivenmethods;

@FunctionalInterface
public interface CollisionMethod<T> {
    void collideWith(T object);
}
