
public class Classes {
	




//class selection method
			public void ClassSelect(int Class){
		
				RunCharacterCreator creator = new RunCharacterCreator();
				
				
				
				//cleric
				if (Class == 1){
					System.out.println("You have chosen the Cleric");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Role: Leader. You lead by shielding your allies with your prayers, healing, and using powers that improve your allies' attacks.");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Power Source: Divine. You have been invested with the authority to wield divine power on behalf of a deity, faith, or philosophy");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Key Abilities: Wisdom, Strength, Charisma");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Armor Proficiencies:  Cloth, leather, hide, chainmail");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Weapon Proficiencies: Simple melee, simple ranged");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Implement: Holy Symbol");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Bonus to Defense: +2 Will");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Hit Points at 1st Level: 12 + Constitution score");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Hit Points per Level Gained: 5");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Healing Surges per Day: 7 + Constitution modifier");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Build Options: Battle cleric, devoted cleric, shielding cleric");
					 
					creator.ClassSelection = "Cleric";
					creator.PerLevel = 5;
					creator.HitPoints = creator.constitution + 12;
					creator.surges = "7 + constitution modifier";
					
					 
					
				}
				//fighter
				else if (Class == 2){
					System.out.println("You have chosen the Fighter");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Role: Defender. You are very tough and have the exceptional ability to contain enemies in melee.");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Power Source: Martial. You have become a master of combat through endless hours of practice, determination, and your own sheer physical toughness.");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Key Abilities: Strength, Dexterity, Wisdom, Constitution");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Armor Proficiencies: Cloth, leather, hide, chainmail, scale; light shield, heavy shield");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Weapon Proficiencies: Simple melee, military melee, simple ranged, military ranged");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Bonus to Defense : +2 Fortitude");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Hit Points at 1st Level: 15 + Constitution score");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Hit Points per Level Gained: 6");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Healing Surges per Day: 9 + Constitution modifier");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					System.out.println("Build Options: Great weapon fighter, Guardian fighter, Battlerager fighter, Tempest fighter, Brawler fighter.");

					creator.ClassSelection = "Fighter";
					creator.PerLevel = 6;
				    creator.HitPoints = creator.constitution + 15;
				    creator.surges = "9 + constitution modifier";
					
				}
				//paladin
				else if (Class == 3){
					System.out.println("You have chosen the Paladin");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Role: Defender. You are extremely durable, with high hit points and the ability to wear the heaviest armor. You can issue bold challenges to foes and compel them to fight you rather than your allies.");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Power Source: Divine. You are a divine warrior, a crusader and protector of your faith.");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Key Abilities: Strength, Charisma, Wisdom");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Armor Proficiencies: Cloth, leather, hide, chainmail, scale, plate; light shield, heavy shield");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Weapon Proficiencies: Simple melee, military melee, simple ranged");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Bonus to Defense: +1 Fortitude, +1 Reflex, +1 Will");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Hit Points at 1st Level: 15 + Constitution score");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Hit Points per Level Gained: 6");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Healing Surges per Day: 10 + Constitution modifierr");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Build Options: Avenging paladin (PHB), Protecting paladin (PHB), Ardent paladin (DP), Virtuous paladin (DP).");
					 
					creator.ClassSelection = "Paladin";	
					creator.PerLevel = 6;
					creator.HitPoints = creator.constitution + 15;
					creator.surges = "10 + constitution modifier";
					
				}
				//ranger
				else if (Class == 4){
					System.out.println("You have chosen the Ranger");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Role: Striker. You combine fast, hard-hitting melee attack power with excellent ranged attack ability, and shift easily from melee to ranged combat. You are moderately resilient in battle, but you prefer hit-and-run attacks or ambushes to prolonged slugging matches. Hit hard, get out; that’s the ranger’s way");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Key Abilities: Strength, Dexterity, Wisdom");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Armor Proficiencies: cloth, leather, and hide");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Weapon Proficiencies: simple melee, military melee, simple ranged, and military ranged");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Bonus to Defense: +1 Fortitude");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Hit Points at 1st Level: 12 + Constitution score");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Hit Points per Level Gained: 5");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Healing Surges per Day: 6 + Constitution modifier");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Build Options: Archer ranger, Two-blade ranger, Beast Master");
					
					creator.ClassSelection = "Ranger";
					creator.PerLevel = 5;
					creator.HitPoints = creator.constitution + 12;
					creator.surges = "6 + constitution modifier";
					
				}
				//rogue
				else if (Class == 5){
					System.out.println("You have chosen the Rogue");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Role: Striker. You dart in to attack, do massive damage, and then retreat to safety. You do best when teamed with a defender to flank enemies.");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Power Source: Martial. Your talents depend on extensive training and constant practice, innate skill, and natural coordination.");
				
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Key Abilities: Dexterity, Strength, Charisma");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Armor Proficiencies: Cloth, Leather");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Weapon Proficiencies: dagger, hand crossbow, shortbow (thief only), shuriken (original rogue only), sling, short sword");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Bonus to Defense: +2 Reflex");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Hit Points at 1st Level: 12 + Constitution score");
				
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Hit Points per Level Gained: 5");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Healing Surges per Day: 6 + Constitution modifier");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Build Options: Brawny Rogue, Trickster Rogue");
					 
					creator.ClassSelection = "Rogue";
					creator.PerLevel = 5;
					creator.HitPoints = creator.constitution + 12;
					creator.surges = "6 + constitution modifier";
					
				}
				//warlock
				else if (Class == 6){
					System.out.println("You have chosen the Warlock");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Key Abilities: Charisma, Constitution, Intelligence");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Armor Proficiencies: cloth and leather armor proficiencies");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Weapon Proficiencies: simple melee and simple ranged");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Bonus to Defense: +1 Fortitude");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Hit Points at 1st Level: 12 + Constitution score");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Hit Points per Level Gained: 5");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Healing Surges per Day: 6 + Constitution modifier");
					 
					creator.ClassSelection = "Warlock";
					creator.PerLevel = 5;
					creator.HitPoints = creator.constitution + 12;
					
					creator.surges = "6 + constitution modifier";
					
				}
				//warlord
				else if (Class == 7){
					System.out.println("You have chosen the Warlord");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Key Abilities: Charisma, Constitution, Intelligence");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Armor Proficiencies: cloth, leather, hide, chainmail, and light shield");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("simple melee, military melee, and simple ranged");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Bonus to Defense: +1 Fortitude and Will");
				
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Hit Points at 1st Level: 12 + Constitution score");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Hit Points per Level Gained: 5");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Healing Surges per Day: 7 + Constitution modifier");
					 
					creator.ClassSelection = "Warlord";
					creator.PerLevel = 5;
					creator.HitPoints = creator.constitution + 12;
					creator.surges = "7 + constitution modifier";
				
				}
				//wizard
				else if (Class == 8){
					System.out.println("You have chosen the Wizard");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Key Abilities: Intelligence, Wisdom, Dexterity");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Armor Proficiencies: cloth");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Weapon Proficiencies: Quarterstaff");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Bonus to Defense: +2 Will");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Hit Points at 1st Level: 10 + Constitution score");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Hit Points per Level Gained: 4");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Healing Surges per Day: 6 + Constitution modifier");
					
					creator.ClassSelection = "Wizard";
					creator.PerLevel = 5;
					creator.HitPoints = creator.constitution + 10;
					creator.surges = "6 + constitution modifier";
					
				}
				
				creator.StatSelection();
				
			}
			
	}


