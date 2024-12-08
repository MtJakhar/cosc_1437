package GuildManagement;

import java.util.ArrayList;

public class Tester {
  public static void main(String[] args) {
    Guild silverDawn = new Guild("Silver Dawn");
    ArrayList<Adventurer> recruits = new ArrayList<Adventurer>();

    try {
      Mage gale = new Mage("Gale", 3);
      recruits.add(gale);
      Warrior karlach = new Warrior("Karlach", 3);
      recruits.add(karlach);
      Warrior laezel = new Warrior("Lae'zel", 3);
      recruits.add(laezel);
      Rogue asterion = new Rogue("Asterion", 3);
      recruits.add(asterion);
      Mage wyll = new Mage("Wyll", 3);
      recruits.add(wyll);
      // Mage tav = new Mage("Tav", 0);
      // recruits.add(tav);

    } catch (InvalidLevelException e) {
      System.out.println(e.getMessage());
    }

    for (Adventurer recruit : recruits) {
      silverDawn.recruitAdventurer(recruit);
    }

    silverDawn.listAdventurers();
    silverDawn.startQuest();

  }
}
