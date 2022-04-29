package Tema5.RoleGame.Item.Food;

public class Poisonous extends Decorator {

    public Poisonous(Food dFood) {
        super(dFood);
        dFood.power = this.dFood.getPower();
        dFood.power = dFood.getPower()*2;
    }
    
}