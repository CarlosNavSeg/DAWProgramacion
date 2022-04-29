package RoleGame.Item.Food;

public class Enchanced extends Decorator {

    public Enchanced(Food dFood) {
        super(dFood);
        dFood.power = this.dFood.getPower();
        dFood.power = dFood.getPower()*2;
    }
    
}
