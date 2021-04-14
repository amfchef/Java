import java.util.Scanner;
import java.util.Random;

public class Main {

	String characterName;
	String weaponName;
	int weaponDamage;
	int hp;
	static int hammerMaximumDamage = 50;
	static int hammerMinimumDamage = 10;
	static int hammer = (int) (Math.random() * ((hammerMaximumDamage - hammerMinimumDamage) + 1)) + hammerMinimumDamage;
	static int magicWandMaximumDamage = 100;
	static int magicWandMinimumDamage = 0;
	static int magicWand = (int) (Math.random() * (magicWandMaximumDamage - magicWandMinimumDamage));
	Scanner scan = new Scanner(System.in);
	static Random randomize = new Random();

	public Main(String charName, int wDamage, int health, String wName) {
		characterName = charName;
		weaponName = wName;
		weaponDamage = wDamage;
		hp = health;
	}
	public void beingAttacked(String defenderName, String attackerName, int attackerWeaponDamage,
			String attackerWeaponName) {
		if (hp <= 0 || attackerWeaponName == "excalibur") {
			System.err.println(
					attackerName + " CANNOT ATTACK\nBecause " + attackerName + " got the " + attackerWeaponName);
		} else {
			System.out.println(attackerName + " STRIKES " + defenderName + " WITH A " + attackerWeaponName + " IT DOES "
					+ attackerWeaponDamage + " DAMAGE");
			hp = (hp - attackerWeaponDamage);
			System.out.println(defenderName + " HAS " + hp + " REMAINING HEALTH! ");
		}
	}
	public void drinkingHealingPotion() {
		int healingPotion = 20;
		hp = hp + healingPotion;
		System.out.println(characterName + " GAINED " + healingPotion + " HEALTH BY DRINKING A HEALING POTION");
		System.out.println(characterName + " NOW HAS A HEALTH OF " + hp);
	}

	private static Main goodGuy = new Main("The Beast", hammer, 100, RandomWeaponGoodGuy());

	private static Main evilGuy = new Main("Ja'far", magicWand, 80, RandomWeaponEvilGuy(printWeaponName()));

	public static String printWeaponName() {

		String printWeaponName = goodGuy.weaponName;
		return printWeaponName;
	}

	public static String RandomWeaponGoodGuy() {
		String goodGuyWeapon = "";
		int goodGuy = 0;
		goodGuy = randomize.nextInt(3);

		switch (goodGuy) {
		case 1:
			goodGuyWeapon = "hammer";
			break;
		case 2:
			goodGuyWeapon = "magic wand";
			break;
		case 0:
			goodGuyWeapon = "excalibur";
		}
		return goodGuyWeapon;
	}

	public static String RandomWeaponEvilGuy(String goodGuyWeapon) {
		int randomNumWeapon = 0;
		boolean randomizeAgain = true;
		String evilGuyWeapon = "";
		while (randomizeAgain) {
			randomNumWeapon = randomize.nextInt(3);
			switch (randomNumWeapon) {
			case 1:
				evilGuyWeapon = "hammer";
				break;
			case 2:
				evilGuyWeapon = "magic wand";
				break;
			case 0:
				evilGuyWeapon = "excalibur";
				break;
			}
			if (evilGuyWeapon.equals(goodGuyWeapon)) {
				randomizeAgain = true;
			} else {
				randomizeAgain = false;
			}
		}
		return evilGuyWeapon;
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Main.goodGuy.beingAttacked(goodGuy.characterName, evilGuy.characterName, evilGuy.weaponDamage,
				evilGuy.weaponName);
		Main.evilGuy.beingAttacked(evilGuy.characterName, goodGuy.characterName, goodGuy.weaponDamage,
				goodGuy.weaponName);

		goodGuy.drinkingHealingPotion();
		evilGuy.drinkingHealingPotion();
		boolean continyePlaying = true;

		String weaponName = "";
		while (continyePlaying) {
			System.out.println("Please enter a weapon of the following: [magic wand] [Hammer] [excalibur]");
			if (scan.hasNextLine()) {
				weaponName = scan.nextLine().toLowerCase();
				searchWeapon(weaponName);
				continyePlaying = false;
			} else {
				System.err.println("Error! \n invalid input");
			}
		}
	}
	public static void searchWeapon(String weaponSearchName) {
		Scanner scan = new Scanner(System.in);
		boolean continueLoop = true;

		while (continueLoop == true) {
			continueLoop = false;
			switch (weaponSearchName) {
			case "hammer":
				if (goodGuy.weaponName.equals(weaponSearchName)) {
					System.out.println(goodGuy.characterName + " has this weapon " + goodGuy.weaponName);
					continueLoop = false;
				}
				if (evilGuy.weaponName.equals(weaponSearchName)) {
					System.out.println(evilGuy.characterName + " has this weapon " + evilGuy.weaponName);
					continueLoop = false;
				}
				else {
					System.err.println("The weapon was not found");
				}
				break;

			case "magic wand":
				if (goodGuy.weaponName.equals(weaponSearchName)) {
					System.out.println(goodGuy.characterName + " has this weapon " + goodGuy.weaponName);
					continueLoop = false;
				}
				if (evilGuy.weaponName.equals(weaponSearchName)) {
					System.out.println(evilGuy.characterName + " has this weapon " + evilGuy.weaponName);
					continueLoop = false;
				}
				else {
					System.err.println("The weapon was not found");
				}
				
				break;
			case "excalibur":
				if (goodGuy.weaponName.equals(weaponSearchName)) {
					System.out.println(goodGuy.characterName + " has this weapon " + goodGuy.weaponName);
					continueLoop = false;
				}
				if (evilGuy.weaponName.equals(weaponSearchName)) {
					System.out.println(evilGuy.characterName + " has this weapon " + evilGuy.weaponName);
					continueLoop = false;
				}
				else {
					System.err.println("The weapon was not found");
				}
				break;
			default:
				System.err.println("The weapon was not found");
				System.out.println("Would you like to try again? Press [Y]");
				
				if (scan.hasNextLine()) {
					String tryAgain = scan.nextLine().toLowerCase().trim();

					if (tryAgain.equals("y")) {
						System.out.println("Please enter a weapon of the following: [magic wand] [Hammer] [excalibur]");
						if (scan.hasNextLine()) {
							weaponSearchName = scan.nextLine();
							continueLoop = true;
						}
					} else {
						continueLoop = false;
					}
				}

			}
		}
	}
}