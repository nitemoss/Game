package character;

import java.util.ArrayList;

public class Character {
    public String name;

    public ArrayList<CharacterAttributes> characterAttributes;
    public Race race;

    public int health = 100;
    public int mana = 100;

    public static void makeAttack(){

    }
    public static void makeDefense(){

    }
    public static void levelUp(){

    }

    public void setCharacterAttributes(CharacterAttributes characterAttribute) {
        this.characterAttributes.add(characterAttribute);
    }
}
