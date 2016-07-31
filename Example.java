// Create class Example
public class Example {
  // declare main function that returns nothing and takes arbitrary arguments
    public static void main(String[] args) {

        System.out.println("NEW PEZ DISPENSER!!!!!!");
        //Create new PezDispenser object
        PezDispenser dispenser = new PezDispenser("Leoardo");
        //Call name method on new object
        System.out.printf("The character is %s \n", dispenser.getCharacterName());
        //Notify user if empty
        if (dispenser.isEmpty()){
          System.out.println("Currently Empty");
        }
        //Load pez dispenser
        System.out.println("Loading...");
        dispenser.load();
        //NOTIFY YOU FULL
        if (!dispenser.isEmpty()) {
          System.out.println("FULL!");
        }



    }
}
