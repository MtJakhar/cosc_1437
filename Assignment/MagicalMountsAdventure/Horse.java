package MagicalMountsAdventure;

public class Horse extends MagicalMount {
  public Horse() throws InvalidLegCountException, InvalidSpeedException {
    super(50, 4);
  }

  public Horse(int speed, int legs) throws InvalidLegCountException, InvalidSpeedException {
    super(speed, legs);
  }
}
