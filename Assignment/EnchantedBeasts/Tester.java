package EnchantedBeasts;

import java.util.ArrayList;

public class Tester {
  public static void main(String[] args) {
    ArrayList<EnchantedBeast> EnchantedForest = new ArrayList<>();
    try {
      Phoenix moltres = new Phoenix("Moltres", 70, 300);
      InvisibleStalker watcher = new InvisibleStalker("The Watcher", 100, 100);
      Kraken squidward = new Kraken("Squidward", 50, 1000);
      FairyDragon faeDrogo = new FairyDragon("faeDrogo", 80, 500);

      EnchantedForest.add(faeDrogo);
      EnchantedForest.add(watcher);
      EnchantedForest.add(squidward);
      EnchantedForest.add(moltres);
    } catch (InvalidMagicalPowerException e) {
      System.out.println(e.getMessage());
    }
    for (EnchantedBeast beast : EnchantedForest) {
      beast.useAbility();
    }

  }
}
