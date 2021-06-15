import character.Character;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//        JsonParser parser = new JSONParser();

        Character character = new Character();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Game!");
        System.out.println("Enter your character's name:");
        String name = scanner.nextLine();

        System.out.println("Type of your character? (warrior/mage):");
        switch (scanner.nextLine()){
            case "warrior":
                character = new Warrior();
            case "mage":
                character
        }

        character = new Warrior();

    }
}
