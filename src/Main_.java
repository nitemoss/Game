import character.Character;

import java.sql.Array;
import java.util.Scanner;
public class Main_ {

    public static void main(String[] args) {
//        JsonParser parser = new JSONParser();

        Character character = new Character();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Game!");
        System.out.println("Enter your character's name:");
        String name = scanner.nextLine();

        System.out.println("Type of your character? (warrior/mage/ranger):");
        String charType = scanner.nextLine();
        character.setCharacterType(charType);

        System.out.println("Race of your character? (orc/elf/human/undead):");
        String race = scanner.nextLine();
        character.setRace(race);

        System.out.println("Your character applied!");

        while(true){
            System.out.println("Day 1");
        }
    }
}
