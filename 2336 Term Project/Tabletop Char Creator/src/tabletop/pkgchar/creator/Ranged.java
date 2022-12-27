//Sub Class of Weapons. Inherits functions and variables. Is used for ranged only weapons
package tabletop.pkgchar.creator;

public class Ranged extends Weapons
{
    private int Range; //creates a private variable to store the range value
    
    public void Ranged()  //Default constructor
    {
        Range = 0;
    }
    
    public int getRange() //get function for ranged
    {
        return Range;
    }
    
    public void heavyCrossbow() //Sets all the variables in Weapons and Ranged with the values of Heavy Crossbow. Also prints those values to the console
    {
        setName("Heavy Crossbow");
        setDamage(50);
        setCritValue(2);
        Range = 120;
        
        System.out.print("Weapon Name: " + getName() + "\n");
        System.out.print("Damage Value: " + getDamage() + "\n");
        System.out.print("Critical Hit Chance: x" + getCritValue() + "\n");
        System.out.print("Range: " + Range + " ft.\n");
    }
    
    public void shortBow() //Sets all the variables in Weapons and Ranged with the values of Short Bow. Also prints those values to the console
    {
        setName("Short Bow");
        setDamage(30);
        setCritValue(3);
        Range = 60;
        System.out.print("Weapon Name: " + getName() + "\n");
        System.out.print("Damage Value: " + getDamage() + "\n");
        System.out.print("Critical Hit Chance: x" + getCritValue() + "\n");
        System.out.print("Range: " + Range + " ft.\n");
    }
    
    public void lightCrossbow() //Sets all the variables in Weapons and Ranged with the values of Light Crossbow. Also prints those values to the console
    {
        setName("Light Crossbow");
        setDamage(40);
        setCritValue(2);
        Range = 80;
        System.out.print("Weapon Name: " + getName() + "\n");
        System.out.print("Damage Value: " + getDamage() + "\n");
        System.out.print("Critical Hit Chance: x" + getCritValue() + "\n");
        System.out.print("Range: " + Range + " ft.\n");
    }
    
    public void longBow() //Sets all the variables in Weapons and Ranged with the values of Long Bow. Also prints those values to the console
    {
        setName("Long Bow");
        setDamage(40);
        setCritValue(3);
        Range = 100;
        System.out.print("Weapon Name: " + getName() + "\n");
        System.out.print("Damage Value: " + getDamage() + "\n");
        System.out.print("Critical Hit Chance: x" + getCritValue() + "\n");
        System.out.print("Range: " + Range + " ft.\n");
    }
    
    public void repeatingCrossbow() //Sets all the variables in Weapons and Ranged with the values of Repeating Crossbow. Also prints those values to the console
    {
        setName("Repeatin Crossbow");
        setDamage(25);
        setCritValue(2);
        Range = 100;
        System.out.print("Weapon Name: " + getName() + "\n");
        System.out.print("Damage Value: " + getDamage() + "\n");
        System.out.print("Critical Hit Chance: x" + getCritValue() + "\n");
        System.out.print("Range: " + Range + " ft.\n");
    }
    
    
    
}
