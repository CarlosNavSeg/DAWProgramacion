package Race;
import Stat.CharacterStats;
import Stat.Constitution;
import Stat.Intelligence;
import Stat.Strength;
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
}
