public class Main {
    public static void main(String[] args) {
        Characters wizard = new Class_Wizard("Gandalf",1);
        Characters priest = new Class_Priest("Alice",1);

        Accessory Homa_staff = new Weapon_Staff("Homa",1,new Stats(0,25,0,30));
        Accessory Eden_staff = new Weapon_Staff("Eden",1,new Stats(10,10,5,30));

        System.out.println("Display stats");
        wizard.printStatus();
        priest.printStatus();

        System.out.println("\nEquip accessories to characters\n");
        wizard.EquipAccessory(Homa_staff);
        priest.EquipAccessory(Eden_staff);
        wizard.levelUp();
        Homa_staff.levelUp();
        priest.levelUp();
        Eden_staff.levelUp();

        System.out.println("\nDisplay stats after equipping accessories");
        wizard.printStatus();
        priest.printStatus();

        Accessory Exorcisms = new Weapon_Shield("Exorcisms",1,new Stats(20,0,10,25));

        System.out.println("\nDisplay stats after equipping accessories again");
        priest.unEquipAccessory(Eden_staff);
        priest.EquipAccessory(Exorcisms);
        priest.printStatus();
    }
}