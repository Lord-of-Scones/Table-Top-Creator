//Character Creator Program
//By John Philippi
// CS 2336 Section 001
//Term Project
//This is a program that allows the user to create a table top game character and export said character to a .txt file. It makes use of inheritence, aggregation, recursion, and file I/O to 
//let the user enter a plethora of traits and information about the character they want to make.

package tabletop.pkgchar.creator;

import java.io.FileNotFoundException;
import java.io.FileWriter; //Base file writing function
import java.io.IOException;
import java.util.Scanner; //Java scanner input
import java.io.BufferedWriter; //Import used to allow me to write new lines to a file

public class TabletopCharCreator {
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException //Main
    { 
        int count = 0,CharismaIn, DexterityIn, IntelligenceIn, StrengthIn, WisdomIn, ConstitutionIn, NumOfAttacksIn, weaponChoice = 0, AgeIn, test, num = 0, MenuChoice;
        String weaponType = null, NameIn, RaceIn, JobIn, hairColorIn, eyeColorIn, skinToneIn, Space;
        double HeightIn, WeightIn;
        
        Scanner input = new Scanner(System.in);//Creates a scanner
        Character c1 = new Character(); //Creates objects for the classes used in main
        Ranged r1 = new Ranged();
        Melee m1 = new Melee();
        
        System.out.print("Welcome to the Tabletop Character Creator!\n"); //Prints out the program menu
        System.out.print("******************************************************************************\n\n");
        System.out.print("Menu: \n\n");
        System.out.print("1. CREATE NEW CHARACTER\n\n");
        System.out.print("2. EXPORT CHARACTER\n\n");
        System.out.print("0. END PROGRAM\n\n");
        
        MenuChoice = IntCheck(); //Calls the input validation function while taking in the users menu input
        
        if(MenuChoice != 0) // If statement that continues the program as long as the user enetered anything other than zero
        {
            while(MenuChoice != 0) //while statement that keeps the program running infinately until the user enters zero to end it
            {
                
                switch (MenuChoice) //switch statement for the menu choices
                {
                    case 1: //First case Chararcter creating
                        
                        System.out.println("Welcome to the Character creator!");
                        System.out.print("Please enter your character's name: ");
                        if(count >= 1) //Gets rid of random newline trash that appears after more than one character has been created
                        {
                            input.nextLine();
                        }
                        NameIn = input.nextLine(); //Reads the input from the user into the name variable
                        
                        System.out.print("Please enter your character's Race: ");
                        RaceIn = input.nextLine(); //Reads the input from the user into the Race variable
                        
                        System.out.print("Please enter your character's Class: ");
                        JobIn = input.nextLine(); //Reads the input from the user into the Class(Job) variable
                        
                        System.out.print("Please enter your character's Height in inches: ");
                        HeightIn = DoubleCheck();//Reads the input from the user into the Height variable also calls the double validation function
                        
                        System.out.print("Please enter your character's Weight in Pounds: ");
                        WeightIn = DoubleCheck();//Reads the input from the user into the weight variable also calls the double validation function
                        
                        System.out.print("Please enter your character's Age: ");
                        AgeIn = IntCheck(); //Reads the input from the user into the Age variable also calls the Int validation function
                        
                        System.out.print("Please enter your character's Hair Color: ");
                        hairColorIn = input.nextLine();//Reads the input from the user into the Hair color variable
                        
                        System.out.print("Please enter your character's Eye Color: ");
                        eyeColorIn = input.nextLine();//Reads the input from the user into the Eye color variable
                        
                        System.out.print("Please enter your character's Skin Tone: ");
                        skinToneIn = input.nextLine();//Reads the input from the user into the Skin Tone variable
                        
                        //Calls Overloaded constructor that passes in all of the collected character trait values and sets them equal to the variables in the character class
                        c1.Character(NameIn, RaceIn, JobIn, HeightIn, WeightIn, AgeIn, hairColorIn, eyeColorIn, skinToneIn);
                        
                        System.out.print("\nOk! Now just Let me get your characters stats and attacks! \n\nWhat is their Charisma Value?\n");
                        CharismaIn = IntCheck(); //Reads the input from the user into the Charisma variable
                      
                        System.out.print("\nWhat is their Dexterity Value?\n");
                        DexterityIn = IntCheck();//Reads the input from the user into the Dexterity variable
                        
                        System.out.print("\nWhat is their Intelligence Value?\n");
                        IntelligenceIn = IntCheck(); //Reads the input from the user into the Intelligence variable
                        
                        System.out.print("\nWhat is their Strength Value?\n");
                        StrengthIn = IntCheck(); //Reads the input from the user into the Strength variable
                        
                        System.out.print("\nWhat is their Wisdom Value?\n");
                        WisdomIn = IntCheck(); //Reads the input from the user into the Wisdom variable
                        
                        System.out.print("\nWhat is their Constitution Value?\n");
                        ConstitutionIn = IntCheck(); //Reads the input from the user into the Constitution variable
                        
                        System.out.print("\nWhat is the number of attacks that they know?\n");
                        NumOfAttacksIn = IntCheck(); //Reads the input from the user into the Number of Attacks variable
                        
                        //Calls Overloaded constructor that passes in all of the collected character stat values and sets them equal to the variables in the character class
                        c1.Character(CharismaIn, DexterityIn, IntelligenceIn, StrengthIn, WisdomIn, ConstitutionIn, NumOfAttacksIn);
                        
                        if(NumOfAttacksIn != 0) //if statement that prompts user to enter the characters known attacks as long as they know at least 1
                        {
                            System.out.print("\nWhat attacks do they know?\n");
                        }
                        
                   
                        test = c1.recursiveArraySet(num); //Calls the recursive function that puts the attacks known into the attacks array in the character class
                        
                        System.out.print("\nWhat type of weapon do you want your character to have? Melee or Ranged?\n"); //Prompts the user to enter the type of weapon their character uses
                        
                        weaponType = input.next(); //Reads their answer into the weapon type variable
                        
                        //While statement that reprompts the user for a weapon value if they input an invalid value
                        while((!("melee".equals(weaponType.toLowerCase()))) && (!("ranged".equals(weaponType.toLowerCase())))) 
                        {
                            System.out.print("ERROR PLEASE INPUT A VALID OPTION\n\n");
                            System.out.print("What type of weapon do you want your character to have? Melee or Ranged?\n");
                            weaponType = input.next();
                        }
                        
                        if("melee".equals(weaponType.toLowerCase())) //If statement that prints the available weapons if the user chose the type melee
                        {
                            System.out.print("\nOK! Here are your options (enter the number of the one you want)\n");
                            System.out.print("1: Great Axe\n");
                            System.out.print("2: Short Sword\n");
                            System.out.print("3: Heavy Mace\n");
                            System.out.print("4: Glaive\n");
                            System.out.print("5: Great Sword\n");
                            do //Do while loop that prints the stats for the weapon the user chose as well as all the character traits of the users character
                            {
                                weaponChoice = IntCheck();
                                switch (weaponChoice) 
                                {
                                    case 1:

                                        c1.displayTraits();
                                        c1.displayStatsandMods();
                                        c1.displayAttacks();
                                        m1.greatAxe();

                                        break;
                                    case 2:

                                        c1.displayTraits();
                                        c1.displayStatsandMods();
                                        c1.displayAttacks();
                                        m1.shortSword();

                                        break;
                                    case 3:

                                        c1.displayTraits();
                                        c1.displayStatsandMods();
                                        c1.displayAttacks();
                                        m1.heavyMace();

                                        break;
                                    case 4:

                                        c1.displayTraits();
                                        c1.displayStatsandMods();
                                        c1.displayAttacks();
                                        m1.glaive();

                                        break;
                                    case 5:

                                        c1.displayTraits();
                                        c1.displayStatsandMods();
                                        c1.displayAttacks();
                                        m1.greatSword();

                                        break;
                                    default: //Default statement that reprompts the user if an invalid input was entered
                                        
                                        System.out.print("\nERROR PLEASE ENTER A VALID OPTION\n\n");
                                        System.out.print("OK! Here are your options (enter the number of the one you want)\n");
                                        System.out.print("1: Great Axe\n");
                                        System.out.print("2: Short Sword\n");
                                        System.out.print("3: Heavy Mace\n");
                                        System.out.print("4: Glaive\n");
                                        System.out.print("5: Great Sword\n");

                                        break;
                                        
                                }
                            }while(weaponChoice < 1 || weaponChoice > 5);  //while part of do while that keeps the statemet running as lon as the user has inputted a invalid value  
                        }
                        else if("ranged".equals(weaponType.toLowerCase())) //Same as above except output and options are based around the user chosing 'ranged' instead of 'melee'
                        {
                            System.out.print("\nOK! Here are your options (enter the number of the one you want)\n");
                            System.out.print("1: Heavy Crossbow\n");
                            System.out.print("2: Short Bow\n");
                            System.out.print("3: Light Crossbow\n");
                            System.out.print("4: Long Bow\n");
                            System.out.print("5: Repeating Crossbow\n");
                            
                            do
                            {
                                weaponChoice = IntCheck();
                                switch (weaponChoice) 
                                {
                                    case 1:

                                        c1.displayTraits();
                                        c1.displayStatsandMods();                         
                                        c1.displayAttacks();                           
                                        r1.heavyCrossbow();

                                        break;
                                    case 2:

                                        c1.displayTraits();
                                        c1.displayStatsandMods();
                                        c1.displayAttacks();
                                        r1.shortBow();

                                        break;
                                    case 3:

                                        c1.displayTraits();
                                        c1.displayStatsandMods();
                                        c1.displayAttacks();
                                        r1.lightCrossbow();

                                        break;
                                    case 4:

                                        c1.displayTraits();
                                        c1.displayStatsandMods();
                                        c1.displayAttacks();
                                        r1.longBow();

                                        break;
                                    case 5:

                                        c1.displayTraits();
                                        c1.displayStatsandMods();
                                        c1.displayAttacks();
                                        r1.repeatingCrossbow();

                                        break;
                                    default:
                                        System.out.print("\nERROR PLEASE ENTER A VALID OPTION\n\n");
                                        System.out.print("\nOK! Here are your options (enter the number of the one you want)\n");
                                        System.out.print("1: Heavy Crossbow\n");
                                        System.out.print("2: Short Bow\n");
                                        System.out.print("3: Light Crossbow\n");
                                        System.out.print("4: Long Bow\n");
                                        System.out.print("5: Repeating Crossbow\n");

                                        break;
                                }
                            }while(weaponChoice < 1 || weaponChoice > 5);    
                        }
                        count++; //Count statement that increases the value of the counter used to collect the trash value
                        break;
                    case 2:
                        
                        if(weaponType == null) //if statement that prevents the user from exporting a character before creating one
                        {
                            System.out.print("\nYOU MUST CREATE A CHARACTER FIRST!!\n");
                            break;
                        }
                        
                        FileWriter Fileout; //creates a file writer
                        String Filename; //creates the filename string variable
                        
                        Filename = (c1.getName() + ".txt"); //Sets the filename variable equal to the users character name + .txt
                        
                        Fileout = new FileWriter(Filename);  //Fully creates file writer
                        BufferedWriter WriteOut = new BufferedWriter(Fileout); //creates Buffered Writter
                        
                        WriteOut.write("Name: " + c1.getName()); //Set of output statements that print all of the character traits and stats to the newly created file
                        WriteOut.newLine();
                        WriteOut.newLine();
                        WriteOut.write("Race: " + c1.getRace());
                        WriteOut.newLine();
                        WriteOut.write("Class: " + c1.getJob());
                        WriteOut.newLine();
                        WriteOut.write("Height: " + c1.getHeight() + " inches");
                        WriteOut.newLine();
                        WriteOut.write("Weight: " + c1.getWeight() + " lbs");
                        WriteOut.newLine();
                        WriteOut.write("Age: " + c1.getAge());
                        WriteOut.newLine();
                        WriteOut.write("Hair: " + c1.getHair());
                        WriteOut.newLine();
                        WriteOut.write("Eyes: " + c1.getEye());
                        WriteOut.newLine();
                        WriteOut.write("Skin Tone: " + c1.getSkin());
                        WriteOut.newLine();
                        WriteOut.newLine();
                        
                        WriteOut.write("Cha: " + c1.getCharisma());
                        if(c1.getModCha() >= 0)  //If statement that edits the stat modifier output depending on wether or not the modifier is positive or negative
                        {
                            WriteOut.write(" +" + c1.getModCha());
                        }
                        else
                        {
                            WriteOut.write(" " + c1.getModCha());
                        }
                        WriteOut.newLine();
                        
                        WriteOut.write("Dex: " + c1.getDexterity());
                        if(c1.getModDex() >= 0)
                        {
                            WriteOut.write(" +" + c1.getModDex());
                        }
                        else
                        {
                            WriteOut.write(" " + c1.getModDex());
                        }
                        WriteOut.newLine();
                        
                        WriteOut.write("Int: " + c1.getIntelligence());
                        if(c1.getModInt() >= 0)
                        {
                            WriteOut.write(" +" + c1.getModInt());
                        }
                        else
                        {
                            WriteOut.write(" " + c1.getModInt());
                        }
                        WriteOut.newLine();
                        
                        WriteOut.write("Str: " + c1.getStrength());
                        if(c1.getModStr() >= 0)
                        {
                            WriteOut.write(" +" + c1.getModStr());
                        }
                        else
                        {
                            WriteOut.write(" " + c1.getModStr());
                        }
                        WriteOut.newLine();
                        
                        WriteOut.write("Wis: " + c1.getWisdom());
                        if(c1.getModWis() >= 0)
                        {
                            WriteOut.write(" +" + c1.getModWis());
                        }
                        else
                        {
                            WriteOut.write(" " + c1.getModWis());
                        }
                        WriteOut.newLine();
                        
                        WriteOut.write("Con: " + c1.getConstitution());
                        if(c1.getModCon() >= 0)
                        {
                            WriteOut.write(" +" + c1.getModCon());
                        }
                        else
                        {
                            WriteOut.write(" " + c1.getModCon());
                        }
                        WriteOut.newLine();
                        
                        WriteOut.write("Attacks: ");
                        
                        for(int x = 0; x < c1.getNumOfAttacks(); x++) //For loop that prints the attacks that are stored in the attacks array in the character class to a file
                        {
                            if((x == (c1.getNumOfAttacks() - 1)) && ((c1.getNumOfAttacks() - 1) > 1))
                            {
                                WriteOut.write("and ");
                            }

                            WriteOut.write(c1.getAttackAt(x));

                            if(x < (c1.getNumOfAttacks() - 1))
                            {
                                if(c1.getNumOfAttacks() == 2)
                                {
                                    WriteOut.write(" and ");
                                }
                                else
                                {
                                    WriteOut.write(", ");
                                }
                            }
                            else if(x == (c1.getNumOfAttacks() - 1))
                            {
                                WriteOut.newLine();
                                WriteOut.newLine();
                            }
                        }
                        if("melee".equals(weaponType.toLowerCase())) //Outputs the weapon info to a file based on what the user chose as their weapon earlier in the program 
                        {
                            WriteOut.write("Weapon Type: Melee");
                            WriteOut.newLine();
                            switch (weaponChoice) 
                                {
                                    case 1:
                                        WriteOut.write("Weapon: " + m1.getName());
                                        WriteOut.newLine();
                                        WriteOut.write("Damage Value: " + m1.getDamage());
                                        WriteOut.newLine();
                                        WriteOut.write("Crit Chance: " + m1.getCritValue() + " %");
                                        WriteOut.newLine();
                                        WriteOut.write("Chance to knockdown: " + m1.getknockdownChance() + " %");
                                        break;
                                    case 2:
                                        WriteOut.write("Weapon: " + m1.getName());
                                        WriteOut.newLine();
                                        WriteOut.write("Damage Value: " + m1.getDamage());
                                        WriteOut.newLine();
                                        WriteOut.write("Crit Chance: " + m1.getCritValue() + " %");
                                        WriteOut.newLine();
                                        WriteOut.write("Chance to knockdown: " + m1.getknockdownChance() + " %");
                                        break;
                                    case 3:
                                        WriteOut.write("Weapon: " + m1.getName());
                                        WriteOut.newLine();
                                        WriteOut.write("Damage Value: " + m1.getDamage());
                                        WriteOut.newLine();
                                        WriteOut.write("Crit Chance: " + m1.getCritValue() + " %");
                                        WriteOut.newLine();
                                        WriteOut.write("Chance to knockdown: " + m1.getknockdownChance() + " %");
                                        break;
                                    case 4:
                                        WriteOut.write("Weapon: " + m1.getName());
                                        WriteOut.newLine();
                                        WriteOut.write("Damage Value: " + m1.getDamage());
                                        WriteOut.newLine();
                                        WriteOut.write("Crit Chance: " + m1.getCritValue() + " %");
                                        WriteOut.newLine();
                                        WriteOut.write("Chance to knockdown: " + m1.getknockdownChance() + " %");
                                        break;
                                    case 5:
                                        WriteOut.write("Weapon: " + m1.getName());
                                        WriteOut.newLine();
                                        WriteOut.write("Damage Value: " + m1.getDamage());
                                        WriteOut.newLine();
                                        WriteOut.write("Crit Chance: " + m1.getCritValue() + " %");
                                        WriteOut.newLine();
                                        WriteOut.write("Chance to knockdown: " + m1.getknockdownChance() + " %");
                                        break;
                                }        
                        }
                        else if("ranged".equals(weaponType.toLowerCase()))
                        {
                            WriteOut.write("Weapon Type: Ranged");
                            WriteOut.newLine();
                            switch (weaponChoice) 
                                {
                                    case 1:
                                        WriteOut.write("Weapon: " + r1.getName());
                                        WriteOut.newLine();
                                        WriteOut.write("Damage Value: " + r1.getDamage());
                                        WriteOut.newLine();
                                        WriteOut.write("Crit Chance: " + r1.getCritValue() + " %");
                                        WriteOut.newLine();
                                        WriteOut.write("Weapon Range: " + r1.getRange() + " %");
                                        break;
                                    case 2:
                                        WriteOut.write("Weapon: " + r1.getName());
                                        WriteOut.newLine();
                                        WriteOut.write("Damage Value: " + r1.getDamage());
                                        WriteOut.newLine();
                                        WriteOut.write("Crit Chance: " + r1.getCritValue() + " %");
                                        WriteOut.newLine();
                                        WriteOut.write("Weapon Range: " + r1.getRange() + " %");
                                        break;
                                    case 3:
                                        WriteOut.write("Weapon: " + r1.getName());
                                        WriteOut.newLine();
                                        WriteOut.write("Damage Value: " + r1.getDamage());
                                        WriteOut.newLine();
                                        WriteOut.write("Crit Chance: " + r1.getCritValue() + " %");
                                        WriteOut.newLine();
                                        WriteOut.write("Weapon Range: " + r1.getRange() + " %");
                                        break;
                                    case 4:
                                        WriteOut.write("Weapon: " + r1.getName());
                                        WriteOut.newLine();
                                        WriteOut.write("Damage Value: " + r1.getDamage());
                                        WriteOut.newLine();
                                        WriteOut.write("Crit Chance: " + r1.getCritValue() + " %");
                                        WriteOut.newLine();
                                        WriteOut.write("Weapon Range: " + r1.getRange() + " %");
                                        break;
                                    case 5:
                                        WriteOut.write("Weapon: " + r1.getName());
                                        WriteOut.newLine();
                                        WriteOut.write("Damage Value: " + r1.getDamage());
                                        WriteOut.newLine();
                                        WriteOut.write("Crit Chance: " + r1.getCritValue() + " %");
                                        WriteOut.newLine();
                                        WriteOut.write("Weapon Range: " + r1.getRange() + " %");
                                        break;
                                }        
                        }
                        
                        WriteOut.close(); //Closes the file writer
                        System.out.print("\nYOUR CHARACTER HAS BEEN EXPORTED TO A .txt FILE!\n"); //Informs the user that the file has been exported to a file
                        break;
                    case 0:
                        break;
                    default:
                        System.out.print("ERROR THAT IS NOT A VALID OPTION! PLEASE ENTER A VALID CHOICE\n\n"); //Displays an error message if the user inputs an invalid menu choice
                        break;
                }
                //Repromts the user with the menu from the begining of the program     
                System.out.print("\n\nWelcome to the Tabletop Character Creator!\n");
                System.out.print("******************************************************************************\n\n");
                System.out.print("Menu: \n\n");
                System.out.print("1. CREATE NEW CHARACTER\n\n");
                System.out.print("2. EXPORT CHARACTER\n\n");
                System.out.print("0. END PROGRAM\n\n");

                MenuChoice = IntCheck();//Accepts the users input
                
                
            }        
        }    
    }
    
    public static int IntCheck() //Function that checks the validation of int variable input and makes sure they arent strings
    {
        int result = -1;
        boolean Val = true;//Used so that the program will still output a message stating that the value is invalid if it is an int but it is less than 0
        while(result < 0)
        {
            try
            {
                result = Integer.parseInt(new Scanner(System.in).nextLine()); //Throws a exception if the user enters a non int value
            }
            catch(NumberFormatException npe)
            {
                System.out.println("ERROR PLEASE ENTER A VALID OPTION!!!!"); //Tells the user an invalid input was entered if exception was thrown
                Val = false; 
            }
            if (result < 0 && Val == true)
            {
                System.out.println("ERROR PLEASE ENTER A VALID OPTION!!!!");
            }
            Val = true;
        }
        return result;
    }
    
    public static double DoubleCheck() //Same as above function but for double variables as opposed to ints 
    {
        double result = -1;
        boolean Val = true;
        while(result < 0)
        {
            try
            {
                result = Double.parseDouble(new Scanner(System.in).nextLine());
            }
            catch(NumberFormatException npe)
            {
                System.out.println("ERROR PLEASE ENTER A VALID OPTION!!!!");
                Val = false;
            }
            if (result < 0 && Val == true)
            {
                System.out.println("ERROR PLEASE ENTER A VALID OPTION!!!!");
            }
            Val = true;
        }
        return result;
    }
}
