import java.util.Scanner;


public class RunCharacterCreator {
	
	//Declare Stat Variables
	
	public String ClassSelection;
	public String alignment;
	public String surges;

	public int strength;
	public int constitution;
	public int dexterity;
	public int intelligence;
	public int wisdom;
	public int charisma;
	public int HitPoints;
	
	public int PerLevel;
	
	
	public void StatSelection(){
		
		
		
				Scanner input3 = new Scanner (System.in);
				

				Scanner input4 = new Scanner(System.in);
				
				
	
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("It is time to select Ability Points. ");
	System.out.println("There are multiple ways one could do this: ");
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("");
	System.out.println("1) Take these numbers and apply them to your abilities any way you like. Keep in mind the class and race you are playing when you do this ");
	System.out.println("16, 14, 13, 12, 11, 10");
	System.out.println("");
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("2) This is more complicated, but can create a really good character ");
	System.out.println("Assign the numbers 8, 10, 10, 10, 10, 10 to whatever you want. You have 22 points to spend on improving them ");
	System.out.println("");

	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("3) This Method is not reccomended, because you almost always get the short end of the stick, but can be good if you roll high ");
	System.out.println("Roll 4 d6 and add up the highest 3 numbers. Do this six times and apply the numbers to your ability scores");
	System.out.println("");
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Enter your desired Strength score ");
	strength = input3.nextInt();
	
	System.out.println("Enter your desired Constitution score ");
	constitution = input3.nextInt();
	
	System.out.println("Enter your desired Dexterity score ");
	dexterity = input3.nextInt();
	
	System.out.println("Enter your desired Intelligence score ");
	intelligence = input3.nextInt();
	
	System.out.println("Enter your desired Wisdom score ");
	wisdom = input3.nextInt();
	
	System.out.println("Enter your desired Charisma score ");
	charisma = input3.nextInt();

	


	
	System.out.println("Enter Character Name: ");
	String name;
	name = input4.nextLine();
	
	System.out.println("Enter Character Alignment. Options are Lawful Good, Good, Neutral, Evil, Chaotic Evil: ");
	alignment = input4.nextLine();
	
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	
	System.out.println("Character Info");
	System.out.println("");
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Character Race: " + Races.RaceSelection);
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Character Class: " + ClassSelection);
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Character Name: " + name);
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Character Alignment: " + alignment);
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("");
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Character stats");
	System.out.println("");
	System.out.println("Character HP: " + (HitPoints + constitution));
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Hit points gained per level: " + PerLevel);
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Healing surges per day: " + surges);
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Character Strength: " + strength);
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Character Constitution: " + constitution);
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Character Dexterity: " + dexterity);
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Character Intelligence: " + intelligence);
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Character Wisdom: " + wisdom);
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Character Charisma: " + charisma);
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Character Speed: " + Races.speed);
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	input3.close();
input4.close();
	}
	

	
	
	public void ClassSelection(){
Classes selection = new Classes();
		Scanner input2 = new Scanner (System.in);
		int option2;

		System.out.println("Choose your character's class ");
		System.out.println("<1> Cleric");
		System.out.println("<2> Fighter");
		System.out.println("<3> Paladin");
		System.out.println("<4> Ranger");
		System.out.println("<5> Rogue");
		System.out.println("<6> Warlock");
		System.out.println("<7> Warlord");
		System.out.println("<8> Wizard");

		System.out.println("Enter a number: ");
		option2 = input2.nextInt();

		switch (option2){

		case 1:
			selection.ClassSelect(1);
			break;
		case 2:
			selection.ClassSelect(2);
			break;
		case 3:
			selection.ClassSelect(3);
			break;
		case 4:
			selection.ClassSelect(4);
			break;
		case 5:
			selection.ClassSelect(5);
			break;
		case 6:
			selection.ClassSelect(6);
			break;
		case 7:
			selection.ClassSelect(7);
			break;
		case 8:
			selection.ClassSelect(8);
			break;
		default:
			System.out.println("Sorry that option is not available");

			//close input
			input2.close();

		}
	}

			Races races = new Races();
			Classes classes = new Classes();
			//Main Method

			public static void main(String[] args) {
				// TODO Auto-generated method stub


				//RACE SELECTION


				Scanner input = new Scanner (System.in);
				int option;
				RunCharacterCreator creator = new RunCharacterCreator();
				System.out.println("Choose your character race ");
				System.out.println("<1> Dragonborn");
				System.out.println("<2> Dwarf");
				System.out.println("<3> Elf");
				System.out.println("<4> Eladrin");
				System.out.println("<5> Half Elf");
				System.out.println("<6> Halfling");
				System.out.println("<7> Human");
				System.out.println("<8> Tiefling");

				System.out.println("Enter a number: ");
				option = input.nextInt();
				
			
				
				switch (option){

				case 1:
					creator.races.RaceSelect(1);
					break;
				case 2:
					creator.races.RaceSelect(2);
					break;
				case 3:
					creator.races.RaceSelect(3);
					break;
				case 4:
					creator.races.RaceSelect(4);
					break;
				case 5:
					creator.races.RaceSelect(5);
					break;
				case 6:
					creator.races.RaceSelect(6);
					break;
				case 7:
					creator.races.RaceSelect(7);
					break;
				case 8:
					creator.races.RaceSelect(8);
					break;
				default:
					System.out.println("Sorry that option is not available");
input.close();
				
					
					


				}

			}
		
	}