//Sub Class of Weapons. Inherits functions and variables. Is used for melee only weapons

package tabletop.pkgchar.creator;

public class Melee extends Weapons
{
    private int knockdownChance;  //creates a private variable to store the Knockdown Chance value
    
    public void Melee () //Default constructor
    {
        knockdownChance = 0;
    }
    
    public int getknockdownChance() //get function for Knockdown Chance
    {
        return knockdownChance;
    }
    
    public void greatAxe()  //Sets all the variables in Weapons and Melee with the values of Great Axe. Also prints those values to the console
    {
        setName("Great Axe");
        setDamage(60);
        setCritValue(3);
        knockdownChance = 60;
        
        System.out.print("Weapon Name: " + getName() + "\n");
        System.out.print("Damage Value: " + getDamage() + "\n");
        System.out.print("Critical Hit Chance: x" + getCritValue() + "\n");
        System.out.print("Knockdown Chance: " + knockdownChance + "%\n");
    }
    
    public void shortSword() //Sets all the variables in Weapons and Melee with the values of Short Sword. Also prints those values to the console
    {
        setName("Short Sword");
        setDamage(30);
        setCritValue(2);
        knockdownChance = 20;
        
        System.out.print("Weapon Name: " + getName() + "\n");
        System.out.print("Damage Value: " + getDamage() + "\n");
        System.out.print("Critical Hit Chance: x" + getCritValue() + "\n");
        System.out.print("Knockdown Chance: " + knockdownChance + "%\n");
    }
    
    public void heavyMace() //Sets all the variables in Weapons and Melee with the values of Heavy Mace. Also prints those values to the console
    {
        setName("Heavy Mace");
        setDamage(40);
        setCritValue(2);
        knockdownChance = 50;
        
        System.out.print("Weapon Name: " + getName() + "\n");
        System.out.print("Damage Value: " + getDamage() + "\n");
        System.out.print("Critical Hit Chance: x" + getCritValue() + "\n");
        System.out.print("Knockdown Chance: " + knockdownChance + "%\n");
    }
    
    public void glaive() //Sets all the variables in Weapons and Melee with the values of Glaive. Also prints those values to the console
    {
        setName("Glaive");
        setDamage(50);
        setCritValue(3);
        knockdownChance = 20;
        
        System.out.print("Weapon Name: " + getName() + "\n");
        System.out.print("Damage Value: " + getDamage() + "\n");
        System.out.print("Critical Hit Chance: x" + getCritValue() + "\n");
        System.out.print("Knockdown Chance: " + knockdownChance + "%\n");
    }
    
    public void greatSword() //Sets all the variables in Weapons and Melee with the values of Great Sword. Also prints those values to the console
    {
        setName("Great Sword");
        setDamage(60);
        setCritValue(2);
        knockdownChance = 60;
        
        System.out.print("Weapon Name: " + getName() + "\n");
        System.out.print("Damage Value: " + getDamage() + "\n");
        System.out.print("Critical Hit Chance: x" + getCritValue() + "\n");
        System.out.print("Knockdown Chance: " + knockdownChance + "%\n");
    }
    
}
