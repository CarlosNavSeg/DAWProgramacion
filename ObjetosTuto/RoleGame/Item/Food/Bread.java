package RoleGame.Item.Food;

import RoleGame.Character.GameCharacter.Character;

public class Bread extends Food {
    public Bread() {
        power = 10;
    }
    @Override
    public void consumedBy(Character character) {
        character.heals(power);
    }



}
