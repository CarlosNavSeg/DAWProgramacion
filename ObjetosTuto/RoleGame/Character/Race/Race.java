package Race;

import Stat.CharacterStats;

public abstract class Race {
    public abstract int modifier(CharacterStats stat);
    @Override
    public boolean equals(Object obj) {
        return obj.equals(Race.class);
    }
    @Override
    public String toString() {
        return "Race []";
    }
    
}
