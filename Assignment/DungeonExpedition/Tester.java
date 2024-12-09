package DungeonExpedition;

public class Tester {
  public static void main(String[] args) {
    Dungeon shadowFortress = new Dungeon("Shadow Fortress");
    String[] items = { "Food", "Weapon", "Magic Weapon", "Rope", "sleeping bag" };

    try {
      Ranger aragorn = new Ranger("Aragorn", 3);
      shadowFortress.addCharacter(aragorn);
      Wizard gandalf = new Wizard("Gandalf", 5);
      shadowFortress.addCharacter(gandalf);
      Fighter sam = new Fighter("Sam", 10);
      shadowFortress.addCharacter(sam);

      try {
        for (String item : items) {
          aragorn.addItem(item);
          gandalf.addItem(item);
          sam.addItem(item);
        }

        sam.addItem("Second Breakfast");

      } catch (InventoryFullException e) {
        System.out.println(e.getMessage());
      }

      shadowFortress.startDungeon();

    } catch (InvalidLevelException e) {
      System.out.println(e.getMessage());
    }
  }
}
