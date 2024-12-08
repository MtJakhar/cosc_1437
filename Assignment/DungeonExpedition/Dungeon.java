package DungeonExpedition;

import java.util.ArrayList;
import java.util.Random;

public class Dungeon {
  private String dungeonName;
  private ArrayList<Character> adventuringParty = new ArrayList<Character>();

  public Dungeon(String dungeonName) {
    this.dungeonName = dungeonName;
  }

  // method
  public void addCharacter(Character character) {
    adventuringParty.add(character);
  }

  public String getDungeonName() {
    return dungeonName;
  }

  public void startDungeon() {
    Random randNumber = new Random();
    for (Character partyMember : adventuringParty) {
      int randomDamage = randNumber.nextInt(50) + 1;
      partyMember.action();
      try {
        partyMember.takeDamage(randomDamage);
      } catch (CharacterDefeatedException e) {
        System.out.println(e.getMessage());
      }
    }
  }

  public void endDungeon() {
    for (Character partyMember : adventuringParty) {
      System.out.println("Party Member: " + partyMember.getName() + "\nHealth: " + partyMember.getHealth() + "\nLevel: "
          + partyMember.getLevel());
    }
  }
}
