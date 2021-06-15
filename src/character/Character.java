package character;

import java.io.IOException;
import java.util.HashMap;

public class Character {
    public String name;
    public int level = 1;
    public int experience = 300;

    public CharacterAttribute characterAttribute;

    private Race race;

    private CharacterType characterType;

    public int health = 100;
    public int mana = 100;




    public static void makeAttack(){

    }
    public static void makeDefense(){

    }
    public static void levelUp(){

    }

    public CharacterType getCharacterType() {
        return characterType;
    }

    public void setCharacterType(CharacterType characterType) {
        HashMap<String, CharacterType> typeMap = new HashMap<String, CharacterType>();
        typeMap.put("warrior", CharacterType.Warrior);
        typeMap.put("mage", CharacterType.Mage);
        typeMap.put("ranger", CharacterType.Ranger);
        
    }

    public void setRace(String race) {
        HashMap<String, Race> raceMap = new HashMap<String, Race>();
        raceMap.put("human", Race.Human);
        raceMap.put("elf", Race.Elf);
        raceMap.put("orc", Race.Orc);
        raceMap.put("undead", Race.Undead);

        this.race = raceMap.get(race);

    }

    public void setCharacterAttribute(String characterAttribute, Integer value) {
//        this.characterAttributes.add(characterAttribute);
        switch (characterAttribute){
            case "intelligence":
                this.characterAttribute.intelligence = value;
            case "dexterity":
                this.characterAttribute.dexterity = value;
            case "defense":
                this.characterAttribute.defense = value;
            case "wisdom":
                this.characterAttribute.wisdom = value;
            case "strength":
                this.characterAttribute.strength = value;
            case "vitality":
                this.characterAttribute.vitality = value;
            default:

                return;

        }
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", experience=" + experience +
                ", characterAttribute=" + characterAttribute +
                ", race=" + race +
                ", characterType=" + characterType +
                ", health=" + health +
                ", mana=" + mana +
                '}';
    }
}
