import character.Character;
import character.Warrior;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Character character = new Character();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Game!");
        System.out.println("Enter your character's name:");
        character.name = scanner.nextLine();

        System.out.println("Enter your character's name:");
        switch (scanner.nextLine()){
            case "warrior":
                character = new Warrior();
            case "mage":
        }

        character = new Warrior();

    }
}
