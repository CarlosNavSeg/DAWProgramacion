package Tema5.RoleGame.Item.Food;

import RoleGame.Character.GameCharacter.Character;

public class Chicken extends Food {
    public Chicken() {
        power = 25;
    }
    @Override
    public void consumedBy(Character character) {
        character.heals(power);
    }
    
}
