package RoleGame.Character;
import RoleGame.Character.Race.*;
import RoleGame.Character.Stat.*;
public class test {
    public static void main(String[] args) {
    Human human1 = new Human();
    Dexterity dex = new Dexterity(0);
    human1.modifier(dex);
    Orc orco = new Orc();
    orco.toString();
    }
  
    
}
