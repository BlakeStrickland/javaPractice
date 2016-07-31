// Create class Example
public class Example {
  // declare main function that returns nothing and takes arbitrary arguments
    public static void main(String[] args) {

        System.out.println("NEW PEZ DISPENSER!!!!!!");
        //Create new PezDispenser object
        PezDispenser dispenser = new PezDispenser("Leoardo");
        //Call name method on new object
        System.out.printf("The character is %s \n", dispenser.getCharacterName());
    }
}
