package RoleGame.Item.Food;

import RoleGame.Character.GameCharacter.Character;

public class GoldenApple extends Food {

    public GoldenApple() {
        power = 50;
    }

    @Override
    public void consumedBy(Character character) {
        character.heals(power);
    }
    
}
