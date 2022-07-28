package tabledrivenmethods;

import java.util.HashMap;
import java.util.Map;

public abstract class GameObject {
    private final String name;
   private final Map<Class<? extends GameObject>, CollitionHandler<? extends GameObject>> collisionMap;

   public GameObject(String name) {
       this.name = name;

       collisionMap= new HashMap<>();
       initCollisionMap();
   }

    public String getName() {
        return name;
    }

    protected void initCollisionMap() {}

    public <T extends GameObject> void addCollisionObject(Class<T> c,  CollitionHandler<T> f) {
        collisionMap.put(c, f);
    }

    public <T extends GameObject>  void collideWith(T otherObject) /*throws Exception*/ {
        CollitionHandler<T> handler = (CollitionHandler<T>) collisionMap.get(otherObject.getClass());
        if (handler != null) {
            handler.collideWith(otherObject);
        } else {
            String message = "Undefined method for " + otherObject.getClass().getName();
            //throw new Exception(message);
            System.out.println(message);
        }
    }
}
