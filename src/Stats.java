public class Stats {
    private int hp;
    private int attack;
    private int defense;
    private int mana;

    public Stats(int hp, int attack, int defense, int mana) {
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.mana = mana;
    }

    public Stats(Stats other) {
        this.hp = other.hp;
        this.attack = other.attack;
        this.defense = other.defense;
        this.mana = other.mana;
    }

    public void addStats(Stats other) {
        this.hp += other.hp;
        this.attack += other.attack;
        this.defense += other.defense;
        this.mana += other.mana;
    }

    @Override
    public String toString() {
        return "HP: " + hp + ", Attack: " + attack + ", Defense: " + defense + ", Mana: " + mana;
    }

    public int getHP() { return hp; }

    public int getAttack() { return attack; }

    public int getDefense() { return defense; }

    public int getMana() { return mana; }
}
