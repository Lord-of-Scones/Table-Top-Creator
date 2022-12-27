//Weapon class that stores the damage and crit values of all weapons. it is the super class of both Ranged and Melee

package tabletop.pkgchar.creator;

public class Weapons 
{
    private int Damage;  //Variables created to hold damage values and critical chances
    private int CritValue;
    
    private String Name; //Variable created to hold Name of the weapon
    
    public void Weapons() //Default Consructor
    {
        Damage = 0;
        CritValue = 0;
        Name = "N/A";
    }
    
    public void Weapons(int Damage, int CritValue, int Range, String Name) //Overloaded constructor that sets the class variables equal to the passed in variables
    {
        this.Damage = Damage;
        this.CritValue = CritValue;
        this.Name = Name;
    }
    
    public int getDamage() //Get function for Damage
    {
        return Damage;
    }
    
    public int getCritValue() //Get function for Critical Chance
    {
        return CritValue;
    }
    
    public String getName() //Get function for Name variable
    {
        return Name;
    }
    
    public void setDamage(int Damage) //Set function for Damage
    {
        this.Damage = Damage;
    }
    
    public void setCritValue(int CritValue) //Set function for Critical chance
    {
        this.CritValue = CritValue;
    }
    
    public void setName(String Name) //Set function for Name
    {
        this.Name = Name;
    }
}
