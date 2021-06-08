package character;

import java.util.ArrayList;

public class Warrior extends Character {
    public Warrior() {

        this.health = 120;
//        this.characterAttributes = new ArrayList<CharacterAttributes>();
        characterAttributes.add(CharacterAttributes.Wisdom);
    }
}
