package GuildManagement;

import java.util.ArrayList;

public class Guild {
  private String guildName;
  private ArrayList<Adventurer> guildAdventurers;

  public Guild(String guildName) {
    this.guildAdventurers = new ArrayList<Adventurer>();
    this.guildName = guildName;
  }

  // methods
  public void recruitAdventurer(Adventurer adventurer) {
    this.guildAdventurers.add(adventurer);
  }

  public void listAdventurers() {
    System.out.println("Here are the guild members: ");
    for (Adventurer guildMember : guildAdventurers) {
      System.out.printf("Name: %s\nLevel: %d\nClass: %s", guildMember.getName(), guildMember.getLevel(),
          guildMember.getClassType());
    }
  }

  public void startQuest() {
    for (Adventurer guildMember : guildAdventurers) {
      System.out.print(guildMember.getName() + " declares, ");
      guildMember.performAction();
    }
  }
}
