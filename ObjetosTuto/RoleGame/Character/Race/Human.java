package Race;
import Stat.CharacterStats;
import Stat.Constitution;
import Stat.Dexterity;
import Stat.Strength;
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
