package RoleGame.Item.Food;

import RoleGame.Character.GameCharacter.Character;

public class Apple extends Food {

    public Apple() {
        power = 5;
    }
    @Override
    public void consumedBy(Character character) {
        character.heals(power);
    }
    
}
