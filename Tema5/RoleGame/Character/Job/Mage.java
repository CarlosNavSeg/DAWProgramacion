package Tema5.RoleGame.Character.Job;
import RoleGame.Character.Stat.*;

public class Mage extends Job {

    @Override
    public int modifier(CharacterStats stat) {
        if(stat instanceof Intelligence) {
            return stat.getValue() + 4;
        }
        else if(stat instanceof Dexterity) {
            return stat.getValue() + 1;
        }
        return 0;
    }
}
