package Tema5.RoleGame.Character.Race;
import RoleGame.Character.Stat.*;
public class Orc extends Race {

    @Override
    public int modifier(CharacterStats stat) {
        if(stat instanceof Strength) {
            return stat.getValue() + 5;
        }
        else if(stat instanceof Constitution) {
            return stat.getValue() + 3;
        }
        else if (stat instanceof Intelligence) {
            return stat.getValue() - 3;
        }
        return 0;
    }

    @Override
    public String toString() {
        return getClass().getName();
    }
}
