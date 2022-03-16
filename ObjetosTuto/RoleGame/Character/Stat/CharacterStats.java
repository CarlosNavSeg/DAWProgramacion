package RoleGame.Character.Stat;


public abstract class CharacterStats {
    private int value = 0;

    public CharacterStats(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public void increase() {
        value++;
    }
    public void decrease() {
        value--;
    }
    @Override
    public String toString() {
        return "CharacterStats [value=" + value + "]";
    }
    
}