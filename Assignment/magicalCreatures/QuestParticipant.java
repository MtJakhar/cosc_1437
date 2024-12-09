package magicalCreatures;

public interface QuestParticipant {
  public void completeQuest(String questName);

  boolean hasCompletedQuest(String questName);
}
