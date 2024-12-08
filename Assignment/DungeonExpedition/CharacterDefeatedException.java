package DungeonExpedition;

public class CharacterDefeatedException extends Exception {
  public CharacterDefeatedException() {
    super("You have been killed!");
  }
}
