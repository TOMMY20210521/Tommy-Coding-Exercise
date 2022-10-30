package com.testground.adventurer.interfaces;

import com.testground.adventurer.models.adventurers.Adventurer;

public interface AdventurerFactory {
  public static Adventurer trainAdventurer() {
    return new Adventurer();
  };
}
