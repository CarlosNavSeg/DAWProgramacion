package RoleGame.Character.Race;
import RoleGame.Character.Stat.*;
public class Human extends Race {

    @Override
    public int modifier(CharacterStats stat) {
            if(stat instanceof Strength) {
                return stat.getValue() + 2;
            }
            else if(stat instanceof Constitution) {
                return stat.getValue() + 2;
            }
            else if (stat instanceof Dexterity) {
                return stat.getValue() + 1;
            }
            return stat.getValue();
    }
    
}
