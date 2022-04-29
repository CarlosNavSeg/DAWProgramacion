package RoleGame.Item.Food;

import RoleGame.Item.IConsumeable;

public abstract class Decorator extends Food {
    Food dFood;
    public Decorator (Food newFood) {
        dFood = newFood;
    }

}
