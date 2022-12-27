//Aggregated class of Character. Is passed the character stats and calculates their modifires
package tabletop.pkgchar.creator;

public class StatModifires 
{
    private int ChaMod; //Creates Variables to hold the Stat modifires after they are calculated
    private int DexMod;
    private int IntMod;
    private int StrMod;
    private int WisMod;
    private int ConMod;
    
    public StatModifires() //Default Constuctor
    {
        ChaMod = 0;
        DexMod = 0;
        IntMod = 0;
        StrMod = 0;
        WisMod = 0;
        ConMod = 0;
    }
    
    public void ModCalc(int v1, int v2, int v3, int v4, int v5, int v6) //Overloaded constructor that is passed in Stat values and uses those values to 
    {                                                                   //Calculate and store the stat modifires

        ChaMod = (v1 - 10)/2;
        DexMod = (v2 - 10)/2;
        IntMod = (v3 - 10)/2;
        StrMod = (v4 - 10)/2;
        WisMod = (v5 - 10)/2;
        ConMod = (v6 - 10)/2;
        
    }
    
    public int getChaMod() //Get function for Charisma modifier
    {
        return ChaMod;
    }
    
    public int getDexMod() //Get function for Dexterity modifier
    {
        return DexMod;
    }
    
    public int getIntMod() //Get function for Intelligence modifier
    {
        return IntMod;
    }
    
    public int getStrMod() //Get function for Strength modifier
    {
        return StrMod;
    }
    
    public int getWisMod() //Get function for Wisdom modifier
    {
        return WisMod;
    }
    
    public int getConMod() //Get function for Constitution modifier
    {
        return ConMod;
    }
}
