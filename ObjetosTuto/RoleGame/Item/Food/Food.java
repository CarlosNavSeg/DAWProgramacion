package RoleGame.Item.Food;

import RoleGame.Character.GameCharacter.Character;
import RoleGame.Item.IConsumeable;

public abstract class Food implements IConsumeable {
    double power;

    public double getPower() {
        return power;
    }
    
    public void consumedBy(Character character) {
        character.heals(power);
    }
}
