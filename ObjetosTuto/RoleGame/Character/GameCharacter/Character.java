package RoleGame.Character.GameCharacter;
import RoleGame.Character.IDamageable;
import RoleGame.Character.Job.*;
import RoleGame.Character.Stat.*;
import RoleGame.Character.Race.*;
public class Character implements IDamageable {
    private String name;
    private Job profesion;
    private Race raza;
    private Dexterity dex;
    private Intelligence intell;
    private Strength str;
    private Constitution constit;
    private double health;
    public Character(String name, Job profesion, Race raza) {
        this.name = name;
        this.profesion = profesion;
        this.raza = raza;
        dex = new Dexterity(5);
        intell = new Intelligence(5);
        str = new Strength(5);
        constit = new Constitution(5);
        health = health();
    }
    public String getName() {
        return name;
    }

    public Job getProfesion() {
        return profesion;
    }

    public Race getRaza() {
        return raza;
    }

    public double velocity() {
        return dex.getValue() + raza.modifier(dex) + profesion.modifier(dex) * 2; 
    }
    public double power() {
        return str.getValue() + raza.modifier(str) + profesion.modifier(str) * 2;
    }
    public double magic() {
        return intell.getValue() + raza.modifier(intell) + profesion.modifier(intell);
    }
    @Override
    public String toString() {
        return "My name is " + name + "." + " I am an "  + raza.toString() + " My stats are: Strength:" + power() + 
        " Dexterity:" + velocity() + " Constitution: " + constit.getValue() + " Intelligence:" + magic() + " Health: 125";
          
    }
    @Override
    public double maxHealth() {
        return health();
    }
    @Override
    public double health() {
        return 125;
    }
    @Override
    public boolean isDead() {
        return false;
    }
    @Override
    public void receivesDamage(double amount) {
        System.out.println(name + " recieved 35 damage. Health:" + (health-amount) + "/" + health);
        health = health-amount;
    }
    @Override
    public void heals(double amount) {
        
    }
    
}
