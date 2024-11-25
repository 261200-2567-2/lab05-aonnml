import java.util.ArrayList;
import java.util.List;

public class Class_Wizard implements Characters {
    private String name;
    private Stats baseStats;
    private Stats accessoryBonus;
    private List<Accessory> equippedAccessories;
    private int level;

    public Class_Wizard(String name,int level) {
        this.name = name;
        this.baseStats = new Stats(120, 30, 20, 100);
        this.accessoryBonus = new Stats(0, 0, 0, 0);
        this.equippedAccessories = new ArrayList<>();
        this.level = level;
    }

    @Override
    public void EquipAccessory(Accessory accessory) {
        if (equippedAccessories.size() < 3) {
            equippedAccessories.add(accessory);
            System.out.println(name + " equipped " + accessory.getName() + "!");
            this.accessoryBonus.addStats(accessory.getStats());
        } else {
            System.out.println(name + " cannot equip more than 3 accessories!");
        }
    }

    @Override
    public void unEquipAccessory(Accessory accessory) {
        if (equippedAccessories.contains(accessory)) {
            equippedAccessories.remove(accessory);
            System.out.println(name + " unequipped " + accessory.getName() + "!");
            this.accessoryBonus.addStats(new Stats(
                    -accessory.getStats().getHP(),
                    -accessory.getStats().getAttack(),
                    -accessory.getStats().getDefense(),
                    -accessory.getStats().getMana()
            ));
        } else {
            System.out.println(name + " does not have " + accessory.getName() + " equipped!");
        }
    }

    @Override
    public Stats stats() {
        Stats finalStats = new Stats(baseStats);
        finalStats.addStats(accessoryBonus);
        return finalStats;
    }

    @Override
    public void printStatus() {
        Stats stats = stats();
        System.out.println("\n" + name + "'s Stats (Wizard):");
        System.out.println(stats);
        System.out.println("Level: " + level);

        if (equippedAccessories.isEmpty()) {
            System.out.println("Equipped Accessories: None");
        } else {
            System.out.println("Equipped Accessories:");
            for (Accessory accessory : equippedAccessories) {
                System.out.println("- " + accessory.getName() + " Level: " + accessory.getLevel());
            }
        }
    }

    @Override
    public void levelUp() {
        level++;
        System.out.println(name + " leveled up to Level " + level + "!");
        baseStats.addStats(new Stats(20, 5, 5, 10));
    }

    @Override
    public String getName() { return name;}

    @Override
    public int getLevel() { return level; }
}
