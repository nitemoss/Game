package character;

public enum CharacterAttributes {
    Strength(1),
    Intelligence(2),
    Dexterity(3),
    Defense(4),
    Vitality(5),
    Wisdom(6);

    private final int attributeNumber;

    CharacterAttributes(int attributeNumber) {
        this.attributeNumber = attributeNumber;
    }
}
