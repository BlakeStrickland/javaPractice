public class PezDispenser {
// set an immutable integer variable
  public final int MAX_PEZ = 12;

  private String mCharacterName;
// declare pez count
  private int mPezCount;
// declare public class that takes in 1 argument
  public PezDispenser(String characterName) {
    mCharacterName = characterName;
    mPezCount = 0;
  }
//declare public dispense method
  public boolean dispense() {
    boolean wasDispensed = false;
    if (!isEmpty()) {
      mPezCount--;
      wasDispensed = true;
    }
    return wasDispensed;
  }

// declare public method to check if empty
  public boolean isEmpty() {
    return mPezCount == 0;
  }

// decalre a load method that returns nothing but sets count
  public void load() {
    load(MAX_PEZ);
  }

  public void load(int pezAmount) {
    int newAmount = mPezCount + pezAmount;
    if (newAmount > MAX_PEZ) {
      throw new IllegalArgumentException("Too Manyz");
    }
    mPezCount = newAmount;
  }
  // declare public method that returns a string object of the charater name
  public String getCharacterName() {
    return mCharacterName;
  }
}
