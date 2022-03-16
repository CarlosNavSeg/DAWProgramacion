package RoleGame.Character;
import RoleGame.Character.Race.*;
import RoleGame.Character.GameCharacter.Character;
import RoleGame.Character.Job.Mage;
public class test {
    public static void main(String[] args) {
    String name = "Caudiel";
    Orc orco = new Orc();
    Mage mage = new Mage();
    Character gCharacter = new Character(name, mage, orco);
    System.out.println(gCharacter.toString());
    gCharacter.receivesDamage(35);
    }
  
    
}
