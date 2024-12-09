package AdventureSimulation;

import java.util.ArrayList;
import java.util.Random;

public class Tester {
  public static void main(String[] args) {
    ArrayList<Adventurer> partyOfAdventurers = new ArrayList<Adventurer>(5);

    createRandomParty(partyOfAdventurers);
    checkPartyReadiness(partyOfAdventurers);

  }

  public static Adventurer createAdventurer() {
    Random randomNumber = new Random();

    String[] fantasyNames = {
        "Alaric", "Thalion", "Eryndor", "Kaelen", "Doran",
        "Vaelen", "Garrick", "Finnian", "Torvyn", "Brennus",
        "Lyara", "Elysia", "Seraphine", "Aveline", "Caelira",
        "Nymeria", "Velaris", "Isolde", "Selene", "Arieth"
    };

    int randomLevel = randomNumber.nextInt(20) + 1;
    int randomHealth = randomNumber.nextInt(100) + 1;
    int randomClass = randomNumber.nextInt(3) + 1;
    int randomName = randomNumber.nextInt(20);

    Adventurer newCharacter = null;

    try {
      switch (randomClass) {
        case 1:
          newCharacter = new Warrior(fantasyNames[randomName], randomHealth, randomLevel);
          break;
        case 2:
          newCharacter = new Mage(fantasyNames[randomName], randomHealth, randomLevel);
          break;
        case 3:
          newCharacter = new Rogue(fantasyNames[randomName], randomHealth, randomLevel);
          break;
      }
    } catch (HealthTooLowException | InvalidLevelException e) {
      System.out.println(e.getMessage());
    }

    if (newCharacter == null) {
      System.out.println("Error: New character could not be assigned, new character is now null");
    }

    return newCharacter;
  }

  public static void createRandomParty(ArrayList<Adventurer> party) {
    for (int i = 0; i < 5; i++) {
      Adventurer randCharacter = createAdventurer();
      party.add(randCharacter);
      System.out.println(randCharacter.getName() + " the " + randCharacter.getRole() + " has been added to the party");
    }
  }

  public static void checkPartyReadiness(ArrayList<Adventurer> party) {
    for (int i = 0; i < party.size(); i++) {
      String statement = "";
      if (party.get(i).checkReadiness() == true) {
        statement = " is ready";
      } else {
        statement = " is not ready";
      }
      System.out.println(party.get(i).getName() + statement);
    }
  }
}
