public class Weapon_Shield implements Accessory{
    private Stats stats;
    private String name;
    private int level;

    public Weapon_Shield(String name,int level, Stats stats) {
        this.stats = stats;
        this.name = name;
        this.level = level;
    }

    @Override
    public void levelUp() {
        level++;
        System.out.println(name + " upgraded to Level " + level + "!");
        stats.addStats(new Stats(5, 1, 5, 10));
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public Stats getStats() {
        return stats;
    }

    @Override
    public int getLevel() { return level; }
}
