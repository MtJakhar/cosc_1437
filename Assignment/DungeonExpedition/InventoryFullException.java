package DungeonExpedition;

public class InventoryFullException extends Exception {
  public InventoryFullException() {
    super("OverEncumbered: Your inventory exceeds 5 items.");
  }
}
