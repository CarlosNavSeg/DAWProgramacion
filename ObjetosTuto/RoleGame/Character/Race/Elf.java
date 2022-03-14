package Race;
import Stat.CharacterStats;
import Stat.Constitution;
import Stat.Dexterity;
import Stat.Intelligence;
public class Elf extends Race {

    @Override
    public int modifier(CharacterStats stat) {
            if(stat instanceof Dexterity) {
                return stat.getValue() + 3;
            }
            else if(stat instanceof Constitution) {
                return stat.getValue() - 1;
            }
            else if (stat instanceof Intelligence) {
                return stat.getValue() + 3;
            }
            return 0;
    }
    
}
