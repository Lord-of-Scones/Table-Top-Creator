/*Character class used for storing, reading, and displaying Character stats and traits */


package tabletop.pkgchar.creator;
import java.util.Scanner;

public class Character 
{
    private int Charisma;  //Decleration of all of the variables used in this class
    private int Dexterity;
    private int Strength;
    private int Intelligence;
    private int Wisdom;
    private int Constitution;
    private int NumOfAttacks;
    private String[] Attacks; //Decleration of a string array used to hold the attacks known
    private String Name;
    private String Race;
    private String Job;
    private double Height;
    private double Weight;
    private int Age;
    private String hairColor;
    private String eyeColor;
    private String skinTone;
    
    private Scanner input = new Scanner(System.in); //Scanner decleration
        
    public void Character()  //Default Constructor
    {
        Charisma = 0;
        Dexterity = 0;
        Strength = 0;
        Intelligence = 0;
        Wisdom = 0;
        Constitution = 0;
        NumOfAttacks = 0;
        Attacks = new String[NumOfAttacks];
        
    }
     
    //Overloaded constructor that sets the stat values to the values passed in by main
    public void Character(int Charisma, int Dexterity, int Intelligence, int Strength, int Wisdom, int Constitution, int NumOfAttacks) 
    {
        this.Charisma = Charisma;
        this.Dexterity = Dexterity;
        this.Intelligence = Intelligence;
        this.Strength = Strength;
        this.Wisdom = Wisdom;
        this.Constitution = Constitution;
        this.NumOfAttacks = NumOfAttacks;
        Attacks = new String[NumOfAttacks]; //Sets the size of the attacks array equal to the number of attacks the user says their character knows
    }
    
    //Overloaded constuctor used to set the character trait variables equal to the values passed in by the user.
    public void Character(String Name, String Race, String Job, double Height, double Weight, int Age, String hairColor, String eyeColor, String skinTone)
    {
        this.Name = Name;
        this.Race = Race;
        this.Job = Job;
        this.Height = Height;
        this.Weight = Weight;
        this.Age = Age;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.skinTone = skinTone;
    } 
    
    //Collection of getters and setters for every variable in the class
    public int getCharisma()
    {
        return Charisma;
    }
          
    public int getDexterity()
    {
        return Dexterity;
    }
          
    public int getStrength()
    {
        return Strength;
    }
          
    public int getIntelligence()
    {
        return Intelligence;
    }
          
    public int getWisdom()
    {
        return Wisdom;
    }
          
    public int getConstitution()
    {
        return Constitution;
    }
          
    public int getNumOfAttacks()
    {
        return NumOfAttacks;
    }
          
    public String getAttackAt(int AttackValue) // getter that returns the attack at the location of the array decided by the function calling it
    {
        return Attacks[AttackValue];
    }
          
    public void setCharisma(int v1)
    {
        Charisma = v1;
    }
          
    public void setDexterity(int v1)
    {
        Dexterity = v1;
    }
          
    public void setIntelligence(int v1)
    {
        Intelligence = v1;
    }
          
    public void setStrength(int v1)
    {
        Strength = v1;
    }
          
    public void setWisdom(int v1)
    {
        Wisdom = v1;
    }
          
    public void setConstitution(int v1)
    {
        Constitution = v1;
    }
          
    public void setNumOfAttacks(int v1)
    {
        NumOfAttacks = v1;
    }
          
    public void setAttacks(String[] PassedValues) //Setter that sets the attack array equal to the attacks stored in the passed in array
    {
        for(int i = 0; i < NumOfAttacks; i++)
        {
            Attacks[i] = PassedValues[i];
        }
    }
    
    public String getName()
    {
        return Name;
    }
    
    public String getRace()
    {
        return Race;
    }
    
    public String getJob()
    {
        return Job;
    }
    
    public double getHeight()
    {
        return Height;
    }
    
    public double getWeight()
    {
        return Weight;
    }
    
    public int getAge()
    {
        return Age;
    }
    
    public String getHair()
    {
        return hairColor;
    }
    
    public String getEye()
    {
        return eyeColor;
    }
    
    public String getSkin()
    {
        return skinTone;
    }
    
    public void setName(String Name)
    {
        this.Name = Name;
    }
    
    public void setRace(String Race)
    {
        this.Race = Race;
    }
    
    public void setJob(String Job)
    {
        this.Job = Job;
    }
    
    public void setHeight(double Height)
    {
        this.Height = Height;
    }
    
    public void setWeight(double Weight)
    {
        this.Weight = Weight;
    }
    
    public void setAge(int Age)
    {
        this.Age = Age;
    }
    
    public void setHair(String hairColor)
    {
        this.hairColor = hairColor;
    }
    
    public void setEye(String eyeColor)
    {
        this.eyeColor = eyeColor;
    }
    
    public void setSkin(String skinTone)
    {
        this.skinTone = skinTone;
    }
    
    public int getModCha() //specical set of getters created so that Main can have access to the modifiers for file writing purposes
    {
        StatModifires d1 = new StatModifires();

        d1.ModCalc(Charisma, Dexterity, Intelligence, Strength, Wisdom, Constitution);

        return(d1.getChaMod());
    }
    
    public int getModDex()
    {
        StatModifires d1 = new StatModifires();

        d1.ModCalc(Charisma, Dexterity, Intelligence, Strength, Wisdom, Constitution);

        return(d1.getDexMod());
    }
    
    public int getModInt()
    {
        StatModifires d1 = new StatModifires();

        d1.ModCalc(Charisma, Dexterity, Intelligence, Strength, Wisdom, Constitution);

        return(d1.getIntMod());
    }
    
    public int getModStr()
    {
        StatModifires d1 = new StatModifires();

        d1.ModCalc(Charisma, Dexterity, Intelligence, Strength, Wisdom, Constitution);

        return(d1.getStrMod());
    }
    
    public int getModWis()
    {
        StatModifires d1 = new StatModifires();

        d1.ModCalc(Charisma, Dexterity, Intelligence, Strength, Wisdom, Constitution);

        return(d1.getWisMod());
    }
    
    public int getModCon()
    {
        StatModifires d1 = new StatModifires();

        d1.ModCalc(Charisma, Dexterity, Intelligence, Strength, Wisdom, Constitution);

        return(d1.getConMod());
    }
    
    public void displayTraits() //Function that prints all of the character traits to the console
    {
        System.out.print("\n\nName: " + Name);
        System.out.print("\nRace: " + Race);
        System.out.print("\nClass: " + Job);
        System.out.print("\nHeight: " + Height + " inches");
        System.out.print("\nWeight: " + Weight + " lbs");
        System.out.print("\nAge: " + Age + " years old");
        System.out.print("\nHair color: " + hairColor);
        System.out.print("\nEye color: " + eyeColor);
        System.out.print("\nSkin Tone: " + skinTone + "\n\n");
    }
    
    public int recursiveArraySet(int counter) //Recursive function that reads in attacks inputted by the user and stores them in the attack array 
    {                                         //while continuning to ask the user to enter attacks until they have hit their attack limit

        if(counter < NumOfAttacks) //Recursive base case
        {
            Attacks[counter] = input.nextLine();
            if(counter < (getNumOfAttacks() - 1)) //Reminds the user of the ammount of attacks that the character can learn
            {
                System.out.println("\nOkay! Remeber your character can only learn " + (getNumOfAttacks() - (counter + 1)) + " more attacks!");
            }
            else
            {
                System.out.println("\nOkay! That's all the attacks that your character can learn!"); //Informs the user that the character cannot learn anymore attacks
            }
            
        }
        else
        {
            return 0;
        }
        return (recursiveArraySet(counter + 1));// recursive call
    }
    
    public void displayStatsandMods() //Function used to print the stat values and modifier values to the console
    {
        StatModifires d1 = new StatModifires();
        
        d1.ModCalc(Charisma, Dexterity, Intelligence, Strength, Wisdom, Constitution);//calls the aggragated class to calculate the stat modifier values
        
        if(d1.getChaMod() >= 0) // Set of if statement that alter the output based on wether the modifier is positive or negative
        {
            System.out.print("\nCHA: " + Charisma + " with a modifier of +" + d1.getChaMod() + "\n");
        }
        else
        {
            System.out.print("\nCHA: " + Charisma + " with a modifier of " + d1.getChaMod() + "\n");
        }
        
        if(d1.getDexMod() >= 0)
        {
            System.out.print("DEX: " + Dexterity + " with a modifier of +" + d1.getDexMod() + "\n");
        }
        else
        {
            System.out.print("DEX: " + Dexterity + " with a modifier of " + d1.getDexMod() + "\n");
        }
        
        if(d1.getIntMod() >= 0)
        {
            System.out.print("INT: " + Intelligence + " with a modifier of +" + d1.getIntMod() + "\n");
        }
        else
        {
            System.out.print("INT: " + Intelligence + " with a modifier of " + d1.getIntMod() + "\n");
        }
        
        if(d1.getStrMod() >= 0)
        {
            System.out.print("STR: " + Strength + " with a modifier of +" + d1.getStrMod() + "\n");
        }
        else
        {
            System.out.print("STR: " + Strength + " with a modifier of " + d1.getStrMod() + "\n");
        }
        
        if(d1.getWisMod() >= 0)
        {
            System.out.print("WIS: " + Wisdom + " with a modifier of +" + d1.getWisMod() + "\n");
        }
        else
        {
            System.out.print("WIS: " + Wisdom + " with a modifier of " + d1.getWisMod() + "\n");
        }
        
        if(d1.getConMod() >= 0)
        {
            System.out.print("CON: " + Constitution + " with a modifier of +" + d1.getConMod() + "\n\n");
        }
        else
        {
            System.out.print("CON: " + Constitution + " with a modifier of " + d1.getConMod() + "\n\n");
        }
        

    }
    
    public void displayAttacks()//Function that displays the attacks stored in the attack array using a set of for loops and prints them to the console
    {                           //If statements are to make sure the console output is gramatically correct.
            for(int x = 0; x < getNumOfAttacks(); x++)
            {
                if((x == (getNumOfAttacks() - 1)) && ((getNumOfAttacks() - 1) > 1))
                {
                    System.out.print("and ");
                }

                System.out.print(getAttackAt(x));

                if(x < (getNumOfAttacks() - 1))
                {
                    if(getNumOfAttacks() == 2)
                    {
                        System.out.print(" and ");
                    }
                    else
                    {
                        System.out.print(", ");
                    }
                }
                else if(x == (getNumOfAttacks() - 1))
                {
                    System.out.print(".\n\n");
                }
            }
    }
}

