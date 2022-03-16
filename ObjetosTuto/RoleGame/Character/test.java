package RoleGame.Character;
import RoleGame.Character.Race.*;
import RoleGame.Item.Food.Apple;
import RoleGame.Item.Food.Chicken;
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
    RoleGame.Item.Food.Chicken ap = new Chicken();
    gCharacter.consumes(ap);
    }
  
    
}
