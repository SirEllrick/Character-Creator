
public class Races {

	//character selection method
	
	public static String RaceSelection;
	public static int speed;
	
		public void RaceSelect(int Race){
			RunCharacterCreator creator = new RunCharacterCreator();
			
		
			
			if (Race == 1){
				System.out.println("You have chosen the Dragonborn");
				System.out.println("Preffered classes: Fighter, Paladin, Warlord");
				System.out.println("");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Skill Bonuses:");
				System.out.println("+2 History");
				System.out.println("+2 Intimidate");
				System.out.println("");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Ability Scores");
				System.out.println("+2 Strength");
				System.out.println("+2 Charisma");
				 RaceSelection = "Dragonborn";
				 speed = 6;
				 
			}
			else if (Race == 2){
				System.out.println("You have chosen the Dwarf");
				System.out.println("Preffered Classes: Cleric, Fighter, Paladin");
				System.out.println("");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Skill Bonuses:");
				System.out.println("+2 Dungeoneering");
				System.out.println("+2 Endurance");	
				System.out.println("");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Ability Scores");
				System.out.println("+2 Constitution");
				System.out.println("+2 Wisdom");
				RaceSelection = "Dwarf";
				speed = 5;
				
				
			}
			else if (Race == 3){
				System.out.println("You have chosen the Elf");
				System.out.println("Preffered Classes: Cleric, Ranger, Rogue, Wizard");
				System.out.println("");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Skill Bonuses:");
				System.out.println("+2 Arcana");
				System.out.println("+2 History");
				System.out.println("");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Ability Scores:");
				System.out.println("+2 Dexterity");
				System.out.println("+2 History");
				RaceSelection = "Elf";
				speed = 7;
				
				
			}
			else if (Race == 4){
				System.out.println("You have chosen the Eladrin");
				System.out.println("Preffered Classes: Wizard, Rogue, Warlock, Warlord, Ranger");
				System.out.println("");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Skill Bonuses:");
				System.out.println("+2 Dungeoneering");
				System.out.println("+2 Endurance");
				System.out.println("");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Ability Scores:");
				System.out.println("+2 Dexterity");
				System.out.println("+2 Intelligence");
				RaceSelection = "Eladrin";
				
				speed = 6;
			}
			else if (Race == 5){
				System.out.println("You have chosen the Half Elf");
				System.out.println("Preffered Classes: Paladin, Warlock, Warlord");
				System.out.println("");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Skill Bonuses:");
				System.out.println("+2 Diplomacy");
				System.out.println("+2 Insight");
				System.out.println("");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Ability Scores:");
				System.out.println("+2 Dexterity");
				System.out.println("+2 Charisma");
				RaceSelection = "Half Elf";
				speed = 6;
				
			}
			else if (Race == 6){
				System.out.println("You have chosen the Halfling");
				System.out.println("Preffered Classes: Ranger, Rogue, Warlock");
				System.out.println("");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Skill Bonuses:");
				System.out.println("+2 Acrobatics");
				System.out.println("+2 Thieving");
				System.out.println("");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Ability Scores:");
				System.out.println("+2 Dexterity");
				System.out.println("+2 Charisma");
				RaceSelection = "Halfling";
				speed = 6;
				
			}
			else if (Race == 7){
				System.out.println("You have chosen the Human");
				System.out.println("Preffered Classes: Any. Humans are very veratile.");
				System.out.println("");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Skill Bonuses:");
				System.out.println("You gain training in one additional skill of your choice");
				System.out.println("");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Ability Scores:");
				System.out.println("+2 to any ability of your choice");
				RaceSelection = "Human";
				speed = 6;
				
			}
			else if (Race == 8){
				System.out.println("You have chosen the Tiefling");
				System.out.println("Preffered Classes: Rogue, Warlock, Warlord");
				System.out.println("");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Skill Bonuses:");
				System.out.println("+2 Bluff");
				System.out.println("+2 Stealth");	
				System.out.println("");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Ability Scores:");
				System.out.println("+2 Intelligence");
				System.out.println("+2 Charisma");
				RaceSelection = "Tiefling";
				speed = 6;
				
				
			}
			
			System.out.println("");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			creator.ClassSelection();
			
		}
		
}
