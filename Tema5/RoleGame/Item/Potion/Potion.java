package Tema5.RoleGame.Item.Potion;

import RoleGame.Character.GameCharacter.Character;
import RoleGame.Item.IConsumeable;

public abstract class Potion implements IConsumeable{
    private int power;

    public Potion(int power){
        this.power = power;
    }

    public void consumedBy(Character character){
        character.heals(power);
    }
}

