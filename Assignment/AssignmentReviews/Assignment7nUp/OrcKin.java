package AssignmentReviews.Assignment7nUp;

public interface OrcKin {
  String race = "Orckin";

  public default void doEvil() {
    killInnocent();
    offerSacrifice();
  }

  private void killInnocent() {
    System.out.println("You kill someone who has not done you any wrong.");
  }

  private void offerSacrifice() {
    System.out.println("You offer the innocent to you evil god. You gain +4 to all stats.");
  }

  public void eatCorpse();

  public void servantOfDarkness();
}
