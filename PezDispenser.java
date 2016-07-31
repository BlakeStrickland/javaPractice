public class PezDispenser {
// set an immutable integer variable
  public final int MAX_PEZ = 12;

  private String mCharacterName;
// declare pez count
  private int mPezCount;
// decalre public class that takes in 1 argument
  public PezDispenser(String characterName) {
    mCharacterName = characterName;
    mPezCount = 0;
  }
// decalre a load method that returns nothing but sets count
  public void load() {
    mPezCount = MAX_PEZ;
  }
  // declare public method that returns a string object of the charater name
  public String getCharacterName() {
    return mCharacterName;
  }
}
