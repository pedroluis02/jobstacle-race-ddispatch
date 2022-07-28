package tabledrivenmethods;

@FunctionalInterface
public interface CollitionHandler <T> {
    void collideWith(T object);
}
