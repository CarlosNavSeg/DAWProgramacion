package Tema5.RoleGame.Character.Job;

import RoleGame.Character.Stat.*;

public class Assasin extends Job {

    @Override
    public int modifier(CharacterStats stat) {
        if(stat instanceof Strength) {
            return stat.getValue() + 1;
        }
        else if(stat instanceof Dexterity) {
            return stat.getValue() + 3;
        }
        else if(stat instanceof Constitution) {
            return stat.getValue() + 1;
        }
        return 0;
    }
    
}
