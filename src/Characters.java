public interface Characters {
    void EquipAccessory(Accessory accessory);
    void unEquipAccessory(Accessory accessory);
    void printStatus();
    Stats stats();
    String getName();
    void levelUp();
    int getLevel();
}

