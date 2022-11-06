package testground.adventurer.interfaces;

import testground.adventurer.models.adventurers.Adventurer;

public interface AdventurerFactory {
  public static Adventurer trainAdventurer() {
    return new Adventurer();
  };
}
