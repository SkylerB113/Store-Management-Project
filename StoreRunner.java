import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    Nails firstNails = new Nails("Izzy", true, 50.75, "Medium", 3, "red");
    Hair coolHair = new Hair("Evie", true, 70.20, true, "blue");
    int input = 0;

    System.out.println("Welcome to Skyler's Beauty Salon!");

    while(input >= 0) {
      System.out.println("To book a nail appointment press 1, to book a hair appointment press 2!");
      input = a.nextInt();
      a.nextLine();

      if(input == 1) {
        System.out.print("What nail length do you want?");
        String lengthInput = a.nextLine();
        firstNails.setLength(lengthInput);
        System.out.println("great " + firstNails.getLength() + " size nails!");
        System.out.println("Summary: " + firstNails.toString());
      } else if (input == 2) {
        System.out.print("What dye color do you want?");
        String dyeColorInput = a.nextLine();
        coolHair.setDyeColor(dyeColorInput);
        System.out.println("I love " + coolHair.getDyeColor() + " hair!");
        System.out.println("Summary: " + coolHair.toString());
        
      }
        
    }
    
  }
}