package testground.adventurer.models.adventurers;

public class Adventurer {
  private String name;

  public Adventurer() {
    this.name = "Adventurer";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Adventurer println() {
    System.out.println("This is a " + this.name);
    return this;
  }
}
