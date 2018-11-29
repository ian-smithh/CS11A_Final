/**
 * Calls each of the MadLibs classes based on a randomly generated number.
 * 
 * @author CERN (Group 13)
 */
public class MadLibs {
  /**
   * Runs a random number generator and calls a Madlib class based on the result.
   * 
   * @param args Main method does not accept input from args.
   */
  public static void main(String[] args) {

    int rand = (int) (8 * Math.random());

    switch (rand) {

    case 0:
      Hanukkah.main(args);
      break; // Nick
    case 1:
      Christmas.main(args);
      break; // Ian
    case 2:
      Thanksgiving.main(args);
      break; // Sarah
    case 3:
      NewYears.main(args);
      break; // Rafi
    case 4:
      ValentinesDay.main(args);
      break; // Nick
    case 5:
      Halloween.main(args);
      break; // Rafi
    case 6:
      July4th.main(args);
      break; // Sarah
    case 7:
      Passover.main(args);
      break; // Sarah
    default:
      System.out.println("There is no MadLib");
      break;
    }

  }
}
