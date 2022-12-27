# Table-Top-Creator
The purpose of this program is to allow tabletop game players to create a digitized .txt form of their character. This would allow them to be able to bring their character information around without having to carry a paper copy or worry about losing the sheet that the info is on.

The concepts I used are Aggregation, Inheritance, File I/O, and recursion.
Aggregation: The way this concept was used was to create an Aggregated Stat Modifier class that connected to the character class. This Stat Modifier class would allow the modifiers for all stats to be calculated automatically using the formula (STAT –  10)/2 rounded down.
Inheritance: The way this concept was used was to create a Super class called Weapons with 2 sub classes called Melee and Ranged. This Super class would hold the variables for the weapon name, crit value, and damage value while each sub class had their own special variable (Melee’s being Knockdown Chance and Ranged’s being Range).
File I/O: This was mainly used to allow the user to export their created character to a .txt file saved to their computer for later review and keeping.
Recursion: This was used to get the attacks known from the user and store it into a String array called attacks. The program would ask the user for the number of attacks the character can know and would then call the recursive method which would then prompt the user for the attacks names until the maximum attack amount was reached.
