package Tema5.RoleGame.Item.Food;

import RoleGame.Character.GameCharacter.Character;

public class Pork extends Food {

    public Pork() {
        power = 30;
    }

    @Override
    public void consumedBy(Character character) {
        character.heals(power);
    }
    
}
